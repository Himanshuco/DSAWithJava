# 📘 Sorting Techniques in Java

---

## 📌 Criteria for Analysis

| Criteria               | Description                                                                 |
|------------------------|-----------------------------------------------------------------------------|
| Comparisons            | Number of element comparisons                                               |
| Swaps                  | Number of value exchanges                                                   |
| Adaptive               | Optimized for nearly sorted inputs                                          |
| Stable                 | Preserves relative order of equal elements                                  |
| Extra Memory Required  | External space used                                                          |

---

## 1️⃣ Bubble Sort

**Idea**: Repeatedly swap adjacent elements if they are out of order. The largest elements "bubble" to the top.

```java
void bubbleSort(int[] A) {
    int n = A.length;
    for (int i = 0; i < n - 1; i++) {
        boolean flag = false;
        for (int j = 0; j < n - 1 - i; j++) {
            if (A[j] > A[j + 1]) {
                int temp = A[j];
                A[j] = A[j + 1];
                A[j + 1] = temp;
                flag = true;
            }
        }
        if (!flag) break;
    }
}
```

### 🔍 Explanation
- Passes: `n - 1`
- Comparisons per pass: `n - i - 1`
- Total comparisons: `1 + 2 + 3 + ... + (n - 1) = n(n - 1)/2`
- Swaps: Same as comparisons in worst case
- Time Complexity: Worst O(n²), Best O(n)
- **Stable**: ✅
- **Adaptive**: ✅ (stops early if no swap)

### 💡 Properties
- Performs selected number of passes ⇒ can find largest `k` elements in `k` passes
- Called "bubble" sort because smaller values rise like bubbles
---

## 2️⃣ Insertion Sort

**Idea**: Insert each element into its correct position in the sorted part.

```java
void insertionSort(int[] A) {
    for (int i = 1; i < A.length; i++) {
        int temp = A[i];
        int j = i - 1;
        while (j >= 0 && A[j] > temp) {
            A[j + 1] = A[j];
            j--;
        }
        A[j + 1] = temp;
    }
}
```

### 🔍 Explanation
- Assumes the first element is sorted
- Passes: `n - 1`
- Worst Comparisons: `n(n - 1)/2`
- Best Comparisons: `n - 1`
- Swaps: Equal to shifts performed
- **Stable**: ✅
- **Adaptive**: ✅

### 💡 Properties
- Efficient for small datasets
- Used in linked lists

---

## 3️⃣ Selection Sort

**Idea**: Repeatedly select the minimum element and place it at the correct position.

```java
void selectionSort(int[] A) {
    for (int i = 0; i < A.length - 1; i++) {
        int minIndex = i;
        for (int j = i + 1; j < A.length; j++) {
            if (A[j] < A[minIndex]) {
                minIndex = j;
            }
        }
        int temp = A[i];
        A[i] = A[minIndex];
        A[minIndex] = temp;
    }
}
```

### 🔍 Explanation
- Comparisons: `n(n - 1)/2`
- Swaps: `n - 1` (minimum possible)
- **Stable**: ❌ (due to swapping)
- **Adaptive**: ❌

---

## 4️⃣ Merge Sort (Recursive)

**Idea**: Divide array into halves, sort each half, and merge them.

```java
void mergeSort(int[] A, int l, int h) {
    if (l < h) {
        int mid = (l + h) / 2;
        mergeSort(A, l, mid);
        mergeSort(A, mid + 1, h);
        merge(A, l, mid, h);
    }
}

void merge(int[] A, int l, int m, int h) {
    int[] temp = new int[h - l + 1];
    int i = l, j = m + 1, k = 0;
    while (i <= m && j <= h) {
        temp[k++] = A[i] < A[j] ? A[i++] : A[j++];
    }
    while (i <= m) temp[k++] = A[i++];
    while (j <= h) temp[k++] = A[j++];
    System.arraycopy(temp, 0, A, l, temp.length);
}
```

### 🔍 Explanation
- Time: O(n log n)
- Stable: ✅
- Adaptive: ❌
- Space: Requires temporary array (O(n))

---

## 5️⃣ Quick Sort

**Idea**: Partition array around a pivot, then sort the parts.

