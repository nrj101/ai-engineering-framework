# Business Rules and Workflows

```yaml
---
document_id: BR-001
title: Business Rules and Workflows
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

This document defines the business rules governing the Library Lending System.

It establishes the permitted business behaviour, lifecycle rules and business invariants.

Implementation SHALL preserve these rules without modification.

---

# Business Workflow

The normal lending workflow is:

```text
Register Member
        │
        ▼
Register Book
        │
        ▼
Loan Book
        │
        ▼
Return Book
        │
        ▼
Generate Return Receipt
```

Receipt corrections occur only after a Return Receipt has been generated.

---

# Member Lifecycle

```text
Registered
      │
      ▼
Eligible to Borrow
```

Members remain registered permanently.

Deletion is not supported.

---

# Book Lifecycle

```text
Registered
      │
      ▼
Available
      │
      ▼
Loaned
      │
      ▼
Returned
      │
      ▼
Available
```

A Book alternates between **Available** and **Loaned** throughout its lifetime.

---

# Loan Lifecycle

```text
Created
      │
      ▼
Active
      │
      ▼
Closed
```

Loans are closed only after a successful book return.

Closed Loans remain part of historical lending records.

---

# Return Receipt Lifecycle

```text
Issued
      │
      ▼
Corrected
```

Corrections preserve historical integrity.

The original receipt SHALL remain traceable.

---

# Business Rules

## BR-001 — Member Identity

Every Member SHALL possess a unique Member ID.

Member IDs are immutable.

---

## BR-002 — Book Identity

Every Book SHALL possess a unique Book ID.

Book IDs are immutable.

---

## BR-003 — One Active Loan Per Book

A Book SHALL have **at most one Active Loan** at any point in time.

Attempting to loan an already loaned Book SHALL fail.

---

## BR-004 — Loan Ownership

Every Loan SHALL reference exactly one Member and exactly one Book.

Loans cannot exist independently.

---

## BR-005 — Return Preconditions

A Book may be returned only if an Active Loan exists.

Returning an already returned Book SHALL fail.

---

## BR-006 — Return Receipt Ownership

Every Return Receipt SHALL reference exactly one Loan.

A Return Receipt cannot exist without a completed Return.

---

## BR-007 — Receipt Corrections

Receipt Corrections SHALL preserve historical auditability.

Correction SHALL NOT overwrite the original receipt.

---

## BR-008 — Historical Integrity

Historical Loans SHALL NOT be deleted.

Historical Return Receipts SHALL NOT be deleted.

Historical records remain permanently traceable.

---

## BR-009 — Book Availability

Book availability SHALL be derived from the existence of an Active Loan.

Availability SHALL NOT be manually modified.

---

## BR-010 — Aggregate Collaboration

Business workflows emerge through collaboration between business concepts.

No business concept may directly modify another concept's internal state.

---

# Approval Rules

The following operations require approval.

| Operation          | Approval Required |
| ------------------ | ----------------- |
| Receipt Correction | Yes               |

All other MVP operations execute immediately.

---

# Business Invariants

The following invariants SHALL always hold.

1. A Book cannot have more than one Active Loan.
2. A Loan always belongs to one Member.
3. A Loan always references one Book.
4. Every Return Receipt references one Loan.
5. Book availability is always consistent with Loan state.
6. Historical records remain immutable.
7. Receipt corrections preserve historical traceability.

Violation of any invariant constitutes a business error.

---

# Sprint 1 Story Mapping

| Story                     | Business Rules Exercised |
| ------------------------- | ------------------------ |
| S1 Register Member        | BR-001                   |
| S2 Register Book          | BR-002                   |
| S3 Loan Book              | BR-003, BR-004, BR-009   |
| S4 Return Book            | BR-005, BR-006, BR-009   |
| S5 Correct Return Receipt | BR-007, BR-008           |

---

# AI Evaluation Traps

This project intentionally contains several business invariants that are easy for AI agents to overlook.

Examples include:

* deriving Book availability instead of storing it independently;
* preventing multiple Active Loans for the same Book;
* preserving historical receipts during corrections rather than overwriting them;
* preventing returns when no Active Loan exists.

Developer, Tester and Reviewer agents are expected to independently identify and preserve these rules during implementation.
