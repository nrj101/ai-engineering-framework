# Product Specification

```yaml
---
document_id: SPEC-001
title: Product Specification
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

This document defines the functional scope of the Library Lending System used to evaluate AI-assisted software engineering workflows.

The project intentionally mirrors many of the architectural characteristics of the Student Fee Receivables Platform while remaining sufficiently small to implement within a few development sprints.

This document defines **what** the software must do.

Implementation decisions belong to the Architecture.

---

# Problem Statement

A small community library currently maintains book lending using a physical register.

The librarian manually records:

* members;
* books;
* book loans;
* returned books; and
* return receipts.

As the library grows, manual tracking becomes increasingly difficult.

Common issues include:

* books accidentally loaned twice;
* missing return records;
* inconsistent availability information;
* inability to trace historical lending;
* manual receipt corrections.

The objective is to digitize the lending process while preserving complete lending history.

---

# Product Scope

## In Scope

The MVP supports:

* Member registration
* Book registration
* Book lending
* Book returns
* Return receipt generation
* Receipt correction
* Lending history

---

## Out of Scope

The MVP intentionally excludes:

* reservations
* fines
* notifications
* online member portal
* inventory purchasing
* multiple library branches
* authentication
* reporting

---

# Core Business Concepts

The system manages the following business concepts.

| Concept        | Purpose                                 |
| -------------- | --------------------------------------- |
| Member         | Person eligible to borrow books         |
| Book           | Library-owned book                      |
| Loan           | Active lending transaction              |
| Return Receipt | Official acknowledgement of book return |

---

# Functional Requirements

## FR-001 — Register Member

The system shall allow registration of a library member.

Each Member has a unique Member ID.

---

## FR-002 — Register Book

The system shall allow registration of a library book.

Each Book has a unique Book ID.

---

## FR-003 — Loan Book

The system shall record the lending of a book to a member.

The system shall record:

* Member
* Book
* Loan Date
* Due Date

---

## FR-004 — Return Book

The system shall record the successful return of a loaned book.

Returning a book shall generate a Return Receipt.

---

## FR-005 — Correct Return Receipt

The system shall support correction of a Return Receipt.

Receipt corrections preserve historical auditability.

The original receipt shall remain part of the historical record.

---

# Success Criteria

The MVP is considered successful when:

* Members can be registered.
* Books can be registered.
* Books can be loaned.
* Books can be returned.
* Receipts can be corrected.
* Historical lending records remain traceable.

---

# Planned Sprint

Sprint 1 consists of the following stories.

| Story | Description            |
| ----- | ---------------------- |
| S1    | Register Member        |
| S2    | Register Book          |
| S3    | Loan Book              |
| S4    | Return Book            |
| S5    | Correct Return Receipt |

Stories S1 and S2 will be provided as reference ("golden") implementations.

Stories S3–S5 will be implemented by AI agents and used to evaluate engineering quality.

---

# Non-Functional Goal

This project exists primarily to evaluate:

* AI implementation quality
* AI architectural compliance
* AI testing capability
* AI review capability
* AI adherence to business rules

rather than to produce a production-ready application.
