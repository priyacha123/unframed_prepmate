package com.hackathon.interview.service;

import com.hackathon.interview.model.Candidate;
import com.hackathon.interview.model.CandidateMember;
import com.hackathon.interview.model.CandidateMission;
import com.hackathon.interview.model.CandidateSignals;

import java.util.List;

/**
 * Sample candidates mirroring the frontend's hardcoded pool and
 * {@code candidates.json} (member/missions/signals shape). Each encodes
 * different weak-spot patterns for the selection logic. Mission days/titles
 * reference the real AI Cohort curriculum (see TestCurriculum).
 */
public final class TestCandidates {

    private TestCandidates() {
    }

    /** AI Engineer Trainee: skipped Probability (9) and Transformers (23), struggled on Pandas (6). */
    public static Candidate aiEngineer() {
        return new Candidate(
                new CandidateMember("AI Engineer Trainee", 1),
                List.of(
                        mission(3, "Python data structures", true, 1),
                        mission(6, "Pandas basics", false, 4),
                        skipped(9, "Probability foundations"),
                        mission(14, "Classification", true, 2),
                        mission(18, "Backpropagation and training", true, 3),
                        skipped(23, "Transformers and attention"),
                        mission(27, "Prompt engineering", true, 1)),
                new CandidateSignals(21, 15, 9));
    }

    /** ML Engineer: skipped Deep learning project (20), struggled on Overfitting (15). */
    public static Candidate webDeveloper() {
        return new Candidate(
                new CandidateMember("ML Engineer", 3),
                List.of(
                        mission(5, "NumPy arrays", true, 1),
                        mission(8, "Visualization", true, 1),
                        mission(13, "Regression", true, 2),
                        mission(15, "Overfitting and regularization", false, 4),
                        skipped(20, "Deep learning project"),
                        mission(25, "NLP project", true, 2)),
                new CandidateSignals(18, 11, 7));
    }

    /** Data Analyst: skipped Building a neural network (19), struggled on Hypothesis testing (11). */
    public static Candidate dataScientist() {
        return new Candidate(
                new CandidateMember("Data Analyst", 2),
                List.of(
                        mission(6, "Pandas basics", true, 1),
                        mission(11, "Hypothesis testing", false, 5),
                        mission(16, "ML model project", true, 2),
                        skipped(19, "Building a neural network"),
                        mission(24, "Working with LLMs", true, 2)),
                new CandidateSignals(27, 19, 12));
    }

    /** No weak spots and only 2 missions — forces curriculum padding to reach 4 days. */
    public static Candidate noWeakSpotsSparse() {
        return new Candidate(
                new CandidateMember("Junior Engineer", 0),
                List.of(
                        mission(2, "Python basics", true, 1),
                        mission(5, "NumPy arrays", true, 1)),
                new CandidateSignals(3, 2, 2));
    }

    private static CandidateMission mission(int day, String title, boolean passed, int attempts) {
        return new CandidateMission(day, title, passed, attempts, null);
    }

    private static CandidateMission skipped(int day, String title) {
        return new CandidateMission(day, title, null, null, true);
    }
}
