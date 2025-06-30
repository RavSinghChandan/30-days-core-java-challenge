/**
 * Exercises - Day 06: OOP Basics: Class, Object, Constructor, static, this
 * 
 * Exercise 1: Create a Student class with constructors and methods
 * Exercise 2: Implement a Calculator class with static and instance methods
 * Exercise 3: Create a Rectangle class with method chaining
 * Exercise 4: Build a Library Management System with multiple classes
 * Exercise 5: Implement a Counter class with static tracking
 */

public class Exercises {
    
    // Exercise 1: Student class
    public static void exercise1() {
        System.out.println("=== Exercise 1: Student Class ===");
        
        // TODO: Create a Student class with:
        // 1. Instance variables: name, id, age, grades (array)
        // 2. Multiple constructors (default, parameterized, copy)
        // 3. Methods: addGrade, calculateAverage, displayInfo
        // 4. Use 'this' keyword appropriately
        
        // Your code here:
        
        // Create Student class
        class Student {
            private String name;
            private String id;
            private int age;
            private double[] grades;
            private int gradeCount;
            
            // Default constructor
            public Student() {
                this("Unknown", "ID000", 18);
            }
            
            // Parameterized constructor
            public Student(String name, String id, int age) {
                this.name = name;
                this.id = id;
                this.age = age;
                this.grades = new double[10];
                this.gradeCount = 0;
            }
            
            // Copy constructor
            public Student(Student other) {
                this(other.name, other.id, other.age);
                for (int i = 0; i < other.gradeCount; i++) {
                    this.grades[i] = other.grades[i];
                }
                this.gradeCount = other.gradeCount;
            }
            
            // Methods
            public void addGrade(double grade) {
                if (gradeCount < grades.length && grade >= 0 && grade <= 100) {
                    grades[gradeCount++] = grade;
                    System.out.println("Grade " + grade + " added for " + name);
                } else {
                    System.out.println("Invalid grade or grade array full");
                }
            }
            
            public double calculateAverage() {
                if (gradeCount == 0) return 0.0;
                
                double sum = 0;
                for (int i = 0; i < gradeCount; i++) {
                    sum += grades[i];
                }
                return sum / gradeCount;
            }
            
            public void displayInfo() {
                System.out.println("Student: " + name + " (ID: " + id + ", Age: " + age + ")");
                System.out.println("Grades: ");
                for (int i = 0; i < gradeCount; i++) {
                    System.out.print(grades[i] + " ");
                }
                System.out.println("\nAverage: " + calculateAverage());
            }
        }
        
        // Test the Student class
        Student student1 = new Student("Alice", "S001", 20);
        Student student2 = new Student("Bob", "S002", 22);
        Student student3 = new Student(student1); // Copy constructor
        
        student1.addGrade(85.5);
        student1.addGrade(92.0);
        student1.addGrade(78.5);
        
        student2.addGrade(90.0);
        student2.addGrade(88.5);
        
        student3.addGrade(95.0);
        
        System.out.println("Student 1:");
        student1.displayInfo();
        
        System.out.println("\nStudent 2:");
        student2.displayInfo();
        
        System.out.println("\nStudent 3 (copy of Student 1):");
        student3.displayInfo();
    }
    
    // Exercise 2: Calculator class
    public static void exercise2() {
        System.out.println("\n=== Exercise 2: Calculator Class ===");
        
        // TODO: Create a Calculator class with:
        // 1. Static methods for basic operations
        // 2. Instance variables to track calculation history
        // 3. Instance methods for complex calculations
        // 4. Static counter for total calculations performed
        
        // Your code here:
        
        class Calculator {
            private double lastResult;
            private int operationCount;
            private static int totalCalculations = 0;
            
            public Calculator() {
                this.lastResult = 0;
                this.operationCount = 0;
            }
            
            // Static methods
            public static double add(double a, double b) {
                totalCalculations++;
                return a + b;
            }
            
            public static double subtract(double a, double b) {
                totalCalculations++;
                return a - b;
            }
            
            public static double multiply(double a, double b) {
                totalCalculations++;
                return a * b;
            }
            
            public static double divide(double a, double b) {
                totalCalculations++;
                if (b != 0) {
                    return a / b;
                } else {
                    System.out.println("Error: Division by zero");
                    return 0;
                }
            }
            
            // Instance methods
            public double performOperation(String operation, double operand) {
                operationCount++;
                switch (operation.toLowerCase()) {
                    case "add":
                        lastResult = add(lastResult, operand);
                        break;
                    case "subtract":
                        lastResult = subtract(lastResult, operand);
                        break;
                    case "multiply":
                        lastResult = multiply(lastResult, operand);
                        break;
                    case "divide":
                        lastResult = divide(lastResult, operand);
                        break;
                    default:
                        System.out.println("Unknown operation");
                        return lastResult;
                }
                return lastResult;
            }
            
            public void clear() {
                lastResult = 0;
                operationCount = 0;
                System.out.println("Calculator cleared");
            }
            
            public void displayInfo() {
                System.out.println("Last result: " + lastResult);
                System.out.println("Operations performed: " + operationCount);
                System.out.println("Total calculations (static): " + totalCalculations);
            }
            
            public static int getTotalCalculations() {
                return totalCalculations;
            }
        }
        
        // Test the Calculator class
        System.out.println("Static calculations:");
        System.out.println("5 + 3 = " + Calculator.add(5, 3));
        System.out.println("10 - 4 = " + Calculator.subtract(10, 4));
        System.out.println("6 * 7 = " + Calculator.multiply(6, 7));
        System.out.println("15 / 3 = " + Calculator.divide(15, 3));
        
        Calculator calc1 = new Calculator();
        Calculator calc2 = new Calculator();
        
        System.out.println("\nInstance calculations (Calculator 1):");
        calc1.performOperation("add", 10);
        calc1.performOperation("multiply", 2);
        calc1.performOperation("subtract", 5);
        calc1.displayInfo();
        
        System.out.println("\nInstance calculations (Calculator 2):");
        calc2.performOperation("add", 20);
        calc2.performOperation("divide", 4);
        calc2.displayInfo();
        
        System.out.println("\nTotal calculations across all calculators: " + Calculator.getTotalCalculations());
    }
    
    // Exercise 3: Rectangle class with method chaining
    public static void exercise3() {
        System.out.println("\n=== Exercise 3: Rectangle Class with Method Chaining ===");
        
        // TODO: Create a Rectangle class with:
        // 1. Instance variables: width, height
        // 2. Constructors with chaining
        // 3. Methods that return 'this' for chaining
        // 4. Methods: setWidth, setHeight, scale, display
        
        // Your code here:
        
        class Rectangle {
            private double width;
            private double height;
            
            // Constructors with chaining
            public Rectangle() {
                this(1.0, 1.0);
            }
            
            public Rectangle(double side) {
                this(side, side);
            }
            
            public Rectangle(double width, double height) {
                this.width = width;
                this.height = height;
            }
            
            // Method chaining methods
            public Rectangle setWidth(double width) {
                this.width = width;
                return this;
            }
            
            public Rectangle setHeight(double height) {
                this.height = height;
                return this;
            }
            
            public Rectangle scale(double factor) {
                this.width *= factor;
                this.height *= factor;
                return this;
            }
            
            public Rectangle display() {
                System.out.println("Rectangle: " + width + " x " + height);
                System.out.println("Area: " + getArea());
                System.out.println("Perimeter: " + getPerimeter());
                return this;
            }
            
            public double getArea() {
                return width * height;
            }
            
            public double getPerimeter() {
                return 2 * (width + height);
            }
        }
        
        // Test method chaining
        System.out.println("Creating rectangles with method chaining:");
        
        Rectangle rect1 = new Rectangle()
            .setWidth(5)
            .setHeight(3)
            .display();
        
        Rectangle rect2 = new Rectangle(4)
            .scale(2)
            .display();
        
        Rectangle rect3 = new Rectangle(2, 6)
            .setWidth(8)
            .scale(0.5)
            .setHeight(4)
            .display();
    }
    
