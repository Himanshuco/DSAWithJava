# Divide and Conquer

<ol> 
  <li>When the problem becomes large/complex, then divide the problem into sub-problems, into further sub-problems, until the sub-problem becomes small.</li> 
  <li>Solve the smaller problems, combine their results if required to get the solution of the original problem.</li> 
  <li>In general, a problem is said to be <b>small</b> if it can be solved in one or two basic operations.</li> 
</ol>

```mermaid
graph TD
    A[Divide and Conquer] --> B1[Find Max / Min]
    A --> B2[Power of element]
    A --> B3[Binary Search]
    A --> B4[Merge Sort]
    A --> B5[Quick Sort]
    A --> B6[Strassen's Matrix Multiplication]
    A --> B7[Selection Procedure]
    A --> B8[Count Inversions]
```
<hr/>

### Example : Finding the largest element in an array.

```mermaid
graph TD
    A["Array: 3, 9, 2, 5, 7, 6, 1, 8"]
    A --> B1["Left Half: 3, 9, 2, 5"]
    A --> B2["Right Half: 7, 6, 1, 8"]

    B1 --> C1["Left: 3, 9"]
    B1 --> C2["Right: 2, 5"]

    B2 --> C3["Left: 7, 6"]
    B2 --> C4["Right: 1, 8"]

    C1 --> D1["Compare 3 & 9 → Max = 9"]
    C2 --> D2["Compare 2 & 5 → Max = 5"]
    C3 --> D3["Compare 7 & 6 → Max = 7"]
    C4 --> D4["Compare 1 & 8 → Max = 8"]

    D1 --> E1["Max(9, 5) = 9"]
    D2 --> E1

    D3 --> E2["Max(7, 8) = 8"]
    D4 --> E2

    E1 --> F["Final Max(9, 8) = 9"]
    E2 --> F
```

