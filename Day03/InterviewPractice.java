/**
 * Interview Practice Questions - Day 03: Operators, Conditionals, Loops
 * 
 * Question 1: What is the difference between == and .equals() in Java?
 * Question 2: Explain short-circuit evaluation in logical operators
 * Question 3: What is the difference between break and continue statements?
 */

public class InterviewPractice {
    
    // Question 1: == vs .equals()
    public static void explainEqualsVsEquals() {
        System.out.println("=== Question 1: == vs .equals() ===");
        
        // TODO: Explain the difference between == and .equals()
        // 1. What does == compare?
        // 2. What does .equals() compare?
        // 3. When to use each?
        // 4. Show examples with strings and primitives
        
        System.out.println("Your answer:");
        // Write your explanation here
        
        System.out.println("\nKey differences:");
        System.out.println("- == compares references (memory addresses)");
        System.out.println("- .equals() compares content/values");
        System.out.println("- == for primitives, .equals() for objects");
        System.out.println("- String literals may be interned (same reference)");
    }
    
    // Question 2: Short-circuit evaluation
    public static void explainShortCircuit() {
        System.out.println("\n=== Question 2: Short-Circuit Evaluation ===");
        
        // TODO: Explain short-circuit evaluation
        // 1. What is short-circuit evaluation?
        // 2. Which operators use it?
        // 3. What are the benefits?
        // 4. Show examples
        
        System.out.println("Your answer:");
        // Write your explanation here
        
        System.out.println("\nKey points:");
        System.out.println("- && and || use short-circuit evaluation");
        System.out.println("- Second operand evaluated only if necessary");
        System.out.println("- & and | always evaluate both operands");
        System.out.println("- Useful for null checks and performance");
    }
    
    // Question 3: Break vs Continue
    public static void explainBreakVsContinue() {
        System.out.println("\n=== Question 3: Break vs Continue ===");
        
        // TODO: Explain break and continue
        // 1. What does break do?
        // 2. What does continue do?
        // 3. When to use each?
        // 4. Show examples
        
        System.out.println("Your answer:");
        // Write your explanation here
        
        System.out.println("\nKey differences:");
        System.out.println("- break: exits the loop completely");
        System.out.println("- continue: skips current iteration, continues loop");
        System.out.println("- Both can be used with labels for nested loops");
        System.out.println("- break also used in switch statements");
    }
    
    // Question 4: Operator precedence
    public static void demonstrateOperatorPrecedence() {
        System.out.println("\n=== Question 4: Operator Precedence ===");
        
        // TODO: Demonstrate operator precedence
        // 1. Show examples of precedence
        // 2. Explain how parentheses affect evaluation
        // 3. Show common pitfalls
        
        System.out.println("Your demonstration:");
        // Write your demonstration here
        
        System.out.println("\nCommon precedence rules:");
        System.out.println("- Parentheses have highest precedence");
        System.out.println("- Multiplication/Division before Addition/Subtraction");
        System.out.println("- Logical AND before OR");
        System.out.println("- Assignment has lowest precedence");
    }
    
    // Question 5: Loop types and when to use them
    public static void explainLoopTypes() {
        System.out.println("\n=== Question 5: Loop Types ===");
        
        // TODO: Explain different loop types
        // 1. When to use for loop?
        // 2. When to use while loop?
        // 3. When to use do-while loop?
        // 4. Show examples
        
        System.out.println("Your explanation:");
        // Write your explanation here
        
        System.out.println("\nLoop usage guidelines:");
        System.out.println("- for: when you know number of iterations");
        System.out.println("- while: when condition is checked before loop");
        System.out.println("- do-while: when loop must execute at least once");
        System.out.println("- enhanced for: when iterating over collections");
    }
    
    public static void main(String[] args) {
        System.out.println("Interview Practice - Day 03: Operators, Conditionals, Loops\n");
        
        explainEqualsVsEquals();
        explainShortCircuit();
        explainBreakVsContinue();
        demonstrateOperatorPrecedence();
        explainLoopTypes();
        
        System.out.println("\n=== Additional Practice Questions ===");
        System.out.println("1. What is the difference between pre-increment and post-increment?");
        System.out.println("2. How do you handle null values in conditional statements?");
        System.out.println("3. What is the ternary operator and how do you use it?");
        System.out.println("4. How do you create an infinite loop and how do you break out of it?");
        System.out.println("5. What is the difference between logical and bitwise operators?");
        System.out.println("6. How do you use labels with break and continue?");
        System.out.println("7. What is the switch expression in Java 14+?");
        System.out.println("8. How do you avoid infinite loops in while and do-while loops?");
    }
} 