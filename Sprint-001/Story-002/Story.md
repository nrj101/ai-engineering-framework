# Story-002 — Register Book

```yaml
---
story_id: Story-002
title: Register Book
version: 1.0.0
status: Approved

sprint: Sprint-001
priority: High

owner: Product Owner
---
```

---

# Business Objective

Allow new Books to be registered within the Library Lending System.

Successful registration establishes the Book Aggregate for future lending.

---

# Scope

This Story includes:

- Book creation
- Book identifier generation
- Book validation
- Initial availability

This Story excludes:

- Lending
- Returns
- Reservations
- Persistence

---

# Acceptance Criteria

The implementation shall:

- register a Book successfully;
- generate a unique Book identifier;
- preserve Book identifier immutability;
- reject blank Book titles;
- mark newly registered Books as available.

---

# Clarifications

For this PoC:

- UUID may be used.
- Books are available immediately after registration.
- Persistence is out of scope.
- Java shall be used.

---

# Non Goals

Do not introduce:

- Repository
- Service Layer
- REST
- Database
- Frameworks
- Dependency Injection

---

# Engineering Contract

## Write Scope

The Developer MAY modify or create ONLY:

### Source

- source/Book.java

### Tests

- tests/BookTest.java

### Documentation

- README.md

Modification of any other artifact requires clarification.

---

# Completion Checklist

- Acceptance Criteria satisfied.
- Business Rules preserved.
- Architecture preserved.
- Only approved artifacts modified.
- No undocumented assumptions introduced.
- Tests completed.