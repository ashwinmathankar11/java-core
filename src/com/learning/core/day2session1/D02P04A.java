package com.learning.core.day2session1;

import java.util.*;

public class D02P04A {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = {7,25,5,19,30};

        System.out.print("Enter the first number (1-40): ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number (1-40): ");
        int number2 = scanner.nextInt();

        boolean found1 = false;
        boolean found2 = false;

        for (int num : numbers) {
            if (num == number1) {
                found1 = true;
            }
            if (num == number2) {
                found2 = true;
            }
        }

        if (found1 && found2) {
            System.out.println("Bingo");
        } else {
            System.out.println("Numbers not found in the array.");
        }
        scanner.close();
    }
}
