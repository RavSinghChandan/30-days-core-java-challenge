# Day 02: Variables, Data Types, Type Casting, Wrapper Classes

## 📚 Learning Objectives
- Understand Java data types and their memory requirements
- Learn variable declaration and initialization
- Master type casting (implicit and explicit)
- Understand wrapper classes and their purpose
- Learn autoboxing and unboxing

## 🔢 Data Types in Java

### Primitive Data Types
1. **byte** (8 bits)
   - Range: -128 to 127
   - Use case: Small numbers, file I/O

2. **short** (16 bits)
   - Range: -32,768 to 32,767
   - Use case: Memory optimization

3. **int** (32 bits)
   - Range: -2³¹ to 2³¹-1
   - Use case: Most common integer type

4. **long** (64 bits)
   - Range: -2⁶³ to 2⁶³-1
   - Use case: Large numbers, timestamps

5. **float** (32 bits)
   - Precision: 6-7 decimal digits
   - Use case: Single precision floating point

6. **double** (64 bits)
   - Precision: 15-16 decimal digits
   - Use case: Default floating point type

7. **char** (16 bits)
   - Range: 0 to 65,535 (Unicode)
   - Use case: Single characters

8. **boolean** (1 bit)
   - Values: true or false
   - Use case: Logical operations

## 📝 Variable Declaration and Initialization

### Syntax
```java
// Declaration
dataType variableName;

// Initialization
variableName = value;

// Declaration and initialization
dataType variableName = value;
```

### Naming Conventions
- Use camelCase: `firstName`, `totalAmount`
- Start with letter, underscore, or dollar sign
- Cannot use reserved keywords
- Case sensitive

## 🔄 Type Casting

### Implicit Casting (Widening)
- Automatic conversion from smaller to larger data type
- No data loss
- Examples: byte → short → int → long → float → double

```java
int num = 100;
long bigNum = num; // Implicit casting
```

### Explicit Casting (Narrowing)
- Manual conversion from larger to smaller data type
- May cause data loss
- Examples: double → float → long → int → short → byte

```java
double bigNum = 100.5;
int num = (int) bigNum; // Explicit casting
```

## 📦 Wrapper Classes

### Purpose
- Convert primitives to objects
- Provide utility methods
- Use in collections (which require objects)

### Primitive to Wrapper Mapping
- `byte` → `Byte`
- `short` → `Short`
- `int` → `Integer`
- `long` → `Long`
- `float` → `Float`
- `double` → `Double`
- `char` → `Character`
- `boolean` → `Boolean`

### Autoboxing and Unboxing
```java
// Autoboxing (Java 5+)
Integer num = 100; // int → Integer

// Unboxing
int value = num; // Integer → int
```

## 🛠️ Common Operations

### String Conversion
```java
// Primitive to String
String str = String.valueOf(100);

// String to primitive
int num = Integer.parseInt("100");
double d = Double.parseDouble("100.5");
```

### Utility Methods
```java
Integer.parseInt("123");     // String to int
Integer.toString(123);       // int to String
Integer.max(10, 20);         // Maximum value
Integer.min(10, 20);         // Minimum value
Integer.valueOf("123");      // String to Integer object
```

## ⚠️ Important Points

### Type Safety
- Java is strongly typed
- Compiler checks type compatibility
- Runtime type checking for objects

### Memory Considerations
- Primitives are stored in stack
- Objects are stored in heap
- Wrapper classes have overhead

### Null Handling
- Primitives cannot be null
- Wrapper classes can be null
- NullPointerException risk with unboxing 