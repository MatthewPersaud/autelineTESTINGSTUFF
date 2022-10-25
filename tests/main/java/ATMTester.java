package main.java;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class ATMTester {

    @Test
    public void run() {
        //We need to figure out how to test user input and console output...

        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("12345".getBytes());
        ByteArrayInputStream in2 = new ByteArrayInputStream("54321".getBytes());

        System.setIn(in);
        //System.setIn(in2);

        ATM atm = new ATM();
        atm.run();

        assertEquals(1, 1);
    }
}