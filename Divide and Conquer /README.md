# Divide and Conquer

<ol> 
  <li>When the problem becomes large/complex, then divide the problem into sub-problems, into further sub-problems, until the sub-problem becomes small.</li> 
  <li>Solve the smaller problems, combine their results if required to get the solution of the original problem.</li> 
  <li>In general, a problem is said to be <b>small</b> if it can be solved in one or two basic operations.</li> 
</ol>

```Algorithm
    Algorithm DAndC(P){
        if Small(P) then return S(P);
        else{
          divide P into smaller instances P1,P2,P3...,Pk , (k>=1);
          Apply DAndC to each of these subproblems;
          return Combine(DAndC(P1),DAndC(P2),...,DAndC(PK),);
  }
}

```

<li><b>Control abstraction</b> in algorithms refers to hiding the details of control flow (such as loops, conditionals, recursion, etc.) so that the algorithm focuses more on what needs to be done rather than how it’s done step by step. It helps improve readability, modularity, and reusability.</li>
  Example:- Small(P)



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

**Algorithm**

```Algorithm
Function Find-Max(A, low, high)
    // Base Case
    If low == high then
        Return A[low]

    // Divide
    mid ← ⌊(low + high) / 2⌋

    // Conquer
    max1 ← Find-Max(A, low, mid)
    max2 ← Find-Max(A, mid + 1, high)

    // Combine
    If max1 > max2 then
        Return max1
    Else
        Return max2
End Function
```

## Time-Complexity Framework for Divide and Conquer Problems 

    




