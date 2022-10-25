package main.java;

import org.junit.Test;

import static org.junit.Assert.*;

public class DepositSlotTest {

    @Test
    public void isEnvelopeReceived() {
        DepositSlot deposit = new DepositSlot();
        
        assertTrue(deposit.isEnvelopeReceived());
    }
}