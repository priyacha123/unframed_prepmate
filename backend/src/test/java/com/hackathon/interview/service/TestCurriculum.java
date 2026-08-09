package com.hackathon.interview.service;

import com.hackathon.interview.model.CurriculumDay;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * In-code mirror of {@code src/main/resources/curriculum.json} (the canonical AI
 * Cohort curriculum, days 1-31) so the engine can be exercised in tests without
 * Jackson or the classpath resource. Keep this file in sync with curriculum.json —
 * the day numbers/titles here are what the engine grounds questions in.
 */
public final class TestCurriculum {

    private TestCurriculum() {
    }

    public static Map<Integer, CurriculumDay> all() {
        Map<Integer, CurriculumDay> map = new LinkedHashMap<>();
        map.put(1, day(1, "What is AI and how machines learn", "concept", List.of("Python"),
                "Define AI, ML and the learning loop", "Explain how data trains a model"));
        map.put(2, day(2, "Python basics", "workshop", List.of("Python", "Jupyter"),
                "Variables, control flow, functions", "Read and write small Python programs"));
        map.put(3, day(3, "Python data structures", "workshop", List.of("Python"),
                "Use lists, dicts, sets, tuples", "Comprehensions and common patterns"));
        map.put(4, day(4, "Python foundations project", "project", List.of("Python"),
                "Build a small CLI app", "Apply loops, functions and data structures"));
        map.put(5, day(5, "NumPy arrays", "concept", List.of("NumPy"),
                "Create and reshape arrays", "Vectorized computation"));
        map.put(6, day(6, "Pandas basics", "workshop", List.of("Pandas"),
                "Load CSVs into DataFrames", "Filter, group and aggregate"));
        map.put(7, day(7, "Data cleaning", "workshop", List.of("Pandas"),
                "Handle missing values and outliers", "Normalize and transform columns"));
        map.put(8, day(8, "Visualization", "workshop", List.of("Matplotlib", "Seaborn"),
                "Plot distributions and trends", "Choose the right chart for the message"));
        map.put(9, day(9, "Probability foundations", "concept", List.of("NumPy"),
                "Probability rules and independence", "Conditional probability and Bayes"));
        map.put(10, day(10, "Descriptive statistics", "concept", List.of("NumPy", "Pandas"),
                "Mean, median, variance, std", "Interpret distributions"));
        map.put(11, day(11, "Hypothesis testing", "workshop", List.of("SciPy"),
                "Null vs alternative hypothesis", "p-values and confidence intervals"));
        map.put(12, day(12, "ML pipeline and train/test split", "concept", List.of("scikit-learn"),
                "Understand the supervised learning loop", "Split data and avoid leakage"));
        map.put(13, day(13, "Regression", "workshop", List.of("scikit-learn"),
                "Fit linear regression", "Evaluate with MSE and R2"));
        map.put(14, day(14, "Classification", "workshop", List.of("scikit-learn"),
                "Logistic regression and decision trees", "Evaluate with accuracy, precision, recall"));
        map.put(15, day(15, "Overfitting and regularization", "concept", List.of("scikit-learn"),
                "Detect overfitting", "Apply regularization and cross-validation"));
        map.put(16, day(16, "ML model project", "project", List.of("scikit-learn"),
                "Train and tune a model end-to-end", "Report metrics honestly"));
        map.put(17, day(17, "Perceptrons and MLPs", "concept", List.of("TensorFlow", "PyTorch"),
                "Neuron, weights, activation", "Forward pass and layers"));
        map.put(18, day(18, "Backpropagation and training", "concept", List.of("TensorFlow", "PyTorch"),
                "Loss, gradient descent, backprop", "Learning rate and convergence"));
        map.put(19, day(19, "Building a neural network", "workshop", List.of("TensorFlow", "PyTorch"),
                "Define and train an MLP", "Tune epochs and batch size"));
        map.put(20, day(20, "Deep learning project", "project", List.of("TensorFlow", "PyTorch"),
                "Train a small CNN", "Interpret validation curves"));
        map.put(21, day(21, "Text preprocessing", "workshop", List.of("NLTK", "spaCy"),
                "Tokenization, stopwords, lemmatization", "Bag-of-words and TF-IDF"));
        map.put(22, day(22, "Word embeddings", "concept", List.of("gensim"),
                "Dense vectors and similarity", "Word2Vec intuition"));
        map.put(23, day(23, "Transformers and attention", "concept", List.of("Hugging Face"),
                "Self-attention and context", "Why transformers beat RNNs"));
        map.put(24, day(24, "Working with LLMs", "workshop", List.of("Hugging Face", "Anthropic API"),
                "Token limits, system prompts, temperature", "Call an LLM from code"));
        map.put(25, day(25, "NLP project", "project", List.of("Hugging Face"),
                "Classify text with a transformer", "Evaluate and report results"));
        map.put(26, day(26, "Generative AI fundamentals", "concept", List.of("Anthropic API"),
                "How generative models work", "Text, image and multimodal output"));
        map.put(27, day(27, "Prompt engineering", "workshop", List.of("Anthropic API"),
                "System prompts and personas", "Structured output and few-shot prompting"));
        map.put(28, day(28, "RAG and agents", "concept", List.of("Anthropic API"),
                "Retrieval-augmented generation", "Tool use and simple agents"));
        map.put(29, day(29, "Serving ML models", "workshop", List.of("FastAPI", "Render"),
                "Expose a model via an API", "Deploy to a long-running server"));
        map.put(30, day(30, "Responsible AI", "concept", List.of(),
                "Bias, fairness and transparency", "Data privacy and safeguards"));
        map.put(31, day(31, "Capstone", "project", List.of("FastAPI", "Render"),
                "Ship an end-to-end AI feature", "Document decisions and limits"));
        return map;
    }

    private static CurriculumDay day(int day, String title, String type, List<String> tools,
                                     String... objectives) {
        return new CurriculumDay(day, title, type, tools, List.of(objectives));
    }
}
