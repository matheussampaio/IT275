package edu.ilstu.it275.lab10.msanto2;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DebitCardPaymentTest {
    DebitCardPayment debitCard;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
        debitCard = null;
    }

    @Test
    public void testDebitCreditCardPayment() {
        double baseAmount = 100;

        debitCard = new DebitCardPayment(baseAmount);

        double debitSurcharge = debitCard.DEBIT_CARD_SURCHARGE;

        assertEquals(baseAmount + (debitSurcharge * baseAmount), debitCard.getBaseAmount(), 0);

        assertEquals(baseAmount * debitSurcharge, debitCard.calculatePaymentSurcharge(baseAmount), 0);
    }

}
