package com.learning.core.day2session1;

import java.util.*;

public class D02P03E {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any value to find the factorial value: ");
		
		int num = sc.nextInt();
        long factorial = 1;
        for(int i = 1; i <= num; ++i) {
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
        sc.close();
	}

}
