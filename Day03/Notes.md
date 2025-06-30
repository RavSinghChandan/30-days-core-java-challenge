# Day 03: Operators, Conditionals (if, switch), Loops (for, while, do-while)

## 📚 Learning Objectives
- Understand different types of operators in Java
- Master conditional statements (if, if-else, switch)
- Learn loop constructs (for, while, do-while)
- Understand operator precedence and associativity
- Practice control flow in programs

## 🔧 Operators in Java

### Arithmetic Operators
- `+` Addition
- `-` Subtraction
- `*` Multiplication
- `/` Division
- `%` Modulus (remainder)
- `++` Increment (pre/post)
- `--` Decrement (pre/post)

### Assignment Operators
- `=` Simple assignment
- `+=` Add and assign
- `-=` Subtract and assign
- `*=` Multiply and assign
- `/=` Divide and assign
- `%=` Modulus and assign

### Comparison Operators
- `==` Equal to
- `!=` Not equal to
- `>` Greater than
- `<` Less than
- `>=` Greater than or equal to
- `<=` Less than or equal to

### Logical Operators
- `&&` Logical AND
- `||` Logical OR
- `!` Logical NOT
- `&` Bitwise AND
- `|` Bitwise OR
- `^` Bitwise XOR

### Bitwise Operators
- `&` AND
- `|` OR
- `^` XOR
- `~` NOT
- `<<` Left shift
- `>>` Right shift
- `>>>` Unsigned right shift

## 🔀 Conditional Statements

### if Statement
```java
if (condition) {
    // code to execute if condition is true
}
```

### if-else Statement
```java
if (condition) {
    // code if condition is true
} else {
    // code if condition is false
}
```

### if-else if-else Statement
```java
if (condition1) {
    // code if condition1 is true
} else if (condition2) {
    // code if condition2 is true
} else {
    // code if all conditions are false
}
```

### switch Statement
```java
switch (expression) {
    case value1:
        // code for value1
        break;
    case value2:
        // code for value2
        break;
    default:
        // code if no case matches
        break;
}
```

### Switch Expression (Java 14+)
```java
String result = switch (day) {
    case "Monday" -> "Start of week";
    case "Friday" -> "End of week";
    default -> "Mid week";
};
```

## 🔄 Loop Constructs

### for Loop
```java
for (initialization; condition; increment/decrement) {
    // code to repeat
}

// Enhanced for loop (for-each)
for (dataType item : collection) {
    // code for each item
}
```

### while Loop
```java
while (condition) {
    // code to repeat while condition is true
}
```

### do-while Loop
```java
do {
    // code to repeat
} while (condition);
```

## 🎯 Control Flow Statements

### break Statement
- Exits the current loop or switch statement
- Can be used with labels for nested loops

### continue Statement
- Skips the current iteration and continues with the next
- Can be used with labels for nested loops

### return Statement
- Exits the current method
- Can return a value (if method has return type)

## 📋 Operator Precedence

### Highest to Lowest Priority
1. `()` Parentheses
2. `++`, `--` Postfix increment/decrement
3. `++`, `--` Prefix increment/decrement
4. `+`, `-` Unary plus/minus
5. `!`, `~` Logical/Bitwise NOT
6. `*`, `/`, `%` Multiplication, Division, Modulus
7. `+`, `-` Addition, Subtraction
8. `<<`, `>>`, `>>>` Shift operators
9. `<`, `<=`, `>`, `>=` Relational operators
10. `==`, `!=` Equality operators
11. `&` Bitwise AND
12. `^` Bitwise XOR
13. `|` Bitwise OR
14. `&&` Logical AND
15. `||` Logical OR
16. `?:` Ternary operator
17. `=`, `+=`, `-=`, etc. Assignment operators

## ⚠️ Important Points

### Short-Circuit Evaluation
- `&&` and `||` use short-circuit evaluation
- Second operand is evaluated only if necessary
- `&` and `|` always evaluate both operands

### Null Safety
- Always check for null before using objects
- Use `==` for null comparison, not `.equals()`

### Loop Best Practices
- Avoid infinite loops
- Use appropriate loop type for the situation
- Consider performance implications
- Use meaningful variable names

### Switch Statement Notes
- `break` is required to prevent fall-through
- `default` case is optional but recommended
- Expression must be compatible with case values 