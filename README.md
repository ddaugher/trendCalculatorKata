# trendCalculatorKata

I created this kata, based on an existing list of acceptance tests.
I have placed the 'Acceptance Tests' within the e2e package.  The
e2e package only executes during the gradle 'accept' task.  The acceptance
tests were written as part of a Kata Battle at the November 2016 Monthly
Meeting.

I started the kata with no personal unit tests.  The acceptance tests
were designed to be executed after the local solution was complete.

My unit tests are located within the 'trend' package, named
TrendUtilsTests.

To run the local unit tests... > gradle test

To run the e2e acceptance tests... > gradle accept
