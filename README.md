# Read ME - TurnkeyAssesment

The Assessment was aimed to assess problem solving skills of candidates, how conversant they are with the said languages (Java and Sql) and code optimizaiong.
It also tested the debugging skills of the candidates.

## - Fibonacci Sequence Question
### The question required candidate to write a program that prompt users to enter an integer and the program prints the fibonacci up to the given inter. The base cases were fib(0) = 0 and fib(1)=1
Fibonacci is a sequence in which each number is a sum of the two preceeding numbers.

<img src="https://cdn.britannica.com/95/130895-050-F4DEFE46/numbers-diagonal-Fibonacci-sequence-triangle-Pascal.jpg"  width=30% height=30%/>

I first approached this question through the naive recursion method. I then used a for loop to print the sequence. While this solution works, it is costly as it has an exponential time complexity [O(2^n)].
This is because for every fibonacci number the method is called twice.

I then approached the question from a dynamic programming view. In the dynamic programming approach, the Fibonacci numbers are calculated iteratively from the bottom-up, starting from the base cases (in this case fib(0) and fib(1)) and storing the previously calculated Fibonacci numbers in an array.

Each Fibonacci number is calculated only once and then stored for future reference. Since the dynamic programming approach avoids redundant calculations by storing the intermediate results, the time complexity is linear. It only requires a single pass through the loop, calculating each Fibonacci number once. Therefore, the time complexity is O(n).

## - Get Largest difference Between any Two numbers

### The question required the candidate to write a function that, given a list returns the largest difference between any two number in the list

I approached this question using java's functional programming paradigm. I used streams which has various methods such as distinct(), to take care of the similar elements in the list.

I any given list, the difference between the highest number and the smallest number in the list will produce the highest difference. So  I used streams to obtain the largest number and the smallest number and  got the difference, which was the required return of the function. The program has a linear time complexity O(n).

## - Sql Query

This question tested the basic understanding of SQL and how to query the database given conditions. The conditions were, Query the database for all employees above the age of 30 who earn above $50000.

The question tested use of boolean logic AND to retrieve all who fall under the above bracket.


## - Debugging An Average Calculator
### The question tested the debugging abilities of the candidates.

The given function returned the average of a given list of numbers. The problem as I identified was that using the operator / on two integers while we expected a return of double.

The operator / performs a floating point division.This means that if both total and numbers.length are integers, the operation will be an integer division causing premature truncation of the final answer.

To correct this,I did a type-cast on total (numbers.length) to double since integer by double -or vise-versa- division produces a double or a float preventing the premature truncation.
