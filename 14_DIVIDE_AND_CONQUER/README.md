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

<ol>
  <li>Let T(n) represents the time complexity of a Divide and Conquer algorithm.</li>
  <li><b>If n is small :</b></li>
    <ul>
      <li>T(n)=f(n),where :</li>
        <ol><li>f(n)=O(1) or Constant ( for base case)</li></ol>
    </ul>
  <li><b>If n is large :</b></li>
    <ul>
      <li>T(n)=2T(n/2)+g(n)</li>
      <li>Here,</li>
        <ol>
          <li>2 = number of sub-problems</li>
          <li>n/2 = size of each sub-problems</li>
          <li>g(n) = time for dividing , combining , and small task</li>
        </ol>
    </ul>

  <li><b>General form:</b></li>
    <ol>
      <li>T(n)=a.T(n/b)+g(n)</li>
      <li>Here,</li>
      <ul>
        <li> a>=1 , b>1 </li>
        <li>a = number of sub-problems</li>
        <li>n/b = size of each sub-problems</li>
        <li>g(n) = time for dividing , combining , and small task</li>
      </ul>
    </ol>
    <li> Example <b>Symmetric :-</b></li>
      <ul>
        <li>T(n)=2T(n/2)+g(n)</li>
        <li>T(n)=T(n/2)+g(n)</li>
        <li>T(n)=4T(n/2)+g(n)</li>
      </ul>
    <li><b> Asymmetric :-</b></li>
     <UL>
       <LI>General Form:
            T(n) = T(αn) + T((1-α)n) + g(n)
            , where 0 < α < 1</LI>
        <LI>Case 1:T(n) = T(n/3) + T(2n/3) + g(n)</LI>
        <LI>Case 2:T(n) = T(n/2) + T(n/4) + g(n)</LI>
     </UL>
</ol>

```mermaid
graph TD
    A["T(n): Time Complexity<br>of Divide & Conquer <br>Algorithms"]

    A --> B["Symmetric Case"]
    B --> C1["General Form:<br><br>T(n) = a · T(n/b) + g(n)"]
    C1 --> D1["a ≥ 1, b > 1"]
    C1 --> D2["a = number of sub-problems"]
    C1 --> D3["n/b = size of each sub-problem"]
    C1 --> D4["g(n) = time for dividing, combining, and small task"]

    A --> E["Asymmetric Case"]
    
    E --> F1["General Form:<br><br>T(n) = <br>T(α·n) + T((1−α)·n) + g(n)<br>where 0 < α < 1"]
    
    F1 --> F2["Case 1:<br><br>T(n) = T(n/3) + T(2n/3) + g(n)"]
    
    F1 --> F3["Case 2:<br><br>T(n) = T(n/2) + T(n/4) + g(n)<br>where 0 < α < 1"]

    %% Styling to increase box size
    classDef wide fill:#f9cb9c,stroke:#333,stroke-width:2px,font-size:16px;
    classDef symmetric fill:#c6e2ff,stroke:#333,stroke-width:2px,font-size:14px;
    classDef header fill:#ffd966,stroke:#333,stroke-width:3px,font-size:18px;

    class A header;
    class B,C1,D1,D2,D3,D4 symmetric;
    class E,F1,F2,F3 wide;


```

<hr/>

<li><B>NOTE :- </B> In Divide and Conquer strategy, <b>Divide is mandatory</b> but combine is optional(Depends on application). </li> 
  Exaple :-  Binary Search.
