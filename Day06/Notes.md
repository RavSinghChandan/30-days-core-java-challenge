# Day 06: OOP Basics: Class, Object, Constructor, static, this

## 📚 Learning Objectives
- Understand the fundamentals of Object-Oriented Programming
- Master class and object creation in Java
- Learn about constructors and their types
- Understand static members and their usage
- Master the 'this' keyword and its applications

## 🏗️ Object-Oriented Programming Fundamentals

### What is OOP?
Object-Oriented Programming is a programming paradigm that organizes code into objects that contain data and code. The four main principles are:
- **Encapsulation**: Bundling data and methods that operate on that data
- **Inheritance**: Creating new classes from existing ones
- **Polymorphism**: Same interface, different implementations
- **Abstraction**: Hiding complex implementation details

## 📦 Class and Object

### Class Definition
A class is a blueprint or template for creating objects. It defines:
- **Attributes/Fields**: Data members (variables)
- **Methods**: Functions that operate on the data
- **Constructors**: Special methods for object initialization

```java
public class Student {
    // Attributes/Fields
    private String name;
    private int age;
    private String studentId;
    
    // Constructor
    public Student(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }
    
    // Methods
    public void study() {
        System.out.println(name + " is studying.");
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", ID: " + studentId);
    }
}
```

### Object Creation
Objects are instances of classes created using the `new` keyword:

```java
// Creating objects
Student student1 = new Student("Alice", 20, "S001");
Student student2 = new Student("Bob", 22, "S002");

// Using object methods
student1.study();
student2.displayInfo();
```

## 🔨 Constructors

### What is a Constructor?
A constructor is a special method that:
- Has the same name as the class
- Is called automatically when an object is created
- Initializes object attributes
- Has no return type (not even void)

### Types of Constructors

#### 1. Default Constructor
```java
public class Car {
    private String brand;
    private String model;
    
    // Default constructor (provided by Java if no constructor is defined)
    public Car() {
        // Default values
        this.brand = "Unknown";
        this.model = "Unknown";
    }
}
```

#### 2. Parameterized Constructor
```java
public class Car {
    private String brand;
    private String model;
    private int year;
    
    // Parameterized constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
}
```

#### 3. Copy Constructor
```java
public class Car {
    private String brand;
    private String model;
    private int year;
    
    // Copy constructor
    public Car(Car other) {
        this.brand = other.brand;
        this.model = other.model;
        this.year = other.year;
    }
}
```

### Constructor Overloading
```java
public class Rectangle {
    private int width;
    private int height;
    
    // Default constructor
    public Rectangle() {
        this.width = 1;
        this.height = 1;
    }
    
    // Constructor with one parameter
    public Rectangle(int side) {
        this.width = side;
        this.height = side;
    }
    
    // Constructor with two parameters
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
}
```

## 🔧 The 'this' Keyword

### What is 'this'?
The `this` keyword refers to the current object instance. It's used to:
- Distinguish between instance variables and parameters
- Call other constructors
- Return the current object reference

### Usage Examples

#### 1. Referring to Instance Variables
```java
public class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;  // 'this.name' refers to instance variable
        this.age = age;    // 'name' refers to parameter
    }
}
```

#### 2. Constructor Chaining
```java
public class Employee {
    private String name;
    private int id;
    private double salary;
    
    // Constructor with all parameters
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    
    // Constructor with name and id (calls the main constructor)
    public Employee(String name, int id) {
        this(name, id, 0.0);  // Calls the main constructor
    }
    
    // Default constructor (calls the two-parameter constructor)
    public Employee() {
        this("Unknown", 0);  // Calls the two-parameter constructor
    }
}
```

#### 3. Method Chaining
```java
public class StringBuilder {
    private String value = "";
    
    public StringBuilder append(String str) {
        this.value += str;
        return this;  // Returns current object for chaining
    }
    
    public StringBuilder append(int num) {
        this.value += num;
        return this;
    }
    
    public String toString() {
        return this.value;
    }
}

// Usage
StringBuilder sb = new StringBuilder()
    .append("Hello")
    .append(" ")
    .append("World")
    .append(2024);
```

## ⚡ Static Members

### What are Static Members?
Static members belong to the class rather than individual objects. They are shared across all instances of the class.

### Static Variables
```java
public class Counter {
    // Static variable (shared across all objects)
    public static int totalCount = 0;
    
    // Instance variable (unique to each object)
    private int instanceCount;
    
    public Counter() {
        instanceCount = 0;
    }
    
    public void increment() {
        instanceCount++;
        totalCount++;  // Increments the shared static variable
    }
    
    public void display() {
        System.out.println("Instance count: " + instanceCount);
        System.out.println("Total count: " + totalCount);
    }
}
```

### Static Methods
```java
public class MathUtils {
    // Static method (can be called without creating an object)
    public static int add(int a, int b) {
        return a + b;
    }
    
    public static int multiply(int a, int b) {
        return a * b;
    }
    
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
}

// Usage
int sum = MathUtils.add(5, 3);
double area = MathUtils.calculateArea(5.0);
```

### Static Blocks
```java
public class DatabaseConnection {
    private static String connectionString;
    private static int maxConnections;
    
    // Static block (executed once when class is loaded)
    static {
        connectionString = "jdbc:mysql://localhost:3306/mydb";
        maxConnections = 10;
        System.out.println("Database configuration loaded.");
    }
    
    public static void connect() {
        System.out.println("Connecting to: " + connectionString);
    }
}
```

### Static vs Instance Members

| Aspect | Static Members | Instance Members |
|--------|----------------|------------------|
| **Belongs to** | Class | Object |
| **Memory** | Shared across all objects | Unique to each object |
| **Access** | Class name or object reference | Object reference only |
| **Lifecycle** | Loaded with class | Created with object |
| **Usage** | Utility methods, constants | Object-specific data |

## 🎯 Best Practices

### Class Design
- Use meaningful class names (PascalCase)
- Keep classes focused on a single responsibility
- Use appropriate access modifiers
- Provide constructors for object initialization

### Constructor Best Practices
- Always provide constructors for complex objects
- Use constructor overloading for flexibility
- Use `this()` for constructor chaining
- Initialize all instance variables

### Static Member Best Practices
- Use static for utility methods and constants
- Avoid static variables that change state
- Use static blocks for one-time initialization
- Consider thread safety for static variables

### 'this' Keyword Best Practices
- Use `this` to distinguish instance variables from parameters
- Use `this()` for constructor chaining
- Use `this` for method chaining when appropriate
- Don't use `this` unnecessarily

## ⚠️ Important Points

### Memory Management
- Objects are created in heap memory
- Static members are stored in method area
- Garbage collection handles object cleanup
- Static members persist throughout application lifecycle

### Access Rules
- Static methods can only access static members
- Instance methods can access both static and instance members
- Static context cannot use `this` keyword
- Static members can be accessed without object creation

### Common Pitfalls
- Forgetting to use `this` when parameter names match instance variables
- Trying to access instance members from static context
- Not providing constructors when needed
- Overusing static members

## 📋 Summary
- Classes are blueprints for objects
- Objects are instances of classes
- Constructors initialize objects
- `this` refers to the current object
- Static members belong to the class
- OOP provides structure and organization to code
