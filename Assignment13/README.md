# ITK 275 – Java as a 2nd Language
## Chapter 13 Programming Assignment

All of the java classes should be placed in a package named `edu.iltu.itk275.assignment13.<your ulid>`.  The class should be submitted as an attachment to this assignment.  They may be submitted individually or placed into a single archive (.zip) file.

Define an interface named `Shape` with a single method named area that calculates the `area` of the geometric shape.

```java
public double area();
```

Next, define a class named `Circle` that implements `Shape`.  The `Circle` class should have an instance variable for the radius, a constructor that sets the radius, accessor / mutator methods for he radius, and an implementation of the `area` method.  Also define a class named `Rectangle` that implements `Shape`.  The `Rectangle` class should have instance variables for the `height` and `width`, a constructor that sets the `height` and `width`, accessor and mutator methods for the `height` and `width`, and an implementation of the `area` method.  Also define a class named `Square` that implements `Shape`.  The `Square` class should have an instance variable for the `sideLength`, a constructor that sets the `sideLength`, accessor and mutator methods for the `sideLength`, and an implementation of the `area` method.  

Finally write a Java application that creates an instance of each of the three shapes and displays the area of each shape.  The creation of each of the three shape object should look like the following:

```java
Shape circle = new Circle(15);
Shape square = new Square(20);
```
