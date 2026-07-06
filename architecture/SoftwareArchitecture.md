# Software Architecture

```yaml
---
document_id: SA-001
title: Software Architecture
version: 1.0.0
status: Locked

project: AI Engineering PoC (Library Lending System)

owner: Product Owner
reviewer: CTO

created: 2026-07-05
last_updated: 2026-07-05
---
```

---

# Purpose

This document defines the high-level software architecture of the Library Lending System.

It describes how the approved Product Specification is realized through software modules, architectural layers and Application Services.

Detailed Aggregate ownership is defined in **AggregateDesign.md**.

---

# Architectural Goals

The architecture is designed to:

* preserve business correctness;
* maintain clear Aggregate boundaries;
* minimize coupling;
* maximize maintainability;
* support AI-assisted development through explicit architectural boundaries.

---

# Architectural Style

The Library Lending System adopts a **Modular Monolith** architecture.

The application executes as a single deployable unit while remaining internally partitioned into business modules.

Each module owns one business capability and collaborates with other modules through Application Services.

---

# Architectural Layers

```text
+------------------------------------------------------+
| Presentation Layer                                   |
| REST Controllers / CLI                               |
+------------------------------------------------------+
| Application Layer                                    |
| Application Services / Workflow Coordination         |
+------------------------------------------------------+
| Domain Layer                                         |
| Aggregates / Entities / Value Objects                |
+------------------------------------------------------+
| Infrastructure Layer                                 |
| Persistence / Logging / External Systems             |
+------------------------------------------------------+
```

Dependencies SHALL flow inward.

Business rules SHALL remain inside the Domain Layer.

---

# Business Modules

The Modular Monolith consists of the following logical modules.

| Module  | Primary Aggregate   |
| ------- | ------------------- |
| Member  | Member              |
| Book    | Book                |
| Loan    | Loan                |
| Receipt | Return Receipt      |
| Shared  | Shared abstractions |

---

# Application Services

Application Services coordinate business workflows.

The MVP defines the following services.

| Service        | Responsibility        |
| -------------- | --------------------- |
| MemberService  | Register Members      |
| BookService    | Register Books        |
| LoanService    | Loan and Return Books |
| ReceiptService | Receipt Corrections   |

Application Services SHALL:

* coordinate Aggregate collaboration;
* manage transaction boundaries;
* invoke Aggregate behaviour;
* return application results.

Application Services SHALL NOT contain business rules.

---

# Module Dependencies

```text
          Shared
             ▲
             │
    ┌────────┼────────┐
    │        │        │
 Member     Book    Receipt
      \      │       /
       \     │      /
        └── Loan ──┘
```

The dependency graph SHALL remain acyclic.

---

# Aggregate Collaboration

Cross-Aggregate workflows SHALL be coordinated through Application Services.

Examples include:

**Loan Book**

Member → Loan ← Book

**Return Book**

Loan → Return Receipt

**Receipt Correction**

Return Receipt

---

# Dependency Rules

The following dependency rules SHALL always hold.

| Layer          | May Depend On |
| -------------- | ------------- |
| Presentation   | Application   |
| Application    | Domain        |
| Domain         | Shared        |
| Infrastructure | Domain        |

The Domain Layer SHALL NOT depend upon infrastructure or presentation technologies.

---

# Architectural Constraints

Implementation SHALL preserve the following constraints.

* Business rules remain inside Aggregates.
* Every Aggregate owns exactly one business truth.
* Business state SHALL NOT be duplicated across Aggregates.
* Cross-Aggregate workflows SHALL be coordinated through Application Services.
* Historical records SHALL remain append-only through correction operations.

---

# Future Evolution

The architecture intentionally supports future evolution.

Possible future enhancements include:

* reservation management;
* overdue fines;
* notifications;
* multiple library branches;
* REST APIs;
* asynchronous events.

Such evolution SHALL preserve the Aggregate boundaries established by the current architecture.

---

# AI Implementation Guidance

Implementation SHALL faithfully realize this architecture.

AI agents SHALL NOT:

* merge Aggregate responsibilities;
* introduce cyclic module dependencies;
* move business rules into Application Services;
* bypass Aggregate invariants;
* introduce framework-specific behaviour into the Domain Layer.

When architectural uncertainty exists, implementation SHALL stop and request clarification rather than introducing assumptions.
