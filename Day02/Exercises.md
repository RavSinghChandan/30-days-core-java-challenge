/** Exercises - Day 02: Variables, Data Types, Type Casting, Wrapper Classes

Exercise 1: Create variables of all primitive data types and demonstrate their ranges Exercise 2: Perform various type casting operations and observe data loss Exercise 3: Use wrapper classes to convert between String and primitive types Exercise 4: Demonstrate autoboxing and unboxing with collections Exercise 5: Create a temperature converter using different data types  */

public class Exercises {

    // Exercise 1: Demonstrate all primitive data types     public static void exercise1() {         System.out.println("=== Exercise 1: Primitive Data Types ===");

        // TODO: Declare variables of all primitive types         // TODO: Assign appropriate values         // TODO: Print their values and ranges

        // Your code here:         byte byteValue = 127;         short shortValue = 32767;         int intValue = 2147483647;         long longValue = 9223372036854775807L;         float floatValue = 3.14f;         double doubleValue = 3.14159265359;         char charValue = 'A';         boolean booleanValue = true;

        System.out.println("byte: " + byteValue + " (Range: -128 to 127)");         System.out.println("short: " + shortValue + " (Range: -32,768 to 32,767)");         System.out.println("int: " + intValue + " (Range: -2^31 to 2^31-1)");         System.out.println("long: " + longValue + " (Range: -2^63 to 2^63-1)");         System.out.println("float: " + floatValue + " (Precision: 6-7 digits)");         System.out.println("double: " + doubleValue + " (Precision: 15-16 digits)");         System.out.println("char: " + charValue + " (Unicode: 0 to 65,535)");         System.out.println("boolean: " + booleanValue + " (true or false)");     }

    // Exercise 2: Type casting demonstrations     public static void exercise2() {         System.out.println("\n=== Exercise 2: Type Casting ===");

        // TODO: Demonstrate implicit casting (widening)         // TODO: Demonstrate explicit casting (narrowing)         // TODO: Show data loss scenarios         // TODO: Demonstrate character casting

        // Your code here:

        // Implicit casting         int intNum = 100;         long longNum = intNum; // int → long         float floatNum = intNum; // int → float         double doubleNum = intNum; // int → double

        System.out.println("Implicit casting:");         System.out.println("int: " + intNum + " → long: " + longNum);         System.out.println("int: " + intNum + " → float: " + floatNum);         System.out.println("int: " + intNum + " → double: " + doubleNum);

        // Explicit casting with data loss         double bigDouble = 123.456;         int smallInt = (int) bigDouble; // double → int         float smallFloat = (float) bigDouble; // double → float

        System.out.println("\nExplicit casting with data loss:");         System.out.println("double: " + bigDouble + " → int: " + smallInt);         System.out.println("double: " + bigDouble + " → float: " + smallFloat);

        // Character casting         char letter = 'A';         int ascii = letter; // char → int         char nextLetter = (char) (letter + 1); // int → char

        System.out.println("\nCharacter casting:");         System.out.println("char: " + letter + " → int (ASCII): " + ascii);         System.out.println("char: " + letter + " + 1 = " + nextLetter);     }

    // Exercise 3: Wrapper class conversions     public static void exercise3() {         System.out.println("\n=== Exercise 3: Wrapper Class Conversions ===");

        // TODO: Convert String to primitive types         // TODO: Convert primitive types to String         // TODO: Use wrapper class utility methods         // TODO: Handle NumberFormatException

        // Your code here:

        // String to primitive         String intStr = "123";         String doubleStr = "123.45";         String booleanStr = "true";

        int intValue = Integer.parseInt(intStr);         double doubleValue = Double.parseDouble(doubleStr);         boolean booleanValue = Boolean.parseBoolean(booleanStr);

        System.out.println("String to primitive:");         System.out.println("String: " + intStr + " → int: " + intValue);         System.out.println("String: " + doubleStr + " → double: " + doubleValue);         System.out.println("String: " + booleanStr + " → boolean: " + booleanValue);

        // Primitive to String         int num = 456;         double price = 99.99;         boolean flag = false;

        String numStr = String.valueOf(num);         String priceStr = String.valueOf(price);         String flagStr = String.valueOf(flag);

        System.out.println("\nPrimitive to String:");         System.out.println("int: " + num + " → String: " + numStr);         System.out.println("double: " + price + " → String: " + priceStr);         System.out.println("boolean: " + flag + " → String: " + flagStr);

        // Wrapper utility methods         System.out.println("\nWrapper utility methods:");         System.out.println("Max of 10 and 20: " + Integer.max(10, 20));         System.out.println("Min of 10 and 20: " + Integer.min(10, 20));         System.out.println("Binary of 10: " + Integer.toBinaryString(10));         System.out.println("Hex of 255: " + Integer.toHexString(255));     }

    // Exercise 4: Autoboxing and unboxing     public static void exercise4() {         System.out.println("\n=== Exercise 4: Autoboxing and Unboxing ===");

        // TODO: Demonstrate autoboxing         // TODO: Demonstrate unboxing         // TODO: Use in arithmetic operations         // TODO: Show null handling

        // Your code here:

        // Autoboxing         Integer boxedInt = 100; // int → Integer         Double boxedDouble = 3.14; // double → Double         Boolean boxedBoolean = true; // boolean → Boolean

        System.out.println("Autoboxing:");         System.out.println("int → Integer: " + boxedInt);         System.out.println("double → Double: " + boxedDouble);         System.out.println("boolean → Boolean: " + boxedBoolean);

        // Unboxing         int unboxedInt = boxedInt; // Integer → int         double unboxedDouble = boxedDouble; // Double → double         boolean unboxedBoolean = boxedBoolean; // Boolean → boolean

        System.out.println("\nUnboxing:");         System.out.println("Integer → int: " + unboxedInt);         System.out.println("Double → double: " + unboxedDouble);         System.out.println("Boolean → boolean: " + unboxedBoolean);

        // Arithmetic operations         Integer a = 10;         Integer b = 20;         int result = a + b; // Unboxing happens automatically

        System.out.println("\nArithmetic with autoboxing:");         System.out.println(a + " + " + b + " = " + result);

        // Null handling         Integer nullableInt = null;         if (nullableInt != null) {             int value = nullableInt; // This would cause NullPointerException             System.out.println("Value: " + value);         } else {             System.out.println("Integer is null - cannot unbox");         }     }

    // Exercise 5: Temperature converter     public static void exercise5() {         System.out.println("\n=== Exercise 5: Temperature Converter ===");

        // TODO: Create a temperature converter         // TODO: Use different data types appropriately         // TODO: Handle precision with floating point         // TODO: Use wrapper classes for input validation

        // Your code here:

        // Celsius to Fahrenheit converter         double celsius = 25.0;         double fahrenheit = (celsius * 9.0 / 5.0) + 32;

        System.out.println("Temperature Conversion:");         System.out.printf("Celsius: %.1f°C%n", celsius);         System.out.printf("Fahrenheit: %.1f°F%n", fahrenheit);

        // Using wrapper classes for validation         String tempStr = "30.5";         try {             Double tempDouble = Double.valueOf(tempStr);             double convertedFahrenheit = (tempDouble * 9.0 / 5.0) + 32;             System.out.printf("\nString input: %s°C = %.1f°F%n", tempStr, convertedFahrenheit);         } catch (NumberFormatException e) {             System.out.println("Invalid temperature format: " + tempStr);         }

        // Temperature ranges using different data types         byte minTemp = -128; // Minimum byte value         short maxTemp = 32767; // Maximum short value         int currentTemp = 25;

        System.out.println("\nTemperature ranges:");         System.out.println("Minimum temperature (byte): " + minTemp + "°C");         System.out.println("Maximum temperature (short): " + maxTemp + "°C");         System.out.println("Current temperature (int): " + currentTemp + "°C");     }

    public static void main(String[] args) {         System.out.println("Day 02 Exercises: Variables, Data Types, Type Casting, Wrapper Classes\n");

        exercise1();         exercise2();         exercise3();         exercise4();         exercise5();

        System.out.println("\n=== Challenge Questions ===");         System.out.println("1. Create a program that demonstrates overflow in different data types");         System.out.println("2. Write a method that safely converts String to Integer with null handling");         System.out.println("3. Create a calculator that uses wrapper classes for all operations");         System.out.println("4. Demonstrate the difference between == and equals() with wrapper classes");         System.out.println("5. Create a program that shows memory usage differences between primitives and wrappers");     } } 
