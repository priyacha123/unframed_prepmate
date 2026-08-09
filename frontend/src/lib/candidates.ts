import type { Candidate } from './types'

/**
 * Candidate pool, mirroring backend/src/main/resources/candidates.json
 * (member/missions/signals shape — the frontend omits id/name, which the
 * backend's Candidate record drops on deserialization). Each candidate's weak
 * spots (skipped missions / high-attempt, unpassed missions) drive what the
 * interviewer probes. Day numbers and titles reference the real AI Cohort
 * curriculum (backend/src/main/resources/curriculum.json), so the questions
 * the engine asks line up with the weak spots the UI advertises.
 */
export const CANDIDATES: Candidate[] = [
  {
    member: { role: 'AI Engineer Trainee', experience: 1 },
    missions: [
      { day: 3, title: 'Python data structures', passed: true, attempts: 1 },
      { day: 6, title: 'Pandas basics', passed: false, attempts: 4 },
      { day: 9, title: 'Probability foundations', skipped: true },
      { day: 14, title: 'Classification', passed: true, attempts: 2 },
      { day: 18, title: 'Backpropagation and training', passed: true, attempts: 3 },
      { day: 23, title: 'Transformers and attention', skipped: true },
      { day: 27, title: 'Prompt engineering', passed: true, attempts: 1 },
    ],
    signals: { commitDays: 21, missionsCompleted: 15, missionsFirstTry: 9 },
  },
  {
    member: { role: 'Data Analyst', experience: 2 },
    missions: [
      { day: 6, title: 'Pandas basics', passed: true, attempts: 1 },
      { day: 11, title: 'Hypothesis testing', passed: false, attempts: 5 },
      { day: 16, title: 'ML model project', passed: true, attempts: 2 },
      { day: 19, title: 'Building a neural network', skipped: true },
      { day: 24, title: 'Working with LLMs', passed: true, attempts: 2 },
    ],
    signals: { commitDays: 27, missionsCompleted: 19, missionsFirstTry: 12 },
  },
  {
    member: { role: 'ML Engineer', experience: 3 },
    missions: [
      { day: 5, title: 'NumPy arrays', passed: true, attempts: 1 },
      { day: 8, title: 'Visualization', passed: true, attempts: 1 },
      { day: 13, title: 'Regression', passed: true, attempts: 2 },
      { day: 15, title: 'Overfitting and regularization', passed: false, attempts: 4 },
      { day: 20, title: 'Deep learning project', skipped: true },
      { day: 25, title: 'NLP project', passed: true, attempts: 2 },
    ],
    signals: { commitDays: 18, missionsCompleted: 11, missionsFirstTry: 7 },
  },
]

/** Default selection for quick start (or auto-start without the picker). */
export const DEFAULT_CANDIDATE: Candidate = CANDIDATES[0]
