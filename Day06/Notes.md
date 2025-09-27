
---

````markdown
# Day 06: OOP Basics – Class, Object, Constructor, static, this

---

## 1. Class
- A **class** is a blueprint/template for creating objects.
- It groups **fields (variables)** and **methods (functions)** together.
- It defines behavior but doesn’t occupy memory until an object is created.

### Example:
```java
class Car {
    String brand;
    int speed;

    void drive() {
        System.out.println(brand + " is driving at " + speed + " km/h");
    }
}
````

---

## 2. Object

* An **object** is an instance of a class created with the `new` keyword.
* Objects have **state (fields)** and **behavior (methods)**.

### Example:

```java
Car car1 = new Car();  // car1 is an object of Car
car1.brand = "Honda";
car1.speed = 120;
car1.drive();
```

---

## 3. Constructor

* Special method used to initialize objects.
* Rules:

    1. Same name as class.
    2. No return type.
* Types:

    * **Default Constructor**: provided by compiler if no constructor exists.
    * **Parameterized Constructor**: takes arguments for initialization.

### Example:

```java
class Student {
    String name;
    int rollNo;

    // Parameterized Constructor
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}
```

---

## 4. `this` Keyword

* Refers to **current object** of the class.
* Uses:

    1. To resolve variable shadowing.
    2. To call another constructor (constructor chaining).
    3. To return current object.

### Example: Resolving Shadowing

```java
class Employee {
    String name;

    Employee(String name) {
        this.name = name; // 'this' differentiates instance variable from parameter
    }
}
```

### Example: Constructor Chaining

```java
class Car {
    String brand;
    int speed;

    Car() {
        this("Unknown", 0); // calls another constructor
    }

    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
}
```

---

## 5. `static` Keyword

* Belongs to **class**, not individual objects.
* Shared across all objects of the class.
* Used for:

    * **Static Variables**: memory-efficient, shared values.
    * **Static Methods**: can be called without creating object.
    * **Static Blocks**: run once when class is loaded.
    * **Static Nested Classes**: class inside a class.

### Example: Static Variable

```java
class Counter {
    static int count = 0;

    Counter() {
        count++;
        System.out.println("Objects created: " + count);
    }
}
```

### Example: Static Method

```java
class Utility {
    static void printMessage() {
        System.out.println("Static method called!");
    }
}
Utility.printMessage(); // No object needed
```

---

## 6. Differences at a Glance

| Feature   | Instance (Non-static)           | Static (Class-level)           |
| --------- | ------------------------------- | ------------------------------ |
| Memory    | Separate copy for each object   | One copy shared by all objects |
| Access    | Accessed using object reference | Accessed using class name      |
| Lifecycle | Exists as long as object exists | Exists until program ends      |

---

## 7. Real-World Analogies

* **Class** = Blueprint of a building.
* **Object** = Actual house built from blueprint.
* **Constructor** = Builder that sets up the house during construction.
* **this** = Refers to "my house" (not someone else’s).
* **static** = Common electricity grid shared by all houses.

---

## ✅ Key Takeaways

1. A **class** defines the structure; an **object** brings it to life.
2. **Constructors** simplify initialization of objects.
3. The `this` keyword helps avoid ambiguity and supports constructor chaining.
4. The `static` keyword enables shared variables, methods, and blocks across all objects, improving memory usage.

```

---

```
