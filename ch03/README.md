# Chapter 3 - Growth of Functions

## Ex 3.1-1
```
max(f(n), g(n)) <= f(n) + g(n)
2 * max(f(n), g(n)) >= f(n) + g(n)
1/2 * f(n) + g(n) <= max <= f(n) + g(n)
Thus choosing C1 = 1/2, C2 = 1
Q.E.D.           
```

## Ex 3.1-5
if f(n) = &Theta;(g(n)):
    first inequality means f(n) = &Omega;(g(n))
    second inequality means f(n) = &Omicron;(g(n))
    
if f(n) = &Omega;(g(n)) and f(n) = &Omicron;(g(n)):
    The definitions of &Omega;(g(n)) and &Omicron;(g(n)) combine to define &Theta;(g(n))

## Ex 3.1-6
more or less the same as 3.1-5

## Ex 3.1-7
Using the definition of f(n)/g(n) = 0 or &#x221e; for &omicron;-notation and &omega;-notation respectively
There is no f(n), that divided by g(n), can be both 0 and infinity

## Ex 3.1-8
Straightforward

## Ex 3.2-2
Taking log a on both sides:
```
log b C = log a (C ^ log b A)
log b C = log b A * log a C
log b C / log b A = log a C

Q.E.D.
```

## Ex 3.2-3
```
lg(n!) = lgn + lg(n-1) + lg(n-2) + ... + lg(2) + lg(1)
       <= n * lgn       (thus upper bound(nlgn))
       
because for all k = 2..n/2, 
    n-k > n/k, 
    => lg(n-k) > lg(n/k)
lg(n!) = lgn + lg(n-1) + lg(n-2) + ... + lg(2) + lg(1)       
       = lgn + lg(n-1) + lg(1) + [lg(n-2) + lg(2)] + [lg(n-3) + lg(3)] + ...
       >= lgn + lg(n-1) + lg(1) + 1/2 * (n-2) * lgn
       >= 1/2 * (n-2) *lgn      (thus lower bound (nlgn))
       
Q.E.D.
```

Alternatively, using Stirling's approximation:
```
lg(n!) = lgn + nlgn - nlge + lg(theta(n^-1)) 
       = nlgn
```
For second part, by using the definition of f(n)/g(n) = 0 or &#x221e; for &omicron;-notation and &omega;-notation respectively, proofs are straightforward.

