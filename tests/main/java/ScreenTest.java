package main.java;

import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class ScreenTest {

    @Test
    public void getMessage() {
        Screen screen = new Screen();

        assertEquals("Welcome", screen.getMessage("Welcome"));
    }

    @Test
    public void getDollarAmount() {
        Screen screen = new Screen();

        assertEquals("$1,000.00", screen.getDollarAmount(1000));
    }
}