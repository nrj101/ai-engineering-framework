# Aggregate Design

```yaml
---
document_id: ARCH-001
title: Aggregate Design
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

This document defines the Aggregate boundaries of the Library Lending System.

Aggregate Design establishes ownership of business state, business invariants and collaboration rules.

Application Services coordinate business workflows while preserving Aggregate autonomy.

---

# Aggregate Overview

The Library Lending System consists of four Aggregates.

| Aggregate      | Primary Responsibility                     |
| -------------- | ------------------------------------------ |
| Member         | Library member identity                    |
| Book           | Library-owned book catalogue               |
| Loan           | Lending lifecycle                          |
| Return Receipt | Official acknowledgement of returned books |

---

# Aggregate Relationships

```text
Member
   │
   │ borrows
   ▼
Loan
   ▲
   │
Book
   │
   │ acknowledged by
   ▼
Return Receipt
```

---

# Member Aggregate

## Aggregate Root

Member

---

## Responsibilities

Owns:

* Member identity
* Registration lifecycle

---

## Business Invariants

* Member ID is unique.
* Member ID is immutable.

---

## Collaborates With

* Loan

---

# Book Aggregate

## Aggregate Root

Book

---

## Responsibilities

Owns:

* Book identity
* Book metadata

Book availability is **derived** from the Loan Aggregate.

The Book Aggregate SHALL NOT independently manage lending state.

---

## Business Invariants

* Book ID is unique.
* Book metadata remains independent of Loan state.

---

## Collaborates With

* Loan

---

# Loan Aggregate

## Aggregate Root

Loan

---

## Responsibilities

Owns:

* Lending lifecycle
* Loan status
* Due date
* Borrowing relationship

The Loan Aggregate is the owner of lending state.

---

## Business Invariants

* One Active Loan per Book.
* Every Loan references one Member.
* Every Loan references one Book.
* Closed Loans remain immutable.

---

## Collaborates With

* Member
* Book
* Return Receipt

---

# Return Receipt Aggregate

## Aggregate Root

Return Receipt

---

## Responsibilities

Owns:

* Return acknowledgement
* Receipt correction lifecycle
* Historical receipt integrity

---

## Business Invariants

* Every Receipt belongs to one Loan.
* Original Receipts remain traceable after correction.
* Receipt Corrections preserve historical integrity.

---

## Collaborates With

* Loan

---

# Aggregate Collaboration Principles

Aggregates SHALL collaborate without sharing ownership.

Examples:

* Loan validates Member eligibility.
* Loan validates Book availability.
* Return Receipt acknowledges completed Loan.
* Receipt Corrections never modify historical Loan data.

Application Services coordinate these interactions.

---

# Aggregate Ownership Summary

| Business Truth         | Owning Aggregate |
| ---------------------- | ---------------- |
| Member Identity        | Member           |
| Book Identity          | Book             |
| Lending State          | Loan             |
| Return Acknowledgement | Return Receipt   |

Every business truth SHALL have exactly one owner.

---

# Design Principles

The Aggregate Design follows the following principles.

* Single ownership of business truth.
* Aggregate autonomy.
* Collaboration over shared ownership.
* Lifecycle-driven operations.
* Historical integrity through correction.
* Derived state where practical.

---

# AI Implementation Guidance

Implementation SHALL preserve Aggregate boundaries.

The following are prohibited:

* introducing shared mutable state between Aggregates;
* duplicating ownership of business truths;
* bypassing Aggregate invariants;
* embedding business rules within Application Services.

Any uncertainty regarding Aggregate ownership SHALL be escalated rather than assumed.
