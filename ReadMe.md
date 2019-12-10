# Discounts

## Thought Process

I think we should start off with some tests in JUnit to make sure we satisfy all the examples below 

We will then proceed to look at some edge cases

We can look at utilizing strategy behaviour strategy and applying SOLID principle to this problem to allow for ease of
scalability in the future.




## Behaviour

The input to your solution should match the following schema: `[ [ <product>, <quantity> ],...]`

The output of your solution should be a number representing the total price at checkout after discounts.

Your solution should work for any combination of products listed above, in any quantities equal to or above 0.

## Input/Output Expectations

Here are some example inputs and outputs:

```
 [ ['grapes', 1], ['apples', 1], ['peaches', 1]] => 15
 [ ['grapes', 2], ['apples', 2], ['peaches', 1]] => 16.8
 [ ['grapes', 3], ['apples', 5], ['peaches', 2]] => 36
 [ ['grapes', 7], ['apples', 7], ['peaches', 7]] => 85.8
```
