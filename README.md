# OOPS Innovative Assignment – Problem C

## Custom Checked Exception for Training Level Validation

### Problem Statement

Create a custom checked exception named `InvalidTrainingLevelException` for validating the training level of a service dog.

The training level must be between **1 and 10**.

- If the level is between 1 and 10, it is accepted.
- If the level is less than 1 or greater than 10, a custom exception is thrown.
- The exception is handled using `try-catch`.

## Objective

- Create a custom checked exception.
- Validate the training level.
- Use `throw` to generate the exception.
- Handle the exception using `try-catch`.
- Display appropriate messages for valid and invalid training levels.

## Java Concepts Used

- Classes and Objects
- Inheritance
- Custom Exception
- `extends Exception`
- `throw`
- `throws`
- `try-catch`
- Constructor
- Conditional statements

## Test Cases

| Input | Result |
|------|--------|
| 12 | Invalid – Exception is thrown |
| 7 | Valid – Training level accepted |

## Output

```text
Error: Training level must be between 1 and 10.
Training level 7 accepted.