```java
void quickSort(int[] A, int low, int high) {
    if (low < high) {
        int pi = partition(A, low, high);
        quickSort(A, low, pi);
        quickSort(A, pi + 1, high);
    }
}

int partition(int[] A, int low, int high) {
    int pivot = A[low];
    int i = low, j = high;
    while (i < j) {
        while (i <= high && A[i] <= pivot) i++;
        while (j >= low && A[j] > pivot) j--;
        if (i < j) {
            int temp = A[i]; A[i] = A[j]; A[j] = temp;
        }
    }
    int temp = A[low]; A[low] = A[j]; A[j] = temp;
    return j;
}
```

### 🔍 Explanation
- Best: O(n log n)
- Worst: O(n²) if pivot always at edge
- Stable: ❌
- Adaptive: ❌

## 6️⃣ Shell Sort

**Idea**: Improves insertion sort by comparing elements at gaps (also called diminishing increment sort).

```java
void shellSort(int[] A) {
    int n = A.length;
    for (int gap = n / 2; gap >= 1; gap /= 2) {
        for (int i = gap; i < n; i++) {
            int temp = A[i];
            int j = i;
            while (j >= gap && A[j - gap] > temp) {
                A[j] = A[j - gap];
                j -= gap;
            }
            A[j] = temp;
        }
    }
}
```

### 🔍 Explanation
- First sorts elements far apart, then reduces the gap.
- Final pass is a normal insertion sort.
- Gap sequence: `n/2, n/4, ..., 1`
- Time Complexity: Best ~O(n log n), Worst: O(n²)
- Stable: ❌
- Adaptive: ❌

---

## 7️⃣ Counting Sort

**Idea**: Count occurrences of each element and place them in the correct position.

```java
void countingSort(int[] A) {
    int max = Arrays.stream(A).max().getAsInt();
    int[] count = new int[max + 1];

    for (int value : A) count[value]++;

    int i = 0;
    for (int j = 0; j < count.length; j++) {
        while (count[j]-- > 0) A[i++] = j;
    }
}
```

### 🔍 Explanation
- Works only for **non-negative integers**.
- Not comparison-based.
- Space: O(k) where k = max value
- Time: O(n + k)
- Stable: ✅ (if implemented with output array)

### 📈 Visual Flow

---

## 8️⃣ Bucket Sort (Bin Sort)

**Idea**: Distribute elements into buckets, sort each bucket, then combine.

```java
void bucketSort(int[] A) {
    int max = Arrays.stream(A).max().getAsInt();
    List<List<Integer>> buckets = new ArrayList<>(max + 1);

    for (int i = 0; i <= max; i++) buckets.add(new LinkedList<>());

    for (int value : A) buckets.get(value).add(value);

    int k = 0;
    for (List<Integer> bucket : buckets) {
        for (int num : bucket) {
            A[k++] = num;
        }
    }
}
```

### 🔍 Explanation
- Efficient when input is uniformly distributed
- Space: High due to buckets
- Time: O(n + k) in average case
- Stable: ✅
- Adaptive: ❌

---

## 9️⃣ Radix Sort

**Idea**: Sort numbers digit by digit using **stable counting sort** starting from least significant digit (LSD).

```java
void radixSort(int[] A) {
    int max = Arrays.stream(A).max().getAsInt();
    for (int exp = 1; max / exp > 0; exp *= 10)
        countingSortByDigit(A, exp);
}

void countingSortByDigit(int[] A, int exp) {
    int n = A.length;
    int[] output = new int[n];
    int[] count = new int[10];

    for (int i = 0; i < n; i++)
        count[(A[i] / exp) % 10]++;

    for (int i = 1; i < 10; i++)
        count[i] += count[i - 1];

    for (int i = n - 1; i >= 0; i--) {
        int index = (A[i] / exp) % 10;
        output[count[index] - 1] = A[i];
        count[index]--;
    }

    System.arraycopy(output, 0, A, 0, n);
}
```

### 🔍 Explanation
- Best for numbers with similar digit lengths
- Time: O(nk), where k = number of digits
- Space: O(n + k)
- Stable: ✅

---

## ✅ Final Comparison Table

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

