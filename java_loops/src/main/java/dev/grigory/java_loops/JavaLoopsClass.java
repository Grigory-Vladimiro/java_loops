package dev.grigory.java_loops;

import java.util.Scanner;

public class JavaLoopsClass {

    public int[] generateMultiplicationTable(int number) {
        int[] result = new int[10];
        for (int i = 0; i < 10; i++) {
            result[i] = number * (i + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number for the multiplication table: ");
        int number = scanner.nextInt();
        scanner.close();

        JavaLoopsClass loops = new JavaLoopsClass();
        int[] table = loops.generateMultiplicationTable(number);

        
        for (int i = 0; i < table.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }
    }
}
