package main.java;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashDispenserTest {


    @Test
    public void test1IsSufficientCashAvailable() {
        CashDispenser dispenser = new CashDispenser();

        assertTrue(dispenser.isSufficientCashAvailable(400));
    }

    @Test
    public void test2IsSufficientCashAvailable() {
        CashDispenser dispenser = new CashDispenser();

        assertFalse(dispenser.isSufficientCashAvailable(20000));
    }

}