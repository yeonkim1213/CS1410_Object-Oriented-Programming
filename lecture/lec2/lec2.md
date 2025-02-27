# Lecture 2

- **Literals**: Text that represents a value.
- **Variable**: A named location to store data.
- **Statement**: A sentence in a human language that expresses an action or condition.
- **Method**: A sequence of instructions for carrying out a task, grouped with a name.
- **Parameters**: Allow information to be entered into the method.
- **Scope**: The scope defines where the variable or parameter is accessible. Variables and parameters declared in the method body cannot be used outside of it.

---

### Logical Operators:
- **&&** (AND): Evaluates to true if both operands are true.
- **||** (OR): Evaluates to true if at least one operand is true.
- **!** (NOT): Reverses the boolean value of its operand.

---

### Logical Operator Precedence:
- **!** has the highest precedence, followed by **&&**, and **||** has the lowest precedence.

---

### Short-Circuiting Logical Operators:
Short-circuiting occurs when the operator doesn't evaluate the second operand if the result can be determined by the first operand.

**Example**:
```java
if (x > 0 && method()) {
    // method() will not be called if x is not greater than 0
}
