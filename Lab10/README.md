# Lab 10
## Interfaces

### Set-Up
* Create a new project in your Eclipse workspace named: `Lab10`
* In the src folder, create a package named: `edu.ilstu.it275.lab10.<ulid>`

### Problem
Create an interface named `Payment` which has a single method named `calculatePaymentSurcharge` returning a double and receives a double representing the original amount of the payment.  

Next create an abstract base class named `BasePayment`.  This class should have a single constructor which receives a double, representing the base payment amount.  Within the constructor, the base payment amount should be added to the payment surcharge amount resulting in the final payment amount which will be stored as an attribute value.  Within the `BasePayment` class, the surcharge amount will always be zero.  

Next, create a non-abstract class named `CreditCardPayment` which inherits from the `BasePayment` class.  This class should have the same constructor(s) as it’s parent class.  The surcharge amount for a credit card payment is 2.5% of the base payment amount.  

Finally, create a non-abstract class named `DebitCardPayment` which inherits from the `BasePayment` class.  This class should have the same constructor(s) as it’s parent class.  The surcharge amount for a debit card payment is 1.5% of the base payment amount.  

Test everything from within a driver class containing a main method.
