package dev.grigory.java_loops;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class JavaLoopsClassTest {
@Test
    void testMultiplicationTableLength() {
        JavaLoopsClass loops = new JavaLoopsClass();
        int[] table = loops.generateMultiplicationTable(7);
        assertEquals(10, table.length, "The table should contain 10 lines.");
}
@Test
void testMultiplicationTableFullCheck() {
    JavaLoopsClass loops = new JavaLoopsClass();
    
    for (int num = 1; num <= 10; num++) {
        int[] expected = new int[10];

        for (int i = 0; i < 10; i++) {
            expected[i] = num * (i + 1);
        }

        assertArrayEquals(expected, loops.generateMultiplicationTable(num));
    }
}
@Test
void testMainMethod() {
    String input = "7\n";
    System.setIn(new ByteArrayInputStream(input.getBytes()));

    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));

    JavaLoopsClass.main(new String[]{});

    String output = outContent.toString();

    assertTrue(output.contains(input.trim() + " * 1 = " + (Integer.parseInt(input.trim()) * 1)));
}
}