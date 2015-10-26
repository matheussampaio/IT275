# Lab 2
## Using String Methods
## Arithmetic

**Grade	25.0 (max 25.0)**

### Set-Up
* Create a new project in your Eclipse workspace named: `Lab02`
* In the src folder, create a package named:  `edu.ilstu.it275.lab02.<ulid>`

### Using String Methods

1. Create a new class with a main method called  StringExperiment.java  
  1. Remember to include required comment blocks
2. Declare three String variables called:  firstName, middleName, and lastName  
  1. Initialize each with your names
3. Do each of the following:  
  1. Print your full name with a space between each name.  
    1. `First Middle Last`
  2. Print your first name, middle initial followed by a period, and last name.  
    1. `First M. Last`
  3. Print your first name in all uppercase letters and last name in all lowercase letters.  
    1. `FIRST last`
  4. Print the length of your last name.  Be sure to give it a label.  
    1. `Length of last name = 4`

  5. Calculate the middle position in your last name and print the letter that is there.  If your name has an even number of letters, it will be one to the right of the middle.
    1. `s`
  6. Print the last letter in your first name.
    1. `t`
4.    Compile, debug, and run.  


## Arithmetic

* Create a new Java class named `RestaurantBillCalculator`.
  - Complete the comment blocks as required for every program. Add an appropriate description in the Javadoc class comment.
* Declare all the variables at the top of the main method. Use descriptive
variable names. Declare the following:
  - a double constant for tip percentage set to 15%. Hint: Review the rules for naming constants.
  - a double constant for tax rate set to 7.5%
  - a double variable to hold the meal cost. Set the value to $45.75.
  - three double variables to hold the tax, tip amount, and total amount.
* Initialize each to zero.
* Write Java statements to calculate the following:
  - tax by multiplying meal cost by tax rate
  - tip amount by multiplying meal cost by tip percentage
  - total bill amount which is the combination of meal cost, tax, and tip amount
* Display the information in the following format: (Note: Don’t worry about trying to format to two decimal places yet. You will learn how to do that soon.)

```
Meal Cost: $45.75
Tax: $3.43125
Tip: $6.8625
Total amount: $56.043749999999996
```

### To Be Submitted
All of the java source code files written as part of Lab 2 .should be zipped together into a file called Lab02.zip and submitted to ReggieNet by the beginning of your next lab.

### Partial String API

**charAt**
```java
// Returns the char value at the specified index.
public char charAt(int index)
```

**indexOf**
```java
// Returns the index within this string of the first occurrence of the specified character.
public int indexOf(String str)
```

**lastIndexOf**
```java
// Returns the index within this string of the last occurrence of the specified substring.
public int lastIndexOf(String str)
```

**length**
```java
// Returns the length of this string.
public int length()
```

**substring**
```java
// Returns a new string that is a substring of this string.
public String substring(int beginIndex)

// Returns a new string that is a substring of this string.
public String substring(int beginIndex, int endIndex)
```

**toLowerCase**
```java
// Converts all of the characters in this String to lower case
public String toLowerCase()
```

**toUpperCase**
```java
// Converts all of the characters in this String to upper case
public String toUpperCase()
```
