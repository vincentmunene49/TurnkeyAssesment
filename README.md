# Read ME - TurnkeyAssesment

The Assessment was aimed to access problem solving skills of candidates, how conversant they are with the said languages (Java and Sql) and code optimizaiong.
It also tested the debugging skills of the candidates.

## Fibonacci Sequence Question
### The question required candidate to write a program that prompt users to enter an integer and the program prints the fibonacci up to the given inter. The base cases were fib(0) = 0 and fib(1)=1

I first approached this question through the naive recursion method. I then used a for loop to print the sequence. While this solution works, it is costly as it has an exponential time complexity [O(2^n)].
This is because for every fibonacci number the method is called twice.
I then approached the question from a dynamic programming view. In the dynamic programming approach, the Fibonacci numbers are calculated iteratively from the bottom-up, starting from the base cases (in this case fib(0) and fib(1)) and storing the previously calculated Fibonacci numbers in an array.
Each Fibonacci number is calculated only once and then stored for future reference. Since the dynamic programming approach avoids redundant calculations by storing the intermediate results, the time complexity is linear. It only requires a single pass through the loop, calculating each Fibonacci number once. Therefore, the time complexity is O(n).
