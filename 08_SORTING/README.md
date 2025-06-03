# 📘 Sorting Techniques in Java

---

## Classification of Sorting Techniques :
  ### 1) Internal sorting vs External sorting

| **Category**           | **Internal Sorting**                                                   | **External Sorting**                                                       |
|------------------------|-------------------------------------------------------------------------|----------------------------------------------------------------------------|
| **Definition**          | Sorting techniques that handle data that can fit into the computer's RAM. | Sorting techniques used when the data cannot fit into the computer's RAM and must be read from external storage. |
| **Memory**              | Data is entirely in the internal memory (RAM).                          | Data is stored externally (e.g., on hard drives or cloud storage).          |
| **Speed**               | Typically faster as all data is accessed from RAM.                      | Slower due to data being accessed from external storage, which is slower than RAM. |
| **Example Algorithms**  | - Quick Sort<br>- Merge Sort<br>- Bubble Sort<br>- Insertion Sort<br>- Selection Sort | - External Merge Sort<br>- External Quick Sort |
| **Usage**               | Used for smaller datasets that fit in the main memory.                  | Used for large datasets, such as databases and big data applications. |

  ### 2) Comparison-based vs Non-comparison-based Sorting

| **Category**                   | **Comparison-based Sorting**                                         | **Non-comparison-based Sorting**                                            |
|---------------------------------|----------------------------------------------------------------------|-----------------------------------------------------------------------------|
| **Definition**                  | Sorting algorithms that compare elements to determine their order.   | Sorting algorithms that do not rely on element comparisons.                  |
| **Key Characteristics**         | - Elements are compared with each other to determine their relative order.<br>- Usually have a time complexity of at least O(n log n) in the average case. | - Do not compare elements directly.<br>- Utilize properties of the data (like range or digit position) to determine the order. |
| **Time Complexity**             | - Best: O(n log n)<br>- Average: O(n log n)<br>- Worst: O(n²) (for algorithms like Bubble Sort) | - Best, Average, and Worst: O(n) (under certain conditions)                |
| **Examples**                    | - Quick Sort<br>- Merge Sort<br>- Heap Sort<br>- Bubble Sort<br>- Insertion Sort | - Counting Sort<br>- Radix Sort<br>- Bucket Sort                           |
| **Use Cases**                   | - Suitable for general-purpose sorting of data.<br>- Works well for arbitrary data types. | - Used when the range of possible values is known and limited, or the data is numerical or categorical. |
| **Limitations**                 | - Often slower on larger datasets, particularly with algorithms like Bubble Sort.<br>- May require additional memory (e.g., Merge Sort). | - Limited to specific use cases where data characteristics are known and limited.<br>- May not work well with non-numeric data. |


  ### 3) Recursive vs Iterative Approaches

| **Category**                   | **Recursive Approach**                                                 | **Iterative Approach**                                                    |
|---------------------------------|-------------------------------------------------------------------------|---------------------------------------------------------------------------|
| **Definition**                  | Sorting algorithms that use function calls to repeat the sorting steps on smaller subproblems. | Sorting algorithms that use loops to repeat the sorting steps until the problem is solved. |
| **Key Characteristics**         | - Typically easier to implement.<br>- Breaks the problem into smaller subproblems.<br>- Makes use of the call stack to keep track of subproblems. | - Often more memory efficient as they do not require additional function calls or a call stack.<br>- Typically uses loops for repetition. |
| **Memory Usage**                | - Uses more memory due to the function call stack (especially for deep recursion).<br>- Can lead to stack overflow for very deep recursion (e.g., with large datasets). | - Uses less memory, as it does not require additional space for function calls.<br>- More efficient in terms of space. |
| **Time Complexity**             | - Same time complexity as the iterative approach, depending on the algorithm (e.g., Quick Sort, Merge Sort).<br>- Can be slower due to overhead of function calls. | - Same time complexity as recursive algorithms, but can be more efficient due to reduced overhead. |
| **Examples**                    | - Recursive Quick Sort<br>- Recursive Merge Sort<br>- Recursive Binary Search | - Iterative Quick Sort<br>- Iterative Merge Sort<br>- Iterative Binary Search |
| **Ease of Implementation**      | - Easier to implement and understand for certain problems (e.g., Divide and Conquer algorithms).<br>- Cleaner and more elegant code for problems that naturally lend themselves to recursion. | - May require more complex code for problems that are easier to solve recursively.<br>- Requires explicit management of the loop structure. |
| **Use Cases**                   | - Ideal for problems that have a clear recursive structure, such as tree traversal, divide-and-conquer algorithms, or problems that naturally divide into smaller subproblems. | - Ideal for problems where repeated steps can be solved efficiently with loops, and where recursion might cause overhead or stack overflow issues. |
| **Limitations**                 | - Can lead to stack overflow for large data or deep recursion levels.<br>- May not be as time-efficient due to function call overhead. | - Some problems that are naturally recursive may be more complex to implement iteratively.<br>- Less intuitive for problems with recursive structure. |


### 4) In-Place Sorting vs Not In-Place Sorting

