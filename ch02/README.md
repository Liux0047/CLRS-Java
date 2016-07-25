# Chapter 2 - Getting Started

## Ex 2.1-2
Change line 5 into:
```
while i > 0 and A[i] < key
```

## Ex 2.2-1
_&Theta;(n^3)_

## Ex 2.2-3
On average _n/2_ elements need to be searched

Worst case all _n_ elements need to be checked

Running time for average and worst cases are both _&Theta;(n)_

## Ex 2.3-2
Refer to function `MergeSort.mergeWithoutSentinel`

## Ex 2.3-3
```
T(2n) = 2T(n) + 2n
      = 2nlgn + 2n
      = 2n * (lgn + 1)
      = 2n * lg(2n)
Q.E.D
```

## Ex 2.3-4
```
T(n) = c            if n=1
     = T(n-1) + cn  if n > 1.
```

## Ex 2.3-6
The algorithm as a whole still has a running time of _O(n^2)_ on average because of the series of swaps required for each insertion.

## Ex 2.3-7
First sort this array in _O(nlgn)_ time. And then this becomes a two-sum problem which can be solved in linear time.
[Refer to this answer on Stackoverflow](http://stackoverflow.com/a/11928155/2408445)

## Problem 2-1
**a.** Each sublist needs k^2 amount of time, in total n/k lists: `k^2 * (n/k) = nk`

**b.** Essentially it's merge sort with only _n/k_ leaves, instead of _n_ leaves.

**c.** ?

**d.** Choose k so that the running time of merge sort and insertion sort of k elements are equal

## Problem 2-2
**a.** The output contains exactly the same set of elements as the input

**b.** 

    Loop invariant:
    At the start of each iteration of the **for** loop of lines 1-4, 
    the sub array A[1..i-1] consists the smallest i-1 elements of the original array, in sorted order
    
    Proof:
    Initialization: no element, trivally satisfied
    
    Maintenance: 
    The loop in lines 2-3 will swap the smallest element of A[i..length] to position i. 
    As dicatated by loop invariant, the new A[i] is larger than any element in A[1..i-1]; 
    at the same time it is smaller than all A[i+1..length]. 
    Therefore loop invariant holds for the next iteration
    
    Termination: 
    A[1..length-1] contains the smallest (length-1) elements of the orignial array in sorted order; 
    the last one is the largest. Thus whole array is sorted
    
**c.**?

**d.** _&Theta;(n^2)_ Same in worst case
    
## Problem 2-3
**a.** _&Theta;(n)_

**b.** _&Theta;(n^2)_

**c.** 

    x*y => exponent of x in summation becomes k+1
    substitute m = k+1, summation is from m=1 to n-i, m is the exponent of x
    ai + x*y => treat as ai * (x^0) + x*y
    summation is from m to n-i
    increment i, back to orignial form
    
    At termination, i=-1, and this is the sum of the polynomial
    
## Problem 2-4
**Question to answer provided:**

**d.** is that _counted_ variable needed? since whenever _R[j]_ is exposed, it will also be added to _A_ and _j_ is incremented to the next element. 
A closer look at the code reveals that _counted_ can never be true at the end of the enclosing loop.

