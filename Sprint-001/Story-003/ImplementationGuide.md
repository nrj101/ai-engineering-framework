# Implementation Guide

---

# Overview

This Story introduces the Loan Aggregate.

A Loan represents the lending of one Book to one Member.

The Loan Aggregate is responsible for enforcing lending invariants.

---

# Story Package Repository Layout

The Story Package is a self-contained implementation workspace. The Story Package defines the complete writable workspace for this implementation.

Output Locations are always relative to the root of the Story Package.

The Story's **Implementation Contract** is the authoritative source for:

- Write Scope
- Output Locations
- Approved writable artifacts

Do not infer additional repository layouts, package structures, source trees, or folder hierarchies.

---

# Aggregate

Loan

Responsibilities:

- Associate exactly one Member
- Associate exactly one Book
- Store Loan Date
- Store Due Date
- Track Loan Status

---

# Related Aggregates

The Loan Aggregate collaborates with:

- Member
- Book

The implementation shall preserve the boundaries of all Aggregates.

---

# Business Rules

Implement:

- BR-003
- BR-004
- BR-009

---

# Suggested Implementation Order

1. Review the Story Package and identify the approved Output Locations.
2. Implement the Loan Aggregate.
3. Validate constructor.
4. Verify Book availability.
5. Associate Member and Book.
6. Update Book availability.
7. Create unit tests.
8. Complete README.

---

# Design Notes

Prefer a simple implementation.

Avoid introducing services, repositories or framework-specific code.

Only implement the functionality approved by the Story.

Create or modify artifacts only at the Output Locations defined by the Story.