| **Category**                   | **In-Place Sorting**                                                   | **Not In-Place Sorting**                                                   |
|---------------------------------|-------------------------------------------------------------------------|-----------------------------------------------------------------------------|
| **Definition**                  | Sorting algorithms that do not require additional memory or space outside of the input data structure. | Sorting algorithms that require additional memory or space beyond the input data structure. |
| **Memory Usage**                | - Uses a constant amount of extra space (i.e., O(1) space complexity).<br>- The input data is rearranged within its own memory space. | - Requires extra space, typically proportional to the size of the input (e.g., O(n) space complexity). |
| **Space Complexity**            | O(1) (constant space)                                                  | O(n) or more (depends on the algorithm and data structure used).             |
| **Examples**                    | - Quick Sort<br>- Merge Sort (when done in-place)<br>- Heap Sort<br>- Insertion Sort | - Merge Sort (non in-place version)<br>- Radix Sort<br>- Counting Sort |
| **Efficiency**                  | - More memory efficient as it doesn’t require extra storage.           | - Requires extra space, but can be more efficient for certain types of data. |
| **Algorithm Stability**         | - In-place algorithms may or may not be stable.<br>- Stability means maintaining the relative order of equal elements. | - Not in-place algorithms like Merge Sort (non-in-place) are typically stable. |
| **Use Cases**                   | - Suitable when memory is limited and extra space is expensive.<br>- Often used in environments with constrained memory resources (e.g., embedded systems). | - Used when the input data structure can be duplicated or when the algorithm’s efficiency benefits outweigh memory cost. |
| **Limitations**                 | - Can sometimes be less efficient if extra space could be utilized to improve performance (e.g., Merge Sort). | - Extra space usage can make it inefficient for large datasets or memory-constrained environments. |


### 5) Stable vs Unstable Sorting Algorithms

| **Category**                   | **Stable Sorting**                                                     | **Unstable Sorting**                                                     |
|---------------------------------|-------------------------------------------------------------------------|---------------------------------------------------------------------------|
| **Definition**                  | Sorting algorithms that maintain the relative order of records with equal keys (values). | Sorting algorithms that do **not** guarantee the relative order of records with equal keys. |
| **Key Characteristics**         | - Equal elements retain their relative order after sorting.<br>- Stability is important when the data has multiple sorting criteria. | - Equal elements may have their relative order changed during sorting.<br>- Can be more efficient in certain cases. |
| **Examples**                    | - Merge Sort<br>- Bubble Sort<br>- Insertion Sort<br>- Tim Sort<br>- **Stable** version of Quick Sort | - Quick Sort<br>- Heap Sort<br>- Selection Sort<br>- Shell Sort |
| **Time Complexity**             | Same as their unstable counterparts, depending on the algorithm (e.g., O(n log n) for Merge Sort). | Same as stable counterparts, depending on the algorithm (e.g., O(n log n) for Quick Sort). |
| **Use Cases**                   | - Useful when sorting by multiple criteria (e.g., sorting by name, then by age).<br>- Used when the stability of equal elements is important in the sorting process. | - Suitable for cases where the relative order of equal elements doesn’t matter.<br>- Often used when performance is prioritized and stability is not a concern. |
| **Memory Usage**                | - Some stable sorting algorithms like Merge Sort may use extra memory (O(n)) due to the need for auxiliary space.<br>- Others like Bubble Sort or Insertion Sort are in-place. | - Most unstable sorting algorithms are in-place and use O(1) extra memory (e.g., Quick Sort, Heap Sort). |
| **Efficiency**                  | - Stable algorithms are often slower and may require additional space (e.g., Merge Sort uses O(n) space). | - Unstable algorithms may be more efficient in terms of space and time complexity for certain types of data (e.g., Quick Sort is typically faster than Merge Sort). |
| **Limitations**                 | - Typically more memory-intensive, especially if the algorithm is not in-place (e.g., Merge Sort).<br>- Can be slower than unstable algorithms in some cases. | - May not preserve the original order of equal elements, which could be important for certain applications. |

    



## ✅ Comparison Table

| Sort         | Time (Best) | Time (Worst) | Stable | Adaptive | Extra Space |
|--------------|-------------|---------------|--------|----------|-------------|
| Bubble       | O(n)        | O(n²)         | ✅      | ✅        | No          |
| Insertion    | O(n)        | O(n²)         | ✅      | ✅        | No          |
| Selection    | O(n²)       | O(n²)         | ❌      | ❌        | No          |
| Merge        | O(n log n)  | O(n log n)    | ✅      | ❌        | Yes         |
| Quick        | O(n log n)  | O(n²)         | ❌      | ❌        | No          |
| Shell        | O(n log n)  | O(n²)         | ❌      | ❌        | No          |
| Counting     | O(n + k)    | O(n + k)      | ✅      | ❌        | Yes         |
| Bucket       | O(n + k)    | O(n²)         | ✅      | ❌        | Yes         |
| Radix        | O(nk)       | O(nk)         | ✅      | ❌        | Yes         |

---

