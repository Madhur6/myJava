# Documentation for finalHeap Class

## Overview
The `finalHeap` class, implemented in the `ron` package, manages a binary max-heap using a **differential heap representation**. Instead of storing absolute values, each node stores the difference between its value and its parent. This helps in certain space optimizations and showcases advanced heap manipulation techniques.

---

## Method Summaries

### 1. `getValue(int[] heap, int idx)`
**Time Complexity:**
- Best-case: O(1)
- Worst-case: O(log n)

**Purpose:**
Calculates the actual value of a node at index `idx` by traversing back up to the root and summing the differences.

---

### 2. `swapAndUpdate(int[] heap, int i, int j)`
**Time Complexity:**
- Best-case: O(1)
- Worst-case: O(log n)

**Purpose:**
Swaps two nodes `i` and `j` while preserving the integrity of the differential heap.

---

### 3. `heapify(int[] heap, int n, int i)`
**Time Complexity:**
- Best-case: O(log n)
- Worst-case: O(log² n)

**Purpose:**
Maintains the max-heap property by comparing actual values and recursively swapping down if needed.

---

### 4. `buildHeap(int[] heap)`
**Time Complexity:**
- Best-case: O(n log n)
- Worst-case: O(n log² n)

**Purpose:**
Converts a raw array into a valid max-heap using bottom-up `heapify` calls.

---

### 5. `heapInsert(int[] heap, int key)`
**Time Complexity:**
- Best-case: O(n)
- Worst-case: O(n + log² n)

**Purpose:**
Inserts a new key into the heap, performs upward swaps, and returns the new heap.

---

### 6. `addToKeys(int[] heap, int c)`
**Time Complexity:**
- O(1)

**Purpose:**
Adds a constant `c` to all actual values in the heap by incrementing only the root.

---

### 7. `getActualHeap(int[] heap)`
**Time Complexity:**
- Best-case: O(log n)
- Worst-case: O(n log n)

**Purpose:**
Returns an array of actual values of all heap nodes by applying `getValue()` on each.

---

### 8. `findInHeap(int[] heap, int z)` *(BFS Version)*
**Time Complexity:**
- Best-case: O(log n)
- Worst-case: O(n log n)

**Purpose:**
Searches for a value `z` in the heap using BFS, leveraging the fact that if `value < z`, we can prune that subtree.

---

## Optional Implementations (Commented)

### - Recursive `findInHeapRecurssive(...)`
An alternative DFS-based recursive implementation for finding a value.

### - Recursive `getValue(...)`
A top-down recursive version to compute the actual value of a node (slightly slower than iterative).

---

## Main Method Logic

1. Initializes a traditional max-heap.
2. Converts it into differential format where:
   ```java
   modifiedHeap[i] = original[i] - original[parent(i)]
   ```
3. Demonstrates operations like building the modified heap and printing values.

---

## Summary
This implementation is a non-traditional heap using relative value storage, which makes certain operations more efficient or unique in structure. The provided methods preserve heap integrity while supporting search, insertion, and reconstruction of actual values.