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