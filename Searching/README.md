# Searching Algorithms in Java

This repository contains various searching algorithms implemented in Java. Below is the explanation of two fundamental searching techniques: **Linear Search** and **Binary Search**.

## 1. Linear Search

### **Theory:**

Linear Search is the simplest search algorithm. It works by sequentially checking each element of a list or array until the desired element is found or the list ends. This method does not require the list to be sorted.

- **Steps:**
  1. Start from the first element of the list.
  2. Compare the target element with the current element of the list.
  3. If the target matches the current element, return the index of that element.
  4. If the target does not match, move to the next element and repeat the comparison.
  5. If the target is not found after checking all the elements, return -1 indicating the element is not present.

- **Time Complexity:**
  - **Best Case:** O(1) (when the element is found at the first position).
  - **Worst Case:** O(n) (when the element is at the last position or not present).
  
- **Space Complexity:** O(1), since it does not use any additional space other than the input array.

- **Use Case:** Suitable for small or unsorted lists where other more advanced search algorithms are not required.

---

## 2. Binary Search

### **Theory:**

Binary Search is a more efficient searching algorithm, but it only works on sorted lists. It works by repeatedly dividing the search interval in half, checking if the target is smaller or larger than the midpoint, and discarding half of the elements at each step.

- **Steps:**
  1. Start with the middle element of the sorted list.
  2. If the middle element is the target, return its index.
  3. If the target is smaller than the middle element, discard the right half and search the left half.
  4. If the target is greater than the middle element, discard the left half and search the right half.
  5. Repeat steps 2-4 until the target is found or the search interval is empty.

- **Time Complexity:**
  - **Best Case:** O(1) (when the middle element is the target).
  - **Worst Case:** O(log n) (when the search space is halved repeatedly).
  
- **Space Complexity:** O(1), since binary search uses only a small constant amount of extra space for the search.

- **Use Case:** Ideal for large datasets that are sorted or nearly sorted, where an efficient search is necessary.

---

### **Conclusion:**

- **Linear Search** is simple and works on unsorted data but is inefficient for large datasets due to its O(n) time complexity.
- **Binary Search**, on the other hand, is very efficient with an O(log n) time complexity but requires the data to be sorted.
