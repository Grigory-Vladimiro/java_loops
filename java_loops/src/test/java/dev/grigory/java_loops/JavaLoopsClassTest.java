package dev.grigory.java_loops;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.*;

class JavaLoopsClassTest {

    @Test
    void testMultiplicationTableForPositiveNumber() {
        JavaLoopsClass loops = new JavaLoopsClass();
        int[] expected = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        assertArrayEquals(expected, loops.generateMultiplicationTable(5));
    }

    @Test
    void testMultiplicationTableForZero() {
        JavaLoopsClass loops = new JavaLoopsClass();
        int[] expected = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        assertArrayEquals(expected, loops.generateMultiplicationTable(0));
    }

    @Test
    void testMultiplicationTableForNegativeNumber() {
        JavaLoopsClass loops = new JavaLoopsClass();
        int[] expected = {-3, -6, -9, -12, -15, -18, -21, -24, -27, -30};
        assertArrayEquals(expected, loops.generateMultiplicationTable(-3));
    }

    @Test
    void testMultiplicationTableForLargeNumber() {
        JavaLoopsClass loops = new JavaLoopsClass();
        int[] expected = {1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000, 10000};
        assertArrayEquals(expected, loops.generateMultiplicationTable(1000));
    }

    @Test
    void testMainMethodWithValidInput() {
        
        String input = "5\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        
        JavaLoopsClass.main(new String[]{});

        
        String expectedOutput = "Enter a number for the multiplication table: 5 * 1 = 5\n" +
                "5 * 2 = 10\n" +
                "5 * 3 = 15\n" +
                "5 * 4 = 20\n" +
                "5 * 5 = 25\n" +
                "5 * 6 = 30\n" +
                "5 * 7 = 35\n" +
                "5 * 8 = 40\n" +
                "5 * 9 = 45\n" +
                "5 * 10 = 50\n";

        assertEquals(expectedOutput, out.toString().replace("\r", ""));
    }

    @Test
    void testMainMethodWithZeroInput() {
        String input = "0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        JavaLoopsClass.main(new String[]{});

        String expectedOutput = "Enter a number for the multiplication table: 0 * 1 = 0\n" +
                "0 * 2 = 0\n" +
                "0 * 3 = 0\n" +
                "0 * 4 = 0\n" +
                "0 * 5 = 0\n" +
                "0 * 6 = 0\n" +
                "0 * 7 = 0\n" +
                "0 * 8 = 0\n" +
                "0 * 9 = 0\n" +
                "0 * 10 = 0\n";

        assertEquals(expectedOutput, out.toString().replace("\r", ""));
    }
}
