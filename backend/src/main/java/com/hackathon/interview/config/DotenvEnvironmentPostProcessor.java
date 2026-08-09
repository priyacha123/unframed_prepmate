package com.hackathon.interview.config;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;

/**
 * Loads the local {@code .env} file into the Spring environment. Spring Boot does
 * not read {@code .env} files on its own, yet {@code .env} is the documented local
 * config contract (README / {@code .env.example}) — so without this the
 * {@code GEMINI_API_KEY} placed there is silently ignored.
 *
 * <p>The values are added as the <em>first</em> property source, so a local
 * {@code .env} entry wins over an inherited shell variable (e.g. a stray {@code PORT}
 * left in the terminal). In deployment there is no {@code .env} (it is gitignored),
 * so injected environment variables work normally.
 */
public class DotenvEnvironmentPostProcessor implements EnvironmentPostProcessor {

    private static final String FILE_NAME = ".env";
    private static final String SOURCE_NAME = "dotenvFile";

    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        Path dotenv = Paths.get(System.getProperty("user.dir"), FILE_NAME);
        if (!Files.isReadable(dotenv)) {
            return;
        }
        Map<String, Object> values = read(dotenv);
        if (!values.isEmpty()) {
            environment.getPropertySources().addFirst(new MapPropertySource(SOURCE_NAME, values));
        }
    }

    /** Parses simple {@code KEY=value} lines, ignoring blank lines and {@code #} comments. */
    private Map<String, Object> read(Path dotenv) {
        Map<String, Object> values = new LinkedHashMap<>();
        try {
            for (String line : Files.readAllLines(dotenv)) {
                String trimmed = line.trim();
                if (trimmed.isEmpty() || trimmed.startsWith("#")) {
                    continue;
                }
                int eq = trimmed.indexOf('=');
                if (eq <= 0) {
                    continue;
                }
                String key = trimmed.substring(0, eq).trim();
                String value = trimmed.substring(eq + 1).trim();
                values.put(key, stripQuotes(value));
            }
        } catch (IOException ignored) {
            // If the file cannot be read, fall back to plain env vars.
        }
        return values;
    }

    private static String stripQuotes(String value) {
        if (value.length() >= 2) {
            if ((value.startsWith("\"") && value.endsWith("\""))
                    || (value.startsWith("'") && value.endsWith("'"))) {
                return value.substring(1, value.length() - 1);
            }
        }
        return value;
    }
}
