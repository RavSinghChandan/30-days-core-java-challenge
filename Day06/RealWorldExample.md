
---

## **2️⃣ RealWorldExample.md**

```markdown
# RealWorldExample.java – Day 06

```java
class Student {
    String name;
    int rollNo;
    static String college = "IIT Delhi"; // static shared property

    // Constructor
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println(name + " (" + rollNo + ") - " + college);
    }

    // Using 'this' to return current object
    Student getStudent() {
        return this;
    }
}

public class RealWorldExample {
    public static void main(String[] args) {
        Student s1 = new Student("Arjun", 101);
        Student s2 = new Student("Meera", 102);

        s1.display();
        s2.display();

        // Demonstrating 'this'
        Student ref = s1.getStudent();
        System.out.println("Reference from this: " + ref.name);

        // Static variable is shared
        Student.college = "IIM Bangalore";
        s1.display();
        s2.display();
    }
}
