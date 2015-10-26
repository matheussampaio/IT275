# Lab 7
## Interfaces, Abstract Classes, Inheritance

**Grade 25.0 (max 25.0)**

### Set Up
* Create a new Java project in your Eclipse workspace named: `Lab07`
* In the src folder, create a package named: `edu.ilstu.it275.lab07.<ulid>`

This lab will be improving the implementation of the Lab 06, adding an interface and an abstract base class.  

First, create an interface called `Payment.java` which will contain a method named paymentDetails that outputs an English sentence to describe the amount of the payment.

Next, create a class called `BasePayment.java` that implements the `Payment` interface and which will contain an attribute of type double that stores the amount of the payment and appropriate accessor and mutator methods.  In addition to the default constructor, provide a constructor that receives the payment amount.  Do Not implement the paymentDetails method in this class.

Next, create a class called `CashPayment.java` that is derived from the `BasePayment` class.  Implement the paymentDetails method to indicate that the payment is in cash.  Provide appropriate constructor(s).

Next, create a class called `CreditCardPayment.java` that is derived from the `BasePayment` class.  This class should contain the attributes for the name on the card, expiration date (as a String), and credit card number (as a String) as well as appropriate accessor and mutator methods.  Implement the paymentDetails method to include the credit card information in the printout.    
