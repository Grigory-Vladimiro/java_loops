package dev.grigory.java_loops;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JavaLoopsClassTest {
    @Test
    void testMultiplicationTableGeneration() {
        JavaLoopsClass loops = new JavaLoopsClass();

        
        int number = 5;
        int[] expected = new int[10];
        for (int i = 0; i < 10; i++) {
            expected[i] = number * (i + 1);
        }
        assertArrayEquals(expected, loops.generateMultiplicationTable(number));

      
        int[] expectedZero = new int[10];
        assertArrayEquals(expectedZero, loops.generateMultiplicationTable(0));

        
        int[] expectedNegative = new int[10];
        for (int i = 0; i < 10; i++) {
            expectedNegative[i] = -3 * (i + 1);
        }
        assertArrayEquals(expectedNegative, loops.generateMultiplicationTable(-3));
    }
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
}
        

