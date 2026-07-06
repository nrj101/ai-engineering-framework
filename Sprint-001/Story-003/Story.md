# Story-003 — Loan Book

```yaml
---
story_id: Story-003
title: Loan Book
version: 1.1.0
status: Approved

sprint: Sprint-001
priority: High

owner: Product Owner
---
```

---

# Business Objective

Allow an available Book to be loaned to a registered Member.

A successful loan establishes an active Loan within the Library Lending System and prevents the Book from being loaned again until it is returned.

---

# Scope

This Story includes:

- Loan creation
- Association of one Member
- Association of one Book
- Loan Date
- Due Date
- Book availability update

This Story excludes:

- Returning books
- Late fees
- Reservations
- Receipt generation
- Persistence

---

# Acceptance Criteria

The implementation shall:

- create a Loan successfully;
- associate exactly one Member;
- associate exactly one Book;
- record Loan Date;
- record Due Date;
- update the Book Aggregate to unavailable;
- reject loans for unavailable Books.

---

# Clarifications

For this PoC:

- A Book may have at most one active Loan.
- Loan Date may be supplied by the caller.
- Due Date may be supplied by the caller.
- Persistence is outside the scope.
- Java shall be used.

---

# Non Goals

Do not introduce:

- Database
- Repository
- REST APIs
- Dependency Injection
- Logging
- Notifications
- Reservation support
- Overdue calculations

---

# Story Package Structure

This Story Package is a self-contained implementation workspace.

The repository structure for this Story is (/Sprint-001/):

```text
Story-003/
│
├── Story.md
├── ImplementationGuide.md
├── README.md
├── source/
│   └── Loan.java
└── tests/
    └── LoanTest.java
```

This structure is authoritative for this Story.

Do not infer additional folders or repository layouts.

---

# Implementation Contract

## Write Scope

For this Story, the Developer MAY create or modify ONLY the following artifacts.

### Source

- /Sprint-001/Story-003/source/Loan.java

### Tests

- /Sprint-001/Story-003/tests/LoanTest.java

### Documentation

- /Sprint-001/Story-003/README.md

Modification of any other artifact requires clarification before implementation.

If the required files are not present, the Developer MAY create them at their approved Output Locations.

The Developer SHALL NOT modify any pre-existing artifact outside the approved Write Scope.

If implementation requires changes outside the approved Write Scope, document the requirement and justification in the implementation README instead.

---

## Output Locations

The following Output Locations are authoritative.

Output Locations are relative to the root (/Sprint-001/Story-003/) of this Story Package.

| Artifact | Output Location |
|----------|-----------------|
| Loan.java | /Sprint-001/Story-003/source/Loan.java |
| LoanTest.java | /Sprint-001/Story-003/tests/LoanTest.java |
| README.md | /Sprint-001/Story-003/README.md |

The Developer SHALL:

- create or modify artifacts only at these Output Locations;
- preserve the Story Package structure;
- not infer Java package directories;
- not infer Maven or Gradle layouts;
- not create additional folders unless explicitly approved by the Story.

---

# Completion Checklist

Before marking this Story complete, verify:

- Acceptance Criteria satisfied.
- Business Rules preserved.
- Architecture preserved.
- Story scope preserved.
- Only approved artifacts modified or created.
- Only approved Output Locations used.
- No undocumented assumptions introduced.
- Unit tests created.