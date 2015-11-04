package edu.ilstu.it275.lab10.msanto2;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CreditCardPaymentTest {
    CreditCardPayment creditCard;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
        creditCard = null;
    }

    @Test
    public void testCreateCreditCardPayment() {
        double baseAmount = 100;

        creditCard = new CreditCardPayment(baseAmount);

        double creditSurcharge = creditCard.CREDIT_CARD_SURCHARGE;

        assertEquals(baseAmount + (baseAmount * creditSurcharge), creditCard.getBaseAmount(), 0);

        assertEquals(baseAmount * creditSurcharge, creditCard.calculatePaymentSurcharge(baseAmount), 0);
    }
}
