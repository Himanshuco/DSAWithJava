# 🌿 Trees in Java

### 🌱 Introduction to Trees

* A **Tree** is a non-linear hierarchical data structure.
* Consists of nodes connected by edges.
* One node is the **root**; all others are its descendants.
* Trees are acyclic — no loops or cycles.
* Common use-cases: file systems, databases (indexes), hierarchical data modeling.

```mermaid
graph TD
    A[Root Node] --> B[Child Node 1]
    A --> C[Child Node 2]
    B --> D[Leaf Node 1]
    B --> E[Leaf Node 2]
    C --> F[Leaf Node 3]
    C --> G[Leaf Node 4]

    style A fill:#c2f0c2,stroke:#333,stroke-width:2px
    style B fill:#e6ffe6
    style C fill:#e6ffe6
    style D fill:#fff
    style E fill:#fff
    style F fill:#fff
    style G fill:#fff
```


### 🌿 Basic Terminology

* **Node**: Fundamental unit of a tree that stores data.
* **Root**: Topmost node without a parent.
* **Edge**: Link between two nodes.
* **Leaf**: A node with no children.
* **Parent**: Node with outgoing edges to one or more child nodes.
* **Child**: Node with an incoming edge from a parent node.
* **Subtree**: A tree formed from a node and its descendants.
* **Height**: Length of the longest path from a node to a leaf.
* **Depth**: Number of edges from the root to the node.
* **Degree**: Number of children of a node.

Note:  Here Level starts from 0 for the Root.

```mermaid
graph TD
    A[Root] --> B[Parent]
    A[Root] --> C[Parent]
    B --> D[Child]
    B --> E[Child]
    C --> F[Child]
    C --> G[Child]
    D --> H[Leaf]
    E --> I[Leaf]
    F --> J[Leaf]
    G --> K[Leaf]

    classDef root fill:#f9f,stroke:#333,stroke-width:4px;
    classDef parent fill:#fdd,stroke:#333,stroke-width:2px;
    classDef child fill:#ddf,stroke:#333,stroke-width:2px;
    classDef leaf fill:#dfd,stroke:#333,stroke-width:2px;

    class A root;
    class B,C parent;
    class D,E,F,G child;
    class H,I,J,K leaf;
```

```mermaid
graph TD
    subgraph Tree
        direction TB
       A1[Root] --> A2[Height: 3] --> A3[Depth: 0] --> A4[Degree: 2]
        B1[Parent] --> B2[Height: 2] --> B3[Depth: 1] --> B4[Degree: 2]
        C1[Parent] --> C2[Height: 2] --> C3[Depth: 1] --> C4[Degree: 2]
        D1[Child] --> D2[Height: 1] --> D3[Depth: 2] --> D4[Degree: 1]
        E1[Child] --> E2[Height: 1] --> E3[Depth: 2] --> E4[Degree: 1]
        F1[Child] --> F2[Height: 1] --> F3[Depth: 2] --> F4[Degree: 1]
        G1[Child] --> G2[Height: 1] --> G3[Depth: 2] --> G4[Degree: 1]
        H1[Leaf] --> H2[Height: 0] --> H3[Depth: 3] --> H4[Degree: 0]
        I1[Leaf] --> I2[Height: 0] --> I3[Depth: 3] --> I4[Degree: 0]
        J1[Leaf] --> J2[Height: 0] --> J3[Depth: 3] --> J4[Degree: 0]
        K1[Leaf] --> K2[Height: 0] --> K3[Depth: 3] --> K4[Degree: 0]
    end

    classDef root fill:#f9f,stroke:#333,stroke-width:4px;
    classDef parent fill:#fdd,stroke:#333,stroke-width:2px;
    classDef child fill:#ddf,stroke:#333,stroke-width:2px;
    classDef leaf fill:#dfd,stroke:#333,stroke-width:2px;

    class A1,B1,C1,D1,E1,F1,G1,H1,I1,J1,K1 fill:#fffa,stroke:#333,stroke-width:1px;

```

### 🌳 Binary Trees

* Each node has at most two children.
* Children are referred to as **left** and **right**.

