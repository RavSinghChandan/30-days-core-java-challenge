# Day 01: Java Basics - JVM, JRE, JDK, Compilation Flow, Hello World

## 📚 Learning Objectives
- Understand the Java ecosystem: JVM, JRE, JDK
- Learn the Java compilation and execution process
- Write and run your first Java program
- Understand the structure of a Java program

## 🔧 Java Ecosystem

### JVM (Java Virtual Machine)
- **Definition**: A virtual machine that provides runtime environment to execute Java bytecode
- **Platform Independent**: Write once, run anywhere
- **Memory Management**: Automatic garbage collection
- **Security**: Sandboxed execution environment

### JRE (Java Runtime Environment)
- **Components**: JVM + Java class libraries + other supporting files
- **Purpose**: Provides runtime environment to run Java applications
- **End Users**: Need only JRE to run Java applications

### JDK (Java Development Kit)
- **Components**: JRE + Development tools (compiler, debugger, etc.)
- **Purpose**: Complete development environment for Java
- **Developers**: Need JDK to write, compile, and run Java programs

## 🔄 Java Compilation Flow

```
Java Source Code (.java)
           ↓
    Java Compiler (javac)
           ↓
    Bytecode (.class)
           ↓
    JVM (java)
           ↓
    Machine Code (OS specific)
```

### Steps:
1. **Write**: Create `.java` file with source code
2. **Compile**: Use `javac` to convert to `.class` (bytecode)
3. **Execute**: Use `java` command to run on JVM

## 📝 Basic Java Program Structure

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### Key Components:
- **Class Declaration**: `public class ClassName`
- **Main Method**: Entry point of the program
- **Package Declaration**: Optional, goes at the top
- **Import Statements**: Optional, for using other classes

## 🛠️ Essential Commands

```bash
# Compile Java file
javac HelloWorld.java

# Run Java program
java HelloWorld

# Check Java version
java -version
javac -version
```

## 📋 Key Points to Remember
- Java is case-sensitive
- File name must match class name (for public classes)
- Every statement ends with semicolon (;)
- Main method is the entry point
- Java follows camelCase naming convention 