    // Exercise 4: Library Management System
    public static void exercise4() {
        System.out.println("\n=== Exercise 4: Library Management System ===");
        
        // TODO: Create a simple library system with:
        // 1. Book class with title, author, isbn, available status
        // 2. Library class to manage books
        // 3. Static tracking of total books and borrowed books
        // 4. Methods: addBook, borrowBook, returnBook, displayBooks
        
        // Your code here:
        
        class Book {
            private String title;
            private String author;
            private String isbn;
            private boolean available;
            
            public Book(String title, String author, String isbn) {
                this.title = title;
                this.author = author;
                this.isbn = isbn;
                this.available = true;
            }
            
            public String getTitle() { return title; }
            public String getAuthor() { return author; }
            public String getIsbn() { return isbn; }
            public boolean isAvailable() { return available; }
            
            public void setAvailable(boolean available) {
                this.available = available;
            }
            
            public void displayInfo() {
                System.out.println("Title: " + title + " | Author: " + author + 
                                 " | ISBN: " + isbn + " | Available: " + available);
            }
        }
        
        class Library {
            private Book[] books;
            private int bookCount;
            private static int totalBooks = 0;
            private static int totalBorrowed = 0;
            
            public Library(int capacity) {
                this.books = new Book[capacity];
                this.bookCount = 0;
            }
            
            public boolean addBook(Book book) {
                if (bookCount < books.length) {
                    books[bookCount++] = book;
                    totalBooks++;
                    System.out.println("Book added: " + book.getTitle());
                    return true;
                } else {
                    System.out.println("Library is full");
                    return false;
                }
            }
            
            public boolean borrowBook(String isbn) {
                for (int i = 0; i < bookCount; i++) {
                    if (books[i].getIsbn().equals(isbn) && books[i].isAvailable()) {
                        books[i].setAvailable(false);
                        totalBorrowed++;
                        System.out.println("Book borrowed: " + books[i].getTitle());
                        return true;
                    }
                }
                System.out.println("Book not found or not available");
                return false;
            }
            
            public boolean returnBook(String isbn) {
                for (int i = 0; i < bookCount; i++) {
                    if (books[i].getIsbn().equals(isbn) && !books[i].isAvailable()) {
                        books[i].setAvailable(true);
                        totalBorrowed--;
                        System.out.println("Book returned: " + books[i].getTitle());
                        return true;
                    }
                }
                System.out.println("Book not found or already returned");
                return false;
            }
            
            public void displayBooks() {
                System.out.println("\nLibrary Books:");
                for (int i = 0; i < bookCount; i++) {
                    books[i].displayInfo();
                }
            }
            
            public static void displayStats() {
                System.out.println("\nLibrary Statistics:");
                System.out.println("Total books: " + totalBooks);
                System.out.println("Currently borrowed: " + totalBorrowed);
                System.out.println("Available: " + (totalBooks - totalBorrowed));
            }
        }
        
        // Test the Library Management System
        Library library = new Library(10);
        
        Book book1 = new Book("Java Programming", "John Doe", "ISBN001");
        Book book2 = new Book("Data Structures", "Jane Smith", "ISBN002");
        Book book3 = new Book("Algorithms", "Bob Johnson", "ISBN003");
        
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        
        library.displayBooks();
        Library.displayStats();
        
        library.borrowBook("ISBN001");
        library.borrowBook("ISBN002");
        
        library.displayBooks();
        Library.displayStats();
        
        library.returnBook("ISBN001");
        
        library.displayBooks();
        Library.displayStats();
    }
    
    // Exercise 5: Counter class with static tracking
    public static void exercise5() {
        System.out.println("\n=== Exercise 5: Counter Class with Static Tracking ===");
        
        // TODO: Create a Counter class with:
        // 1. Instance counter and static total counter
        // 2. Methods: increment, decrement, reset
        // 3. Static methods to get statistics
        // 4. Demonstrate static vs instance behavior
        
        // Your code here:
        
        class Counter {
            private int count;
            private static int totalCount = 0;
            private static int totalIncrements = 0;
            private static int totalDecrements = 0;
            
            public Counter() {
                this.count = 0;
            }
            
            public Counter(int initialValue) {
                this.count = initialValue;
                totalCount += initialValue;
            }
            
            public void increment() {
                count++;
                totalCount++;
                totalIncrements++;
            }
            
            public void decrement() {
                count--;
                totalCount--;
                totalDecrements++;
            }
            
            public void reset() {
                totalCount -= count;
                count = 0;
            }
            
            public int getCount() {
                return count;
            }
            
            public void displayInfo() {
                System.out.println("Instance count: " + count);
            }
            
            // Static methods
            public static int getTotalCount() {
                return totalCount;
            }
            
            public static int getTotalIncrements() {
                return totalIncrements;
            }
            
            public static int getTotalDecrements() {
                return totalDecrements;
            }
            
            public static void displayStats() {
                System.out.println("Total count across all counters: " + totalCount);
                System.out.println("Total increments: " + totalIncrements);
                System.out.println("Total decrements: " + totalDecrements);
            }
        }
        
        // Test the Counter class
        Counter counter1 = new Counter();
        Counter counter2 = new Counter(10);
        Counter counter3 = new Counter(5);
        
        System.out.println("Initial state:");
        counter1.displayInfo();
        counter2.displayInfo();
        counter3.displayInfo();
        Counter.displayStats();
        
        System.out.println("\nAfter operations:");
        counter1.increment();
        counter1.increment();
        counter1.increment();
        
        counter2.decrement();
        counter2.decrement();
        
        counter3.increment();
        counter3.increment();
        counter3.decrement();
        
        counter1.displayInfo();
        counter2.displayInfo();
        counter3.displayInfo();
        Counter.displayStats();
        
        System.out.println("\nAfter reset:");
        counter1.reset();
        counter1.displayInfo();
        Counter.displayStats();
    }
    
    public static void main(String[] args) {
        System.out.println("Day 06 Exercises: OOP Basics\n");
        
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
        
        System.out.println("\n=== Challenge Questions ===");
        System.out.println("1. Create a singleton class using static members");
        System.out.println("2. Implement a factory pattern for object creation");
        System.out.println("3. Create a class with both static and instance initializer blocks");
        System.out.println("4. Build a class hierarchy with inheritance and constructors");
        System.out.println("5. Implement a builder pattern with method chaining");
    }
}
