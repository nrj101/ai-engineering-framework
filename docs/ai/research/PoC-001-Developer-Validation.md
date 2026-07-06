# PoC-001 — Developer Validation

```yaml
---
document_id: AI-POC-001
title: Developer Validation using Local LLM
version: 0.1.0
status: Complete

owner: Product Owner

created: 2026-07-05

related_documents:
  - ../constitution/Engineering_Constitution.md
  - ../personas/Developer_Persona.md
  - ../prompts/Developer_Runtime_Prompt.md
---
```

---

# Objective

Validate whether a local Large Language Model can participate as the Developer within the AI Engineering Framework.

The objective was not to evaluate Java programming capability alone, but to validate the complete engineering workflow from approved documentation to implementation artifacts.

---

# Experiment Environment

## Hardware

* Intel Core i7-9750H
* 32 GB RAM
* NVIDIA RTX 2070 (8 GB VRAM)

---

## Software

* VS Code
* Continue Extension
* Ollama

---

## Model

Qwen3 8B (Q4_K_M Quantization)

Execution:

Local

---

# Engineering Inputs

The Developer received:

* Specification
* Business Rules
* Architecture
* Story
* Runtime Prompt

All documents were explicitly attached.

No automatic repository search was used.

---

# Story

Implement the Account Aggregate.

Required outputs:

* Account.java
* AccountTest.java
* README.md

---

# Experiment 1

## Observation

The Developer successfully:

* synthesized multiple project documents;
* preserved architectural boundaries;
* generated implementation;
* generated tests;
* generated README.

However, the Developer introduced undocumented business behaviour.

Example:

The implementation invented a special account number that permitted zero balance.

This behaviour was not defined by any project documentation.

---

## Root Cause

The Story omitted clarification regarding initial balance behaviour.

The Developer attempted to compensate for incomplete requirements.

---

## Framework Improvement

The following engineering principle was introduced.

> AI SHALL NEVER compensate for missing requirements by inventing business behaviour.

---

# Experiment 2

The Story was updated with a Clarifications section.

Clarifications included:

* Initial balance may be zero.
* Monetary values shall use BigDecimal.
* No additional validation shall be introduced.

---

## Observation

Implementation quality improved significantly.

The Developer:

* removed invented business rules;
* adopted BigDecimal;
* remained within Story scope;
* generated cleaner implementation.

No significant assumption-driven behaviour was observed.

---

# Conclusions

The primary source of implementation defects was incomplete engineering input rather than model capability.

Implementation quality improved primarily through better project documentation.

---

# Findings

## Confirmed

The following hypotheses were validated.

### Local LLM is sufficient

Confirmed.

The local model successfully implemented business behaviour, tests and supporting documentation.

---

### Explicit engineering context is effective

Confirmed.

Attaching only the required project documents produced deterministic implementation behaviour.

Automatic repository retrieval was unnecessary.

---

### Story quality directly affects implementation quality

Confirmed.

Adding Clarifications significantly reduced implementation assumptions.

---

### Business ambiguity is the primary source of defects

Confirmed.

Observed implementation defects originated from undocumented business behaviour rather than programming errors.

---

# Methodology Changes

The following improvements were adopted into the AI Engineering Framework.

## Engineering Constitution

Added:

* Assumption Prevention
* Engineering Examples
* Engineering Anti-Patterns

---

## Story Package

Clarifications became a standard Story section.

Non-Goals became a standard Story section.

---

## Developer Persona

Developer SHALL request clarification rather than invent missing business behaviour.

---

# Lessons Learned

AI implementation quality depends more heavily on engineering input quality than implementation model capability.

Investment in:

* Product Specification
* Business Rules
* Story Package
* Architecture

produces greater engineering improvements than prompt optimization alone.

---

# Future Experiments

Remaining hypotheses include:

* Reference implementations improve consistency.
* Developer README improves downstream review.
* Tester Persona detects implementation defects effectively.
* Runtime Prompt can be simplified without reducing quality.
* Story templates improve long-term engineering consistency.

---

# Status

PoC-001 successfully validated the feasibility of a specification-driven AI software engineering workflow using a local Large Language Model.

The framework proceeds to Tester Persona validation.