# Lab 4
## Classes

*The following exercises are to be completed during lab class.  If you do not have time to finish during lab, they must be completed before the beginning of the following lab session.*

**Grade 22.0 (max 25.0)**


### Set-Up
* Create a new project in your Eclipse workspace named:  `Lab04`
* In the src folder, create a package named:  `edu.ilstu.it275.lab04.<ulid>`

### Part 1
Create a java class `Circle` as described below:
* radius: a double
* PI: a final double initialized with the value 3.14159

The class should have the following methods:
* `calculateArea` - Returns the area of the circle, which is calculated as:
  - `area = PI * radius * radius`
* `calculateDiameter` - Returns the diameter of the circle, which is calculated as:
  - `diameter = radius * 2`
* `calculateCircumference` - Returns the circumference of the circle, which is calculated as:
  - `circumference = 2 * PI * radius`
* `setRadius` - A mutator (setter) method for the radius field
* `getRadius` - An accessor (getter) method for the radius field

### Part 2
Create a java class `Book` class as described below:

The Book class has three instance variables:
* The sales tax as a constant
* The title of the book
* The price of the book

The class has the following methods:
* Accessor methods (getters) for all instance variables
* Mutator methods (setters) for the title and price
* An increasePrice method that accepts one parameter representing the percentage of the increase in price.  Note that a 5% increase should be passed in as 0.05.  The increasePrice method should adjust the price of the book by the specified percentage.  For example, if I have a Book book1 currently priced at $12 and I call the increasePrice method with 5%:
```
book1.increasePrice(0.05);
book1 should now be priced at $12.60
```

A calculateSales method that accepts one parameter representing the number of books sold and computes and returns the total sales.

### Part 3

Create test data and calculate the expected result.

| Input | Expected Results |||
| :---: | :---: | :---: | :---: |
| Radius | Area | Diameter | Circumference |
|   -    |   -  |    -     |       -       |
|   -    |   -  |    -     |       -       |
|   -    |   -  |    -     |       -       |

Write a program name `CircleDriver` that demonstrates the Circle class by asking the user for the circle's radius, creating a Circle object, and then reporting the circle's area, diameter, and circumference.

### Part 4

Create test data and calculate the expected result.

|  | Input || Expected Output |
| :---: | :---: | :---: | :---: |
| **Book** | **Number Sold** | **Percent Increase** | **Price** |
| Life of Pi |   -  |    ---    |       -       |
| Harry Potter |   -  |   ---     |       -       |
| Life of Pi |   -  |    -     |       -       |
| Harry Potter |   -  |    -     |       -       |

Use the `Book` class you coded above. Sales tax would be 7.5%. Create a Java program class named `BookDriver` that creates two Book objects. First object is for the book "Life of Pi " priced at $13.50 and the second is for the book "Harry Potter: Goblet of Fire" priced at $22.00. Sales program should ask the user for number sold for each book and display the resulting sales amount for each, properly labeled and indicating for which book. Then the program will ask the user for percentage increase in price for each book, and update the Book objects accordingly. Display the sales amounts again using the updated prices.  All money amounts should be formatted with a dollar sign and two decimal places.

### Additional instructor's comments about your submission
**-3** :  Object attributes should be marked as private. 
