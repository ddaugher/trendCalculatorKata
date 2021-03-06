# trendCalculatorKata

Here are the instructions for the kata.

The trend kata is an exercise in determining the 'trend' of a series of numbers. 

This algorithm is weighted towards non-zero values and numbers in the series that are changing.  A value of zero 
and numbers in sequence that are the same value, are given less weight in the calculation.  The algorithm will be a summing of results, for each pair within the list, shifted by one (1).

* This algorithm, will expect a list of numbers... whole numbers and/or decimals.
* if the supplied list is empty or does not exist (null), then the trend calculator should return null.
* if the list contains only a single value, then the trend calculator should return a value of zero (0).
* the resulting trend will always start with a value of zero (0).
* the first pair will contain the first two numbers in the list
* the second pair will contain the second and third number in the list (and so on, until the list is completely processed).
* the final pair, will be the last two numbers in the list.
* the order of the list will be determined by the original order passed to the calculator.  No additional sorting will be required.
* The following calculation will be applied to each pair.  Pairs will be denoted as [p1, p2]

```
if p1 equals zero and p2 > 0, the value for the pair will be 1.0
```
```
if p1 equals p2, the value for the pair will be 0.0
```
```
otherwise, the value for the pair will be (p2-p1)/p1.
```

The result of each pair calculation will be summed, returning the trend value.

-------------------------------------------------------------

I created this kata, based on an existing list of acceptance tests.  I have placed the 'Acceptance Tests' within the e2e package.  The
e2e package only executes during the gradle 'accept' task.  The acceptance tests were written as part of a Kata Battle at the November 2016 Monthly Meeting.

I started the kata with no personal unit tests.  The acceptance tests
were designed to be executed after the local solution was complete.

My unit tests are located within the 'trend' package, named
TrendUtilsTests.

To run the local unit tests... > gradle test

To run the e2e acceptance tests... > gradle accept
