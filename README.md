# 🎯 The Interview Agent

> **Build the interviewer, not the interview.**

### An AI-powered technical interviewer that understands *what a candidate has learned* — and adapts the interview accordingly.

[![Live Demo](https://img.shields.io/badge/🚀_Live_Demo-Try_Now-success?style=for-the-badge)](https://unframed-prepmate.vercel.app/)
[![Backend](https://img.shields.io/badge/Backend-Render-46E3B7?style=for-the-badge)](https://ai-interview-agent-unframed.onrender.com)
[![Java](https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk)](https://www.java.com/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.3.5-6DB33F?style=for-the-badge&logo=springboot)](https://spring.io/projects/spring-boot)
[![Gemini](https://img.shields.io/badge/AI-Gemini-blue?style=for-the-badge)](https://ai.google.dev/)

---

## 🚀 Live Demo

### 👉 [Try The Interview Agent](https://unframed-prepmate.vercel.app/)

**Frontend:**  
https://unframed-prepmate.vercel.app/

**Backend:**  
https://ai-interview-agent-unframed.onrender.com

> The application is fully deployed and supports an end-to-end interview flow:
>
> **Start → Interview → Adaptive Follow-ups → 8+ Questions → Feedback**

---

# 🧠 What Are We Building?

Most interview preparation tools behave like this:

```text
Question Bank
     ↓
Question
     ↓
Answer
     ↓
Next Question

That's not how a real interviewer behaves.

A real interviewer listens to the candidate's answer, identifies gaps, decides whether to probe deeper, and changes direction based on what they hear.

The Interview Agent is designed around that idea.

Candidate Learning Journey
          ↓
Curriculum + Missions
          ↓
Learning Signals
          ↓
Interview Planning
          ↓
AI Interviewer
          ↓
Candidate Answer
          ↓
Answer Evaluation
       ↙       ↘
   Probe Deeper   Move On
       ↘       ↙
     Next Topic
          ↓
   Structured Feedback
✨ Why It's Different
🎯 Personalized

The interviewer doesn't treat every candidate the same.

It uses:

Completed missions
Skipped topics
Number of attempts
First-try performance
Learning/commit signals
Candidate role and experience

to influence the interview.

🧩 Curriculum-Aware

The interviewer is grounded in the provided 31-day AI Cohort curriculum.

It can assess concepts across multiple curriculum days rather than asking unrelated generic questions.

🗣️ Conversational

The interview is multi-turn.

The agent remembers:

What it asked
What the candidate answered
Which topic is being discussed
Previous interview context

This allows follow-up questions to remain relevant.

🔄 Adaptive Follow-ups

This is the core idea behind the project.

Instead of blindly moving to the next question:
Strong Answer
     ↓
Move Forward
while:

Weak / Shallow Answer
     ↓
Probe Deeper
     ↓
Clarify Understanding

The interviewer adapts its questioning strategy based on the candidate's responses.
📊 Actionable Feedback

At the end of the interview, the agent generates structured feedback covering areas such as:

Strengths
Weak areas
Technical understanding
Areas requiring revision
Interview performance
Improvement suggestions

The goal isn't just to say "you scored 7/10."

The goal is to tell the candidate what to improve next.
🏗️ System Architecture
                         ┌─────────────────────┐
                         │    Candidate UI     │
                         │   React + Vite      │
                         │      Vercel         │
                         └──────────┬──────────┘
                                    │
                                    │ REST API
                                    ▼
                         ┌─────────────────────┐
                         │   Spring Boot API   │
                         │       Render        │
                         └──────────┬──────────┘
                                    │
              ┌─────────────────────┼─────────────────────┐
              │                     │                     │
              ▼                     ▼                     ▼
     ┌────────────────┐    ┌────────────────┐    ┌────────────────┐
     │ Candidate Data │    │ Interview      │    │ Feedback       │
     │                │    │ Engine         │    │ Service        │
     └────────────────┘    └───────┬────────┘    └────────────────┘
                                   │
                                   │ Context +
                                   │ Candidate Signals
                                   ▼
                          ┌──────────────────┐
                          │   Gemini API     │
                          │   AI Interviewer │
                          └──────────────────┘

🔄 Interview Lifecycle
┌───────────────────────┐
│ Select Candidate      │
└───────────┬───────────┘
            ↓
┌───────────────────────┐
│ Analyze Learning      │
│ Journey + Signals     │
└───────────┬───────────┘
            ↓
┌───────────────────────┐
│ Select Interview      │
│ Topics                │
└───────────┬───────────┘
            ↓
┌───────────────────────┐
│ Ask Question          │
└───────────┬───────────┘
            ↓
┌───────────────────────┐
│ Candidate Answers     │
└───────────┬───────────┘
            ↓
      ┌─────┴─────┐
      ↓           ↓
   Strong       Weak /
   Answer       Unclear
      ↓           ↓
 Move On      Follow-up
      │           │
      └─────┬─────┘
            ↓
     Continue Interview
            ↓
      8+ Questions
            ↓
    Generate Feedback

🛠️ Tech Stack
Frontend
React
TypeScript
Vite
Responsive interview UI
REST API integration
Backend
Java 21
Spring Boot 3.3.5
Spring Web
REST APIs
Maven
In-memory interview sessions
AI
Google Gemini API
Gemini Flash
Context-aware prompting
Adaptive interview generation
Deployment
Frontend: Vercel
Backend: Render
📋 Challenge Compliance
Requirement	Implementation
Conversational technical interview	✅ Multi-turn interview
Minimum 8 questions	✅
At least 4 curriculum days	✅
Intelligent follow-ups	✅ Answer-driven probing
Context maintenance	✅ Session context
Candidate learning signals	✅ Used in interview planning
Structured feedback	✅ Feedback service
Required HTTP API	✅
Real AI responses	✅ Gemini
Deployed frontend	✅ Vercel
Deployed backend	✅ Render
🎮 How To Use
1. Open the application

👉 https://unframed-prepmate.vercel.app/

2. Select a candidate

The candidate profile determines the learning context used by the interviewer.

3. Start the interview

The agent generates the first technical question based on the candidate's journey.

4. Answer naturally

Don't try to match a predefined answer.

Explain your reasoning as you would in a real interview.

5. Handle follow-ups

The interviewer may:

Ask for clarification
Go deeper into the same concept
Challenge your reasoning
Move to another topic
6. Complete the interview

After the required interview turns, the system generates structured feedback.

🔐 Environment Variables
Backend — Render
GEMINI_API_KEY=<your-gemini-api-key>
GEMINI_MODEL=<configured-gemini-model>
FRONTEND_URL=https://unframed-prepmate.vercel.app

PORT is provided automatically by Render.

Frontend — Vercel
VITE_API_URL=https://ai-interview-agent-unframed.onrender.com

⚠️ Never commit .env files or API keys to Git.

💻 Run Locally
Backend
cd backend
mvn clean package
java -jar target/interview-agent-0.1.0.jar

Backend:

http://localhost:8080
Frontend
cd frontend
npm install
npm run dev

Frontend:

http://localhost:5173

For local development:

VITE_API_URL=http://localhost:8080
🧪 Testing

Run backend tests:

cd backend
mvn test

The test suite covers core interview functionality including:

Interview flow
Candidate data
Interview engine
Controller behavior
Gemini service
Feedback generation
🌐 Deployment
Backend — Render

The backend runs as a long-lived Spring Boot web service.

Build
mvn clean package
Start
java -jar target/interview-agent-0.1.0.jar
Health Check
GET /health
Frontend — Vercel

The frontend uses Vite.

Build
npm run build
Output
dist/
🧠 Engineering Decisions
Why Gemini?

The interviewer requires dynamic generation rather than a fixed question bank.

Gemini provides the language generation required to:

Generate technical questions
Maintain conversational context
Create follow-up questions
Adapt the interview based on candidate responses
Generate final feedback
Why In-Memory Sessions?

Persistent accounts and long-term interview history were explicitly outside the challenge scope.

Therefore, interview state is maintained in memory for the active interview session.

This keeps the implementation simple and focused on the core problem:

Building the interviewer, not the infrastructure around it.

Why Candidate Signals?

A candidate who skipped a topic or repeatedly struggled with a mission should not receive exactly the same interview as someone who mastered it on the first attempt.

Learning signals allow the system to personalize topic selection and questioning.

🚫 Intentionally Out of Scope

The challenge explicitly did not require:

Authentication
Persistent user accounts
Long-term conversation history
Mobile application
Voice interaction
Vector database
Complex RAG infrastructure
MCP integration

We intentionally focused engineering effort on the interview intelligence and candidate experience instead of adding unnecessary infrastructure.

👥 Team
Unframed
👩‍💻 Radhika Sishodiya — Backend

Responsible for:

Spring Boot backend
REST APIs
Gemini integration
Interview session management
Feedback generation
Error handling
Backend deployment
API integration
👩‍💻 Priya Kumari — Frontend

Responsible for:

React frontend
Candidate selection interface
Interview experience
Conversation UI
Feedback presentation
Frontend deployment
👩‍💻 Palak Sharma — Agent / Interview Logic

Responsible for:

Interview planning
Candidate signal integration
Adaptive follow-up strategy
Curriculum-aware questioning
Interview flow logic
🏆 Hackathon Pitch

Most interview bots ask questions.

The Interview Agent decides what to ask next.

It uses a candidate's learning journey, curriculum progress, and answers to conduct a personalized technical interview — then tells the candidate exactly where they need to improve.

📌 Submission Links
🚀 Live Application

https://unframed-prepmate.vercel.app/

⚙️ Backend

https://ai-interview-agent-unframed.onrender.com

👩‍💻 Built by Team Unframed

Radhika Sishodiya · Priya Kumari · Palak Sharma

Built for the AI Cohort Hackathon.

Build the interviewer, not the interview.