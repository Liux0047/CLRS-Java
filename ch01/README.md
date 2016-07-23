# Chapter 1 - The Role of Algorithms in Computing

## Ex 1.2-2
```
solve for 8*n*n > 64*n*lgn:
    n > 8*lgn
    n = 43
```
[Discussion on how to solve this equation](http://math.stackexchange.com/a/20656)

## Ex1.2-3
```
solve for 100*n*n < 2^n:
    n = 15
```
Java code snippet to get the solution:
```java
public static void main(String[] args) {
    int n = 1;
    double result = 1.0;
    while (result > 0) {
        result = 100*n*n - Math.pow(2.0, n);
        n++;
    }
    System.out.println(--n);
}
```

## Problem 1-1
TBU