```mermaid
graph TD
    %% Full Binary Tree
    subgraph Full_Binary_Tree
        direction TB
        A1[Root] --> B1[Left Child]
        A1[Root] --> C1[Right Child]
        B1 --> D1[Left Child]
        B1 --> E1[Right Child]
        C1 --> F1[Left Child]
        C1 --> G1[Right Child]
    end

    %% Complete Binary Tree
    subgraph Complete_Binary_Tree
        direction TB
        A2[Root] --> B2[Left Child]
        A2[Root] --> C2[Right Child]
        B2 --> D2[Left Child]
        B2 --> E2[Right Child]
        C2 --> F2[Left Child]
    end

    %% Perfect Binary Tree
    subgraph Perfect_Binary_Tree
        direction TB
        A3[Root] --> B3[Left Child]
        A3[Root] --> C3[Right Child]
        B3 --> D3[Left Child]
        B3 --> E3[Right Child]
        C3 --> F3[Left Child]
        C3 --> G3[Right Child]
    end

    %% Degenerate Tree
    subgraph Degenerate_Tree
        direction TB
        A4[Root] --> B4[Left Child]
        B4 --> C4[Left Child]
        C4 --> D4[Left Child]
        D4 --> E4[Left Child]
    end

    %% Balanced Binary Tree
    subgraph Balanced_Binary_Tree
        direction TB
        A5[Root] --> B5[Left Child]
        A5[Root] --> C5[Right Child]
        B5 --> D5[Left Child]
        B5 --> E5[Right Child]
        C5 --> F5[Left Child]
        C5 --> G5[Right Child]
    end

    %% Style Definitions
    classDef root fill:#f9f,stroke:#333,stroke-width:2px;
    classDef parent fill:#fdd,stroke:#333,stroke-width:2px;
    classDef child fill:#ddf,stroke:#333,stroke-width:2px;
    classDef leaf fill:#dfd,stroke:#333,stroke-width:2px;

    %% Assigning classes to nodes
    class A1,A2,A3,A4,A5 root;
    class B1,C1,B2,C2,B3,C3,B4,C4,B5,C5 parent;
    class D1,E1,F1,G1,D2,E2,F2,G2,D3,E3,F3,G3,D4,E4,D5,E5 leaf;
```

### 🌲 Representation of Binary Trees

Binary trees can be represented using:

1. **Linked Representation** (most common)

```java
class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}
```

2. **Array Representation** (used in heaps):

* Root at index `0`
* Left child of node at index `i`: `2i + 1`
* Right child of node at index `i`: `2i + 2`
* Parent of node at index `i`: `(i - 1) / 2`


### 🔁 Binary Tree Traversals

Traversal is the process of visiting each node in the tree exactly once.

#### 📌 Inorder Traversal (Left, Root, Right)

Definition: Visit left subtree, root node, then right subtree.

```java
void inorder(Node node) {
    if (node == null) return;
    inorder(node.left);
    System.out.print(node.data + " ");
    inorder(node.right);
}
```

#### 📌 Preorder Traversal (Root, Left, Right)

Definition: Visit root node, then left and right subtrees.

```java
void preorder(Node node) {
    if (node == null) return;
    System.out.print(node.data + " ");
    preorder(node.left);
    preorder(node.right);
}
```

#### 📌 Postorder Traversal (Left, Right, Root)

Definition: Visit left and right subtrees first, then the root.

```java
void postorder(Node node) {
    if (node == null) return;
    postorder(node.left);
    postorder(node.right);
    System.out.print(node.data + " ");
}
```

#### 📌 Level Order Traversal (Breadth-First)

Definition: Visit nodes level by level from top to bottom.

```java
void levelOrder(Node root) {
    if (root == null) return;
    Queue<Node> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
        Node current = queue.poll();
        System.out.print(current.data + " ");
        if (current.left != null) queue.add(current.left);
        if (current.right != null) queue.add(current.right);
    }
}
```



### 🌴 Types of Binary Trees

* **Full Binary Tree**
* **Perfect Binary Tree**
* **Complete Binary Tree**
* **Skewed Tree** (Left or Right)
* **Strict/Proper Binary Tree**: Every internal node has exactly two children.



### 🔍 Binary Search Tree (BST)

```java
Node insert(Node root, int key) {
    if (root == null) return new Node(key);
    if (key < root.data)
        root.left = insert(root.left, key);
    else
        root.right = insert(root.right, key);
    return root;
}

boolean search(Node root, int key) {
    if (root == null) return false;
    if (root.data == key) return true;
    return key < root.data ? search(root.left, key) : search(root.right, key);
}
```


### 🌴 Advanced Trees

* **AVL Tree**
* **Red-Black Tree**
* **Segment Tree**
* **Trie (Prefix Tree)**


### 🖐️ Properties and Formulas

#### 🔢 Number of Binary Trees with n Nodes

* Formula: `C(n) = (2n)! / ((n + 1)! * n!)` → Catalan Number

```java
static long catalanNumber(int n) {
    long res = 1;
    for (int i = 0; i < n; ++i) {
        res *= (2 * n - i);
        res /= (i + 1);
    }
    return res / (n + 1);
}
```

#### 🌿 Labelled Nodes

* Number of labelled binary trees with `n` nodes = `Catalan(n) * n!`

#### 📏 Height vs Nodes

* Minimum height of a binary tree with `n` nodes: `⌈log₂(n + 1)⌉`
* Maximum nodes in height `h`: `2^h - 1`
* Minimum nodes for height `h`: `h + 1`

#### 🧽 Internal vs External Nodes

* `E = I + 1` (E = external nodes, I = internal nodes) in a full binary tree

#### 🌳 N-ary Tree

* A tree in which a node can have at most `N` children

#### 🔀 Strict / Proper / Complete Binary Tree

* **Strict (Proper)**: Each node has 0 or 2 children
* **Complete**: All levels filled except possibly last, filled from left to right

