/** Day 05 Exercises: Methods, Overloading, Parameter Passing  * Core skills to master: 1. Creating and calling methods 2. Method overloading 3. Pass by value vs pass by reference 4. Returning values from methods 5. Real-world application in object-oriented design  */

public class Exercises {

    // Exercise 1: Simple Calculator Method     public static void exercise1() {         System.out.println("=== Exercise 1: Simple Calculator Method ===");

        // Step 1: Create a method that adds two numbers         int result = add(10, 20);         System.out.println("Sum of 10 and 20 is: " + result);

        System.out.println("Exercise 1 completed!");     }

    // Method for Exercise 1     public static int add(int a, int b) {         return a + b;     }

    // Exercise 2: Method Overloading     public static void exercise2() {         System.out.println("\n=== Exercise 2: Method Overloading ===");

        System.out.println("Sum of 5 and 10: " + sum(5, 10));         System.out.println("Sum of 5, 10 and 15: " + sum(5, 10, 15));         System.out.println("Sum of 2.5 and 3.5: " + sum(2.5, 3.5));

        System.out.println("Exercise 2 completed!");     }

    // Overloaded methods     public static int sum(int a, int b) {         return a + b;     }

    public static int sum(int a, int b, int c) {         return a + b + c;     }

    public static double sum(double a, double b) {         return a + b;     }

    // Exercise 3: Pass by Value vs Pass by Reference     public static void exercise3() {         System.out.println("\n=== Exercise 3: Pass by Value vs Pass by Reference ===");

        int x = 10;         System.out.println("Before modifyValue: " + x);         modifyValue(x);         System.out.println("After modifyValue: " + x + " (unchanged because primitives are pass-by-value)");

        int[] arr = {1, 2, 3};         System.out.println("Before modifyArray: " + arr[0]);         modifyArray(arr);         System.out.println("After modifyArray: " + arr[0] + " (changed because arrays are objects)");

        System.out.println("Exercise 3 completed!");     }

    // Methods for Exercise 3     public static void modifyValue(int num) {         num = 100;     }

    public static void modifyArray(int[] array) {         array[0] = 100;     }

    // Exercise 4: Returning Multiple Values via Object     public static void exercise4() {         System.out.println("\n=== Exercise 4: Returning Multiple Values via Object ===");

        Result res = calculate(15, 5);         System.out.println("Sum: " + res.sum + ", Difference: " + res.diff + ", Product: " + res.prod);

        System.out.println("Exercise 4 completed!");     }

    // Result class to hold multiple return values     static class Result {         int sum, diff, prod;

        Result(int sum, int diff, int prod) {             this.sum = sum;             this.diff = diff;             this.prod = prod;         }     }

    // Method that returns multiple values     public static Result calculate(int a, int b) {         return new Result(a + b, a - b, a * b);     }

    // Exercise 5: Real-World Example – Bank Account Methods     public static void exercise5() {         System.out.println("\n=== Exercise 5: Real-World Example – Bank Account Methods ===");

        BankAccount acc = new BankAccount("Dev", 1000);         acc.deposit(500);         acc.withdraw(300);         acc.showBalance();

        System.out.println("Exercise 5 completed!");     }

    // BankAccount class     static class BankAccount {         String owner;         double balance;

        BankAccount(String owner, double balance) {             this.owner = owner;             this.balance = balance;         }

        void deposit(double amount) {             balance += amount;             System.out.println(amount + " deposited.");         }

        void withdraw(double amount) {             if (amount <= balance) {                 balance -= amount;                 System.out.println(amount + " withdrawn.");             } else {                 System.out.println("Insufficient balance.");             }         }

        void showBalance() {             System.out.println(owner + "'s account balance: " + balance);         }     }

    public static void main(String[] args) {         System.out.println("Day 05 Exercises: Methods, Overloading, Parameter Passing\n");

        exercise1();         exercise2();         exercise3();         exercise4();         exercise5();

        System.out.println("\n=== Challenge Questions ===");         System.out.println("1. Create a method to reverse a string without using built-in functions.");         System.out.println("2. Implement method overloading for a 'multiply' function.");         System.out.println("3. Demonstrate pass-by-value and pass-by-reference using objects.");         System.out.println("4. Write a method that returns both min and max from an integer array.");         System.out.println("5. Design a small library system using methods to issue and return books.");     } }
