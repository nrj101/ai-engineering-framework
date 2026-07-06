# Loan Aggregate Implementation

This is the implementation of the Loan Aggregate for the Library Lending System.

## Overview

The Loan Aggregate represents the lending of one Book to one Member. It enforces the following business rules:

- A Book may have at most one active Loan (BR-003)
- Every Loan must reference exactly one Member and one Book (BR-004)
- Book availability is derived from the existence of an active Loan (BR-009)

## Implementation Details

- The Loan class stores the Member ID, Book ID, Loan Date, and Due Date.
- The Loan class tracks whether the Loan is active or closed.
- The Loan class provides methods to get the Member ID, Book ID, Loan Date, Due Date, and active status.
- The Loan class provides a method to mark the Loan as closed.

## Testing

- Unit tests are provided to verify the behavior of the Loan class.