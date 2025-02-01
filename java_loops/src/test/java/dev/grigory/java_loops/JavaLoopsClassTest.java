package dev.grigory.java_loops;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JavaLoopsClassTest {
    @Test
    void testMultiplicationTableGeneration() {
        JavaLoopsClass loops = new JavaLoopsClass();
        int number = 5;
        int [] expected = new int[10];
for (int i = 0; i < 10; i++) {
    expected[i] = number * (i + 1);
}
        assertArrayEquals(expected, loops.generateMultiplicationTable(number));
    }
}
    

        

