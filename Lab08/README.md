# Lab 8
## Exception Handling

**Grade 20.0 (max 25.0)**

**Set Up**
* Create a new Java project in your Eclipse workspace named: `Lab08`
* In the src folder, create a package named:  `edu.ilstu.it275.lab08.<ulid>`


This snippet of code allows the user to input two integers and then divides them.  Unfortunately, it is error prone (ie allows a divide by zero error) and does not give the user much feedback when the two numbers are not evenly divisible.

Scanner userIn = new Scanner(System.in);
 int numerator, denominator;
 int result;

numerator = userIn.nextInt();
denominator = userIn.nextInt();
result = numerator / denominator;

First, separate the input function from the math function, placing the input function into a class with a main method, and the math function into a the class `MyMath`.  

Next, declare two exception classes, a `ZeroDenominatorException` which should be a subclass of `RuntimeException` and a `NotEvenlyDivisibleException` which should be a subclass of Exception.  

Next, within the `MyMath` class method that divides the two numbers, throw a `ZeroDeonminatorException` if the denominator is zero and throw a `NotEvenlyDivisibleException` if the two numbers are not evenly divisible (ie there is any remainder).      

Finally, in the main method, add the error handling code necessary to provide feedback to the user when the division cannot be done, or when the division will end in a remainder that would not be shown.  

### Additional instructor's comments about your submission
One of the two Exception classes is supposed to be an unchecked exception. 
