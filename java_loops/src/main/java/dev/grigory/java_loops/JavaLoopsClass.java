package dev.grigory.java_loops;

import java.util.Scanner;

public class JavaLoopsClass {

    public int[][] generateMultiplicationTable(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j =0; j < size; j++) {
                table [i][j] = (i + 1) * (j +1);
            }
        }
        return table;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number for the multiplication table: ");
        int number = scanner.nextInt();
        scanner.close();

        JavaLoopsClass loops = new JavaLoopsClass();
        int[][] table = loops.generateMultiplicationTable(number);

        
        for (int i = 0; i < table.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }
    }
}
