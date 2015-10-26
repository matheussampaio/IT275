# Lab 3
## Decision Control Structures

**Grade	25.0 (max 25.0)**

### Set-Up
* Create a new project in your Eclipse workspace named:  `Lab07`
* In the src folder, create a package named:  `edu.ilstu.it275.lab03.<ulid>`
* Import into this new package all of the following `.java` files
  - `DivideTwo.java`

### Part 1 – if/else Statement

Open the file `DivideTwo.java`.  The Java source code is shown below:

```java
package edu.ilstu;
import java.util.Scanner;

public class DivideTwo {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        double quotient = 0;

        System.out.println("This program divides two numbers.");
        System.out.print("Enter the numerator:  ");
        numerator = keyboard.nextInt();

        System.out.print("Enter the denominator:  ");
        denominator = keyboard.nextInt();
        quotient = (double) numerator / denominator;

        System.out.println(numerator + "/" + denominator
+ " = " + quotient);

        keyboard.close();
    }

}
```

Compile and run `DivideTwo.java`, and observe the output.  The program prompts the user for two integers that represent the numerator and the denominator of a fraction.  The `Scanner` object named `keyboard` is used to read the integers provided by the user.

Modify the program to include an `if/else` statement to check for division by zero.  If the denominator is not equal to zero, display the result of the division, otherwise display a message to the user that division by zero is not allowed.

### Part 2 – Switch Statement

Open the provided file `SwitchErrors.java`.  The Java source code is shown below.  The program evaluates an integer entered by the user and displays the color assigned to the integer.  Compile the program.  The program has several syntax and logic errors.  Fix the syntax errors and compile and run the program.  Does the program run as you expected?  Locate and correct the errors in the program logic.  Be sure to make use of the debugger available in Eclipse to help identify errors.

```java
package edu.ilstu;

import java.util.Scanner;

public class SwitchErrors {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.out);

        System.out.println("Key:  1=blue, 2=red, 3=green");
        System.out.print("Enter a number and I'll return ");
        System.out.print(" the corresponding color.  ");
        number = keyboard.nextInt();

        switch(number) {
            case 1:
                System.out.println("You chose red!");
                break;
            case 2:
                System.out.println("You chose blue!");
                break;
            case 3:
                System.out.println("You chose green!");
            default:
                System.out.println("Color not available!");
                break;    
        }
    }

}
```

### Part 3 while Loop
Open the provided file `ConvertLoop.java`

Convert the following code so that it uses nested while statements instead of for statements.  Place the new code at the end of the code in `ConvertLoop.java`.

```java
int s = 0;
int t = 1;

for (int i = 0; i < 5; i++) {
    s = s + i;
    for (int j = i; j > 0; j--)
    {
        t = t + (j-1);
    }
    s = s + t;
    System.out.println("T is " + t);
}
System.out.println("S is " + s);
```

### Part 4 – Loops from scratch

Create a class called `OddIntegers` with a main method.  Write the code that will compute the sum of the first `n` positive odd integers.  For example, if `n` is 5 you should compute 1 + 3 + 5 + 7 + 9.  Read the value for `n` from the user and display the result to the screen with an appropriate label.
