# Arrays in Java

In Java, **Arrays** are used to store multiple values in a single variable, instead of declaring separate variables for each value. Arrays are a collection of elements of the same type stored in contiguous memory locations.

## 1. **Array Basics**

### **What is an Array?**

An array is a data structure that can store a fixed-size sequence of elements of the same type. Arrays in Java are objects that hold data, and they allow fast access to individual elements.

- **Declaration of an Array:**
  An array is declared by specifying the type of its elements followed by square brackets `[]`.

  ```java
  int[] arr; // Declaration of an integer array
  ```

- **Initialization of an Array:**
  An array can be initialized at the time of declaration or later.

  ```java
  int[] arr = new int[5]; // An array of 5 integers
  ```

- **Accessing Array Elements:**
  Array elements are accessed using the index, with indices starting from 0.

  ```java
  arr[0] = 10; // Assigning 10 to the first element
  System.out.println(arr[0]); // Accessing the first element
  ```

### **Array Characteristics:**
- **Fixed Size:** The size of an array is fixed at the time of its creation. You cannot change the size of an array after it has been initialized.
- **Homogeneous Elements:** An array can only hold elements of the same type (e.g., all integers, all strings, etc.).

---

## 2. **Array Operations**

### **Array Length:**
- The **length** of an array is the number of elements it can hold. This property is accessible through `array.length`.

```java
int[] arr = {1, 2, 3, 4, 5};
System.out.println(arr.length); // Output: 5
```

### **Array Traversal:**
- **Traversing an array** means visiting each element of the array, typically using a loop.

```java
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```

Alternatively, you can use **for-each loop** for simpler traversal:

```java
for (int num : arr) {
    System.out.println(num);
}
```

### **Array Indexing:**
- Array indices start at `0` and go up to `array.length - 1`.
  
```java
int[] arr = {10, 20, 30};
System.out.println(arr[0]); // Output: 10
```

### **Array Copying:**
- To copy an array, you can use `System.arraycopy()` or `Arrays.copyOf()` methods.

```java
int[] newArr = Arrays.copyOf(arr, arr.length);  // Copies arr to newArr
```

### **Array Searching:**
- You can search for an element in an array manually using loops or use built-in methods like `Arrays.binarySearch()`.

```java
int[] arr = {1, 3, 5, 7, 9};
int index = Arrays.binarySearch(arr, 5);  // Returns the index of 5
System.out.println(index);  // Output: 2
```

---

## 3. **Important Built-in Methods for Arrays**

### **`Arrays.sort()`**
- **Purpose:** Sorts an array in ascending order (default). You can also specify a custom comparator for sorting in descending order.
  
```java
int[] arr = {5, 2, 8, 1, 3};
Arrays.sort(arr);  // arr will be sorted to {1, 2, 3, 5, 8}
```

### **`Arrays.toString()`**
- **Purpose:** Returns a string representation of the array.
  
```java
int[] arr = {1, 2, 3, 4};
System.out.println(Arrays.toString(arr));  // Output: [1, 2, 3, 4]
```

### **`Arrays.fill()`**
- **Purpose:** Fills an entire array or part of an array with a specific value.

```java
int[] arr = new int[5];
Arrays.fill(arr, 10);  // arr will be filled with {10, 10, 10, 10, 10}
```

### **`Arrays.equals()`**
- **Purpose:** Compares two arrays to see if they are equal (i.e., have the same elements in the same order).

```java
int[] arr1 = {1, 2, 3};
int[] arr2 = {1, 2, 3};
System.out.println(Arrays.equals(arr1, arr2));  // Output: true
```

### **`Arrays.copyOf()`**
- **Purpose:** Copies an array to a new array of a specified length.

```java
int[] arr = {1, 2, 3};
int[] newArr = Arrays.copyOf(arr, 5);  // newArr will be {1, 2, 3, 0, 0}
```

### **`Arrays.stream()`**
- **Purpose:** Converts an array into a stream, allowing you to use stream operations like filtering, mapping, etc.

```java
int[] arr = {1, 2, 3, 4, 5};
int sum = Arrays.stream(arr).sum();  // Output: 15
```

---

## 4. **Multi-Dimensional Arrays**

### **Theory:**

A **multi-dimensional array** is an array of arrays. The most common example is the **2D array**, which can be thought of as a matrix or table with rows and columns.

- **Declaration and Initialization of 2D Array:**

```java
int[][] arr = new int[3][3];  // A 2D array with 3 rows and 3 columns
```

- **Accessing 2D Array Elements:**

```java
arr[0][0] = 1;  // Assigning value 1 to the first element of the 2D array
System.out.println(arr[0][0]);  // Output: 1
```

### **Traversing a 2D Array:**

```java
for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr[i].length; j++) {
        System.out.println(arr[i][j]);
    }
}
```

---

## 5. **Common Use Cases for Arrays**

- **Storing Data:** Arrays are commonly used to store large sets of similar data, such as a list of numbers or objects.
- **Static Data:** Arrays are best used when the number of elements is known in advance.
- **Sorting and Searching:** Arrays are commonly used in sorting and searching algorithms due to their random access property.

---

### **Conclusion:**

- **Arrays** are a fundamental data structure in Java used to store multiple elements in a single variable. They offer fast access to elements via indices but have a fixed size.
- Java provides several built-in methods for arrays, like sorting, copying, and searching, making them easier to work with.
- For **multi-dimensional data**, arrays in Java can be extended to two or more dimensions (2D, 3D, etc.).
