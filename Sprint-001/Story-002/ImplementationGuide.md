# Implementation Guide

---

# Overview

This Story introduces the Book Aggregate.

Books registered through this Story become eligible for future lending operations.

---

# Aggregate

Book

Responsibilities:

- Own Book ID
- Own Title
- Own Availability Status

---

# Business Rules

Implement:

- BR-002

---

# Suggested Order

1. Implement Book Aggregate.
2. Validate constructor.
3. Generate immutable ID.
4. Initialize availability.
5. Create tests.
6. Complete README.

---

# Design Notes

Prefer simple implementation.

Avoid introducing future lending behaviour.