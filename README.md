<div align="center">

# ⚡ Data Structures & Algorithms in Java

<p align="center">
  <strong>A comprehensive, clean, and production-ready collection of Data Structures, Algorithms, Recursion patterns, and Object-Oriented Programming implementations in Java.</strong>
</p>

[![Language](https://img.shields.io/badge/Language-Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com/)
[![Focus](https://img.shields.io/badge/Focus-DSA%20%26%20Problem%20Solving-007ACC?style=for-the-badge&logo=thealgorithms&logoColor=white)](https://github.com/anjali-codes2305/Data-Structure-Algorithm)
[![Status](https://img.shields.io/badge/Status-Actively%20Maintained-2ea44f?style=for-the-badge)](https://github.com/anjali-codes2305/Data-Structure-Algorithm)
[![Author](https://img.shields.io/badge/Author-Anjali%20Agarwal-ff69b4?style=for-the-badge&logo=github)](https://github.com/anjali-codes2305)
[![License](https://img.shields.io/badge/License-MIT-blue.svg?style=for-the-badge)](LICENSE)

<br/>

[Explore Topics](#-topic-wise-curriculum--implementations) •
[Directory Structure](#-directory-structure) •
[Complexity Guide](#-time--space-complexity-reference) •
[Getting Started](#-getting-started--how-to-run) •
[Author Profile](#-about-the-author)

---

</div>

## 📌 Overview

Welcome to **Data-Structure-Algorithm**! This repository is a carefully curated, modular roadmap designed for mastering **Data Structures & Algorithms (DSA)** using **Java**. 

Whether you are preparing for technical interviews, revising for university examinations, or strengthening your foundational programming problem-solving skills, this repository provides hands-on, zero-dependency implementations across essential DSA topics.

### ✨ Key Highlights

- 🧩 **70+ Pure Java Implementations**: Clean, self-contained Java source files with no external framework requirements.
- 🧱 **From Basics to Advanced**: Gradual progression from basic arrays and loops to recursion, linked lists, stacks, queues, and binary trees.
- 🎯 **Interview-Focused Questions**: Includes classic problems like Two Sum, Kadane's Algorithm, Tower of Hanoi, Power Sets, and Queue Reversals.
- 🏛️ **Strong OOP Foundations**: Dedicated modules for Constructors, Polymorphism, Encapsulation, and Custom Object Data Types.
- 🧼 **Structured & Readable**: Standardized naming conventions, intuitive package organization, and readable logic.

---

## 📑 Table of Contents

- [Overview](#-overview)
- [Directory Structure](#-directory-structure)
- [Topic-Wise Curriculum & Implementations](#-topic-wise-curriculum--implementations)
  - [1. Arrays & 2D Matrices](#1-arrays--2d-matrices)
  - [2. Searching Algorithms](#2-searching-algorithms)
  - [3. Sorting Algorithms](#3-sorting-algorithms)
  - [4. Linked Lists](#4-linked-lists)
  - [5. Stacks](#5-stacks)
  - [6. Queues](#6-queues)
  - [7. Binary Trees](#7-binary-trees)
  - [8. Recursion & Backtracking](#8-recursion--backtracking)
  - [9. Strings & Pattern Processing](#9-strings--pattern-processing)
  - [10. Sets & HashMaps](#10-sets--hashmaps)
  - [11. Object-Oriented Programming (OOP)](#11-object-oriented-programming-oop)
  - [12. Mathematics & Pattern Printing](#12-mathematics--pattern-printing)
- [Time & Space Complexity Reference](#-time--space-complexity-reference)
- [Getting Started & How to Run](#-getting-started--how-to-run)
- [Contribution Guidelines](#-contributing)
- [About the Author](#-about-the-author)

---

## 📂 Directory Structure

```text
Data-Structure-Algorithm/
├── Arrays/                  # 1D & 2D array operations, transformations & problems
├── Basic_Sorting/           # Elementary sorting algorithms (Bubble, Insertion)
├── Binary/                  # Bit manipulation & binary operations
├── Binary_Trees/            # Binary tree representations & traversals
├── Functions/               # Modular methods & functional mathematical operations
├── Linear_Search/           # Search algorithms across 1D & 2D matrices, bounds & strings
├── LinkedList/              # Singly Linked List nodes, structures & traversals
├── MergeSort/               # Divide-and-conquer Merge Sort algorithm
├── Objects_Classes/         # Java object models, classes & custom structures
├── OOPS/                    # Object-Oriented concepts (Constructors, Polymorphism, Access)
├── Pattern_Printing/        # Visual patterns (Pyramids, Floyd's Triangle, Inverted)
├── Printing_Questions/      # Formatting & star pattern printing
├── Queue/                   # FIFO Queue implementations, reversals & positional operations
├── Recursion/               # Recursive problem solving (Tower of Hanoi, Power Sets, Arrays)
├── Sets_Maps/               # HashSet & HashMap collections and utilities
├── Stacks/                  # LIFO Stack implementations (Array & Linked List based)
├── Strings/                 # String manipulations, palindromes & StringBuilder
├── Two_DArrays/             # Matrix declarations, traversals & coordinate arithmetic
├── HCF.java                 # Greatest Common Divisor / Highest Common Factor
├── Maximum_Subarray.java    # Kadane's Algorithm for Maximum Subarray Sum
├── palindrome.java          # Palindrome number verification
├── Powerraised.java         # Exponentiation / Power computations
└── Subarray.java            # Contiguous subarray generation
```

---

## 🗺️ Topic-Wise Curriculum & Implementations

### 1. Arrays & 2D Matrices
Arrays form the backbone of contiguous memory access and linear data structures.

| File / Problem | Description | Concepts Covered |
| :--- | :--- | :--- |
| [`Two_Sum.java`](Arrays/Two_Sum.java) | Find two indices that sum up to target | Two Pointers / Target Searching |
| [`Array_Sum.java`](Arrays/Array_Sum.java) | Compute sum of all array elements | Iteration & Accumulation |
| [`Merge_Two_Sorted_Array.java`](Arrays/Merge_Two_Sorted_Array.java) | Merge two pre-sorted arrays into one | Two-Pointer Merge Technique |
| [`Second_Largest_Element.java`](Arrays/Second_Largest_Element.java) | Find 2nd highest number without sorting | Single-Pass Comparison |
| [`maximum_element.java`](Arrays/maximum_element.java) | Identify maximum item in array | Extrema Search |
| [`minimum_element.java`](Arrays/minimum_element.java) | Identify minimum item in array | Extrema Search |
| [`Reverse_an_Arrray.java`](Arrays/Reverse_an_Arrray.java) | Invert array elements in place | Swapping / Symmetric Pointers |
| [`ShallowCopy_DeepCopy.java`](Arrays/ShallowCopy_DeepCopy.java) | Memory reference vs clone copying | Memory Management & References |
| [`Odd_Even_Indexed.java`](Arrays/Odd_Even_Indexed.java) | Separate elements by parity of index | Index Manipulation |
| [`Product_of_Array.java`](Arrays/Product_of_Array.java) | Compute product accumulator | Accumulation |
| [`print_negative.java`](Arrays/print_negative.java) | Filter and display negative numbers | Conditional Filtering |
| [`TwoDArrays.java`](Arrays/TwoDArrays.java) | Multidimensional array operations | Row-Column Indexing |
| [`Basics.java`](Two_DArrays/Basics.java) | Matrix initialization & display | 2D Traversal |
| [`List.java`](Arrays/List.java) | Dynamic Array / ArrayList utilities | Java Collections Framework |

---

### 2. Searching Algorithms
Linear and specialized searching algorithms across arrays, strings, and matrices.

| File / Problem | Description | Complexity |
| :--- | :--- | :--- |
| [`Intro.java`](Linear_Search/Intro.java) | Core Linear Search algorithm | $\mathcal{O}(n)$ Time |
| [`SearchIn2Darray.java`](Linear_Search/SearchIn2Darray.java) | Search target coordinate in matrix | $\mathcal{O}(m \times n)$ Time |
| [`maxIn2D.java`](Linear_Search/maxIn2D.java) | Find maximum value inside 2D matrix | $\mathcal{O}(m \times n)$ Time |
| [`searchInString.java`](Linear_Search/searchInString.java) | Character search across string | $\mathcal{O}(L)$ Time |
| [`SearchInRange.java`](Linear_Search/SearchInRange.java) | Bounded index search (`[start, end]`) | $\mathcal{O}(k)$ Time |
| [`evendigits.java`](Linear_Search/evendigits.java) | Count numbers with even number of digits (LeetCode 1295) | $\mathcal{O}(n \times d)$ Time |
| [`max_wealth.java`](Linear_Search/max_wealth.java) | Richest Customer Wealth calculation (LeetCode 1672) | $\mathcal{O}(m \times n)$ Time |

---

### 3. Sorting Algorithms
Essential sorting techniques for ordered dataset organization.

| File / Algorithm | Mechanism | Time (Best) | Time (Worst) | Space |
| :--- | :--- | :---: | :---: | :---: |
| [`Bubble_Sort.java`](Basic_Sorting/Bubble_Sort.java) | Repeated adjacent element swapping | $\mathcal{O}(n)$ | $\mathcal{O}(n^2)$ | $\mathcal{O}(1)$ |
| [`Insertion_Sort.java`](Basic_Sorting/Insertion_Sort.java) | Builds sorted array one item at a time | $\mathcal{O}(n)$ | $\mathcal{O}(n^2)$ | $\mathcal{O}(1)$ |
| [`mergeSortCode.java`](MergeSort/mergeSortCode.java) | Divide and Conquer recursive partition & merge | $\mathcal{O}(n \log n)$ | $\mathcal{O}(n \log n)$ | $\mathcal{O}(n)$ |

---

### 4. Linked Lists
Dynamic non-contiguous data structure linked via pointer nodes.

| File | Description | Highlights |
| :--- | :--- | :--- |
| [`NodeofList.java`](LinkedList/NodeofList.java) | Node building block | Value payload & `.next` reference pointer |
| [`LinkListDataStructure.java`](LinkedList/LinkListDataStructure.java) | Linked List class & operations | Insertion, Deletion, Length inspection |
| [`Traverse.java`](LinkedList/Traverse.java) | Linked List Traversal | Iterative traversal through tail node |

---

### 5. Stacks
Last-In, First-Out (LIFO) abstract data type implementations and applications.

| File | Description | Key Operation |
| :--- | :--- | :--- |
| [`Basic.java`](Stacks/Basic.java) | Fundamental Stack operations | Push, Pop, Peek, isEmpty |
| [`LLAtStack.java`](Stacks/LLAtStack.java) | Stack implementation using Linked List | Dynamic memory allocation stack |
| [`pushAtBottom.java`](Stacks/pushAtBottom.java) | Recursively/iteratively push to bottom | Stack reversal helper |
| [`getAtPosition.java`](Stacks/getAtPosition.java) | Retrieve element at specific 0-based depth | Indexed element access in LIFO |
| [`traverse.java`](Stacks/traverse.java) | Stack element inspection & display | Order-preserving traversal |

---

### 6. Queues
First-In, First-Out (FIFO) abstract data type with specialized manipulation routines.

| File | Description | Concepts |
| :--- | :--- | :--- |
| [`Basic.java`](Queue/Basic.java) | Standard Queue operations | Enqueue (`offer`), Dequeue (`poll`), Front |
| [`Reverse_a_queue.java`](Queue/Reverse_a_queue.java) | Full queue order inversion | Stack-assisted reversal |
| [`Reverse_k_Elements.java`](Queue/Reverse_k_Elements.java) | Reverse first $k$ elements in queue | Partial reversal using auxiliary stack |
| [`At_a_Position.java`](Queue/At_a_Position.java) | Positional insertion / element access | Coordinate manipulation |
| [`Traversing.java`](Queue/Traversing.java) | Inspecting elements in sequence | FIFO traversal |

---

### 7. Binary Trees
Hierarchical nonlinear data structure representing tree hierarchies.

| File | Description | Core Operations |
| :--- | :--- | :--- |
| [`Basic.java`](Binary_Trees/Basic.java) | Tree Node creation & Traversals | Node structure, Left/Right references, Tree Display |

---

### 8. Recursion & Backtracking
Solving complex computational problems through self-similar subproblem delegation.

| File / Problem | Description | Pattern |
| :--- | :--- | :--- |
| [`TowerOfHanoi.java`](Recursion/TowerOfHanoi.java) | Classic Tower of Hanoi puzzle | Mathematical induction & auxiliary pegs |
| [`PowerSets.java`](Recursion/PowerSets.java) | Generate all subsets of a set | Pick / Don't Pick recursion pattern |
| [`preinpost.java`](Recursion/preinpost.java) | Euler Tour Traversal tracing | Call-stack visualization (Pre, In, Post orders) |
| [`RecursionOnArrays.java`](Recursion/RecursionOnArrays.java) | Array traversal & searches via recursion | Base-case bounded array processing |
| [`Stringbyrecursion.java`](Recursion/Stringbyrecursion.java) | Substring and character manipulation | String splitting recursion |
| [`Print_one_to_n.java`](Recursion/Print_one_to_n.java) | Ascending counter printing | Head & Tail recursion |
| [`Global_Variables.java`](Recursion/Global_Variables.java) | Scope management during recursion | Global vs Call-frame local state |

---

### 9. Strings & Pattern Processing
String algorithms, immutability, manipulation, and character analysis.

| File | Description | Highlights |
| :--- | :--- | :--- |
| [`palindrome_string.java`](Strings/palindrome_string.java) | Check if string reads same backward | Symmetric two-pointer check |
| [`String_Builder.java`](Strings/String_Builder.java) | High-performance mutable string builder | Append, Insert, Delete, Capacity |
| [`Print_All_Substring.java`](Strings/Print_All_Substring.java) | Generate all continuous substrings | Nested range traversal $\mathcal{O}(n^2)$ |
| [`Vowels_in_a_String.java`](Strings/Vowels_in_a_String.java) | Count total vowels in input text | Character classification |
| [`Built_in_methods.java`](Strings/Built_in_methods.java) | Standard Java String API exploration | `.charAt()`, `.substring()`, `.indexOf()` |
| [`inttoString.java`](Strings/inttoString.java) | Integer to String conversion techniques | Type conversions & casting |

---

### 10. Sets & HashMaps
Constant-time $\mathcal{O}(1)$ average lookup and key-value pairings.

| File | Description | Highlights |
| :--- | :--- | :--- |
| [`Sets.java`](Sets_Maps/Sets.java) | `HashSet` & `HashMap` operations | Fast lookup, duplicate elimination, frequency maps |

---

### 11. Object-Oriented Programming (OOP)
Core software design paradigms implemented in Java.

| File | Topic | Key Concepts |
| :--- | :--- | :--- |
| [`Constructors.java`](OOPS/Constructors.java) | Constructor Types | Default, Parameterized, Object instantiation |
| [`Polymorphism.java`](OOPS/Polymorphism.java) | Polymorphic behaviors | Method Overloading & Runtime Overriding |
| [`privatekeyword.java`](OOPS/privatekeyword.java) | Encapsulation & Data Hiding | Private variables, Getters & Setters |
| [`Passingtheobjectstomethods.java`](OOPS/Passingtheobjectstomethods.java) | Reference passing | Call by value of object references |
| [`UserDefinedDataType.java`](OOPS/UserDefinedDataType.java) | Custom domain models | Creating cohesive composite data types |
| [`Books_Price.java`](Objects_Classes/Books_Price.java) | Class design | State representation & method behavior |
| [`Marks.java`](OOPS/Marks.java) | Entity modeling | Academic grading & mark evaluations |
| [`Primecheck.java`](Objects_Classes/Primecheck.java) | Modular verification | Encapsulated mathematical routines |

---

### 12. Mathematics & Pattern Printing
Mathematical optimization and visual patterns for loop mastery.

| File / Problem | Description | Techniques |
| :--- | :--- | :--- |
| [`Maximum_Subarray.java`](Maximum_Subarray.java) | Kadane's Algorithm for Maximum Subarray | Dynamic Programming / Greedy running sum |
| [`HCF.java`](HCF.java) | Highest Common Factor / Greatest Common Divisor | Euclidean Algorithm |
| [`palindrome.java`](palindrome.java) | Number palindrome check | Modulo digit extraction |
| [`Powerraised.java`](Powerraised.java) | Fast Exponentiation / Power | Iterative & recursive powers |
| [`Subarray.java`](Subarray.java) | Subarray generation | Contiguous slices |
| [`Floyd_triangle.java`](Pattern_Printing/Floyd_triangle.java) | Floyd's continuous number triangle | Consecutive counter tracking |
| [`Half_Pyramid.java`](Pattern_Printing/Half_Pyramid.java) | Increasing half-pyramid of stars | Outer & inner loop bounds |
| [`Inverted_Half_Pyramid.java`](Pattern_Printing/Inverted_Half_Pyramid.java) | Inverted half pyramid | Decreasing loop iteration |
| [`Star.java`](Printing_Questions/Star.java) | Symmetric star patterns | Grid coordinate plotting |

---

## 📊 Time & Space Complexity Reference

### 🚀 Data Structures Cheat Sheet

| Data Structure | Average Access | Average Search | Average Insertion | Average Deletion | Space Complexity |
| :--- | :---: | :---: | :---: | :---: | :---: |
| **Array** | $\mathcal{O}(1)$ | $\mathcal{O}(n)$ | $\mathcal{O}(n)$ | $\mathcal{O}(n)$ | $\mathcal{O}(n)$ |
| **Stack** | $\mathcal{O}(n)$ | $\mathcal{O}(n)$ | $\mathcal{O}(1)$ | $\mathcal{O}(1)$ | $\mathcal{O}(n)$ |
| **Queue** | $\mathcal{O}(n)$ | $\mathcal{O}(n)$ | $\mathcal{O}(1)$ | $\mathcal{O}(1)$ | $\mathcal{O}(n)$ |
| **Singly Linked List** | $\mathcal{O}(n)$ | $\mathcal{O}(n)$ | $\mathcal{O}(1)$ | $\mathcal{O}(1)$ | $\mathcal{O}(n)$ |
| **Hash Table** | $\mathcal{N/A}$ | $\mathcal{O}(1)$ | $\mathcal{O}(1)$ | $\mathcal{O}(1)$ | $\mathcal{O}(n)$ |
| **Binary Tree** | $\mathcal{O}(n)$ | $\mathcal{O}(n)$ | $\mathcal{O}(n)$ | $\mathcal{O}(n)$ | $\mathcal{O}(n)$ |

### ⚡ Sorting Algorithms Cheat Sheet

| Algorithm | Best Time | Average Time | Worst Time | Space | Stable? |
| :--- | :---: | :---: | :---: | :---: | :---: |
| **Bubble Sort** | $\mathcal{O}(n)$ | $\mathcal{O}(n^2)$ | $\mathcal{O}(n^2)$ | $\mathcal{O}(1)$ | Yes |
| **Insertion Sort** | $\mathcal{O}(n)$ | $\mathcal{O}(n^2)$ | $\mathcal{O}(n^2)$ | $\mathcal{O}(1)$ | Yes |
| **Merge Sort** | $\mathcal{O}(n \log n)$ | $\mathcal{O}(n \log n)$ | $\mathcal{O}(n \log n)$ | $\mathcal{O}(n)$ | Yes |

---

## 🚀 Getting Started & How to Run

### Prerequisites
Make sure you have the Java Development Kit (JDK 8 or higher) installed on your system.

```bash
# Verify your Java installation
java -version
javac -version
```

### 1. Clone the Repository
```bash
git clone https://github.com/anjali-codes2305/Data-Structure-Algorithm.git
cd Data-Structure-Algorithm
```

### 2. Compile and Run any File
Every implementation in this repository is self-contained with its own `main` method for easy compilation and execution:

```bash
# Example 1: Run Two Sum in Arrays
javac Arrays/Two_Sum.java
java Arrays.Two_Sum

# Example 2: Run Tower of Hanoi in Recursion
javac Recursion/TowerOfHanoi.java
java Recursion.TowerOfHanoi

# Example 3: Run Merge Sort
javac MergeSort/mergeSortCode.java
java MergeSort.mergeSortCode

# Example 4: Run Maximum Subarray
javac Maximum_Subarray.java
java Maximum_Subarray
```

---

## 🤝 Contributing

Contributions, feedback, and optimizations are always welcome!

1. **Fork** the repository
2. **Create** your feature branch (`git checkout -b feature/NewAlgorithm`)
3. **Commit** your changes (`git commit -m 'Add Radix Sort implementation'`)
4. **Push** to the branch (`git push origin feature/NewAlgorithm`)
5. **Open** a Pull Request

---

## 👩‍💻 About the Author

<div align="center">

**Anjali Agarwal**  
*Passionate Computer Science Enthusiast & Software Developer*

[![GitHub](https://img.shields.io/badge/GitHub-anjali--codes2305-181717?style=for-the-badge&logo=github)](https://github.com/anjali-codes2305)
[![Email](https://img.shields.io/badge/Email-anjaliagarwalkanota%40gmail.com-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:anjaliagarwalkanota@gmail.com)

⭐ **If you find this repository helpful for your DSA journey or interview preparation, please star the repo!** ⭐

</div>

---

<div align="center">
  <sub>Built with ❤️ by Anjali Agarwal • Open-Source DSA Reference</sub>
</div>