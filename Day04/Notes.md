# Day 04: Arrays & 2D Arrays – Declaration, Traversal, Memory

## 📚 Learning Objectives
- Understand array declaration and initialization
- Learn array traversal techniques
- Master 2D arrays and multidimensional arrays
- Understand array memory management
- Practice common array operations

## 📦 Arrays in Java

### Array Declaration
```java
// Declaration
dataType[] arrayName;

// Declaration and initialization
dataType[] arrayName = new dataType[size];

// Declaration with values
dataType[] arrayName = {value1, value2, value3};
```

### Array Initialization
```java
// Method 1: Using new keyword
int[] numbers = new int[5];

// Method 2: Using array literal
int[] numbers = {1, 2, 3, 4, 5};

// Method 3: Declare first, initialize later
int[] numbers;
numbers = new int[5];
```

### Array Properties
- Fixed size once created
- Zero-based indexing
- Contiguous memory allocation
- Length property available
- Type safety

## 🔄 Array Traversal

### Traditional for Loop
```java
int[] numbers = {1, 2, 3, 4, 5};
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}
```

### Enhanced for Loop (for-each)
```java
int[] numbers = {1, 2, 3, 4, 5};
for (int number : numbers) {
    System.out.println(number);
}
```

### While Loop
```java
int[] numbers = {1, 2, 3, 4, 5};
int i = 0;
while (i < numbers.length) {
    System.out.println(numbers[i]);
    i++;
}
```

## 📊 2D Arrays (Multidimensional Arrays)

### Declaration and Initialization
```java
// Method 1: Using new keyword
int[][] matrix = new int[rows][columns];

// Method 2: Using array literal
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

// Method 3: Jagged array
int[][] jagged = new int[3][];
jagged[0] = new int[2];
jagged[1] = new int[3];
jagged[2] = new int[1];
```

### 2D Array Traversal
```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

// Nested for loops
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}

// Enhanced for loops
for (int[] row : matrix) {
    for (int element : row) {
        System.out.print(element + " ");
    }
    System.out.println();
}
```

## 🧠 Memory Management

### Array Memory Layout
- Arrays are objects in Java
- Stored in heap memory
- Reference stored in stack
- Contiguous memory allocation
- Automatic garbage collection

### Memory Considerations
```java
// Memory allocation
int[] smallArray = new int[10];        // 40 bytes (4 bytes per int)
double[] largeArray = new double[1000]; // 8000 bytes (8 bytes per double)

// Array of objects
String[] strings = new String[5];      // 5 references (null initially)
```

## 🛠️ Common Array Operations

### Searching
```java
// Linear search
public static int linearSearch(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == target) {
            return i;
        }
    }
    return -1;
}

// Binary search (for sorted arrays)
public static int binarySearch(int[] arr, int target) {
    int left = 0, right = arr.length - 1;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) return mid;
        if (arr[mid] < target) left = mid + 1;
        else right = mid - 1;
    }
    return -1;
}
```

### Sorting
```java
// Bubble sort
public static void bubbleSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
        for (int j = 0; j < arr.length - 1 - i; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}

// Using Arrays.sort() (built-in)
Arrays.sort(arr);
```

### Copying Arrays
```java
// Method 1: Using System.arraycopy
int[] source = {1, 2, 3, 4, 5};
int[] dest = new int[5];
System.arraycopy(source, 0, dest, 0, source.length);

// Method 2: Using Arrays.copyOf
int[] dest = Arrays.copyOf(source, source.length);

// Method 3: Using clone()
int[] dest = source.clone();
```

## ⚠️ Important Points

### Array Bounds
- ArrayIndexOutOfBoundsException for invalid indices
- Always check bounds before access
- Use length property for bounds checking

### Array Limitations
- Fixed size after creation
- Cannot add/remove elements easily
- Consider ArrayList for dynamic arrays

### Performance Considerations
- O(1) access time for any element
- O(n) for search (linear)
- O(n²) for simple sorting algorithms
- Memory overhead for small arrays

### Best Practices
- Use meaningful variable names
- Initialize arrays properly
- Check for null before operations
- Use appropriate data types
- Consider using utility methods 