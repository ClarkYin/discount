# Discounts

## Description

The marketing team for a local grocery store wants to boost sales. To do so, they want to start using automatic discounts during checkout. The automatic discounts that they would like to have are:

- Buy one bag of grapes and get another bag of grapes for free ("Two for the price of one")
- Buy at least two apples and get a 20% discount on apples (eg. apple > 2  -> apply discount)
- buy at least 7 and get one free

The products that are currently available in their store are:

- Bag of grapes priced at $5 per bag
- Apples priced at $3 per apple
- Peaches priced at $7 per peach
- Computers price at $8 per computer

Your task: Build a program to calculate the total price at checkout for a customer, taking discounts into consideration.

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
