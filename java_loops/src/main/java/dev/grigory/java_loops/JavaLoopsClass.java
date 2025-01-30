package dev.grigory.java_loops;

import java.util.Scanner;

public class JavaLoopsClass {
public static void main(String [] arguments) {
    int number;
    System.out.print("Enter number for multiplication table:");
    Scanner sc = new Scanner(System.in);
    number = sc.nextInt();

    for(int i=1;i<=10;i++) {
    System.out.println(number + " * " + i + " = " + (number*i));
}
    sc.close();
}
}

