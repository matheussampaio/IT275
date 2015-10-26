# Lab 6
## Inheritance

**Grade 25.0 (max 25.0)**

## Set Up
* Create a new Java project in your Eclipse workspace named: `Lab06`
* In the src folder, create a package named: `edu.ilstu.it275.lab06.<ulid>`

Create a class called `Payment.java` which will contain an attribute of type double that stores the amount of the payment and appropriate accessor and mutator methods.  Also careate a method named paymentDetails that outputs an English sentence to describe the amount of the payment.  In addition to the default constructor, provide a constructor that receives the payment amount.  

Next, create a class called `CashPayment.java` that is derived from the `Payment` class.  Override the paymentDetails method to indicate that the payment is in cash.  Provide appropriate constructor(s).

Next, create a class called `CreditCardPayment.java` that is derived from the `Payment` class.  This class should contain the attributes for the name on the card, expiration date (as a String), and credit card number (as a String) as well as appropriate accessor and mutator methods.  Override the paymentDetails method to include the credit card information in the printout.    
