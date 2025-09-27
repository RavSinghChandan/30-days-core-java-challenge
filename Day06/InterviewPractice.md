
---

## **3️⃣ InterviewPractice.md**

```markdown
# Day 06: Interview Practice – OOP Basics

---

### Q1: What is the difference between a constructor and a method?
**Answer:**
- A constructor is automatically called when an object is created; it has no return type.
- A method is explicitly called, and it usually returns something.

---

### Q2: Can a constructor be static?
**Answer:**
- No, because static belongs to class, while constructors are tied to object creation.

---

### Q3: How is `this` used inside a constructor?
**Answer:**
- To differentiate between instance variables and parameters:
```java
class Car {
    String brand;
    Car(String brand) {
        this.brand = brand;
    }
}
---
Q4: What happens if we declare a variable as static in a class?

Answer:

It becomes shared among all objects of the class instead of being unique per object.

Q5: Real-world analogy of static

Answer:

A canteen in a college is static → shared by all students.

Each student’s ID card (non-static) is unique to them.