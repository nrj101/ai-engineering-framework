# Library Lending System

```yaml
---
project: Library Lending System
version: 0.1.0

purpose: AI Engineering Workflow Proof of Concept

framework_version: AI Engineering Framework v0.1.0
---
```

---

# Purpose

This repository is a Proof of Concept used to validate an AI-assisted software engineering workflow.

The objective is **not** to build a production-ready Library Management System.

Instead, the project validates whether AI can reliably implement software from structured engineering documentation while preserving business correctness and architectural integrity.

---

# Current Scope

The current PoC validates only the **Developer Persona**.

The following personas are intentionally excluded at this stage:

- Tester
- Senior Engineer
- Project Guardian

These will be introduced only after the Developer workflow has been validated.

---

# Technology Stack

Language

- Java

Testing

- JUnit 5

No other frameworks or technologies shall be assumed unless explicitly requested by a Story.

---

# Project Structure

```
architecture/
docs/
reference/
spec/
stories/
README.md
```

---

# Story Structure

Every implementation Story shall reside within its own folder.

Example:

```
stories/

Sprint-001/

    Story-S001/

        Story.md

        ImplementationGuide.md

        source/

        tests/
```

The Story folder is the complete engineering package for that Story.

---

# Output Conventions

The Developer SHALL NOT invent additional project structures (eg: creating folders,packages etc) unless explicitly requested.

---

# Java Conventions

Unless specified by the Story:

- do not create package declarations;
- do not introduce Maven or Gradle structures;
- do not generate build files;
- do not introduce external dependencies.

The implementation should remain as simple as possible.

---

# Architectural Constraints

The Developer SHALL preserve the approved Software Architecture.

The Developer SHALL NOT introduce:

- Repository layer
- Persistence
- REST APIs
- Dependency Injection
- Frameworks
- Logging
- Configuration
- Messaging
- Caching

unless explicitly required by the Story.

---

# Engineering Philosophy

The Developer shall implement only the approved Story.

The Developer shall not:

- invent business rules;
- redesign architecture;
- speculate about future requirements;
- introduce abstractions for future use.

If information required for implementation is missing, ambiguous or contradictory, implementation shall stop and clarification shall be requested.

---

# Engineering Documentation

The following documents collectively define the engineering context.

## AI Engineering Framework

```
docs/ai/
```

Provides engineering methodology and AI behaviour.

---

## Product Documentation

```
spec/
```

Defines business behaviour and business rules.

---

## Architecture

```
architecture/
```

Defines the approved software architecture.

---

## Stories

```
stories/
```

Defines implementation scope for individual engineering tasks.

---

# Reference Implementation

The `reference/` folder contains approved implementations used only for calibration and consistency during the PoC.

Reference implementations are examples, not additional requirements.

When a Story contradicts the reference implementation, the Story takes precedence.

---

# Priority of Documentation

When multiple documents are provided, they shall be interpreted in the following order of precedence.

1. Story
2. Implementation Guide
3. Business Rules
4. Software Architecture
5. Product Specification
6. Project README
7. Engineering Constitution
8. Developer Persona
9. Developer Runtime Prompt

If contradictions are identified, implementation shall stop and clarification shall be requested.

---

# Success Criteria

The objective of this PoC is to demonstrate that an AI Developer can:

- understand project documentation;
- preserve business rules;
- preserve software architecture;
- remain within Story scope;
- avoid undocumented assumptions;
- generate the requested implementation artifacts.

Code quality alone is not considered sufficient for success.