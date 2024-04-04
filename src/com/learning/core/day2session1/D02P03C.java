package com.learning.core.day2session1;

import java.util.Scanner;

public class D02P03C {

	public static void main(String[] args) {
		
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the percentage marks obtained by the student: ");
	        double percentage = sc.nextDouble();

	        if (percentage >= 60) {
	        	System.out.println("Student got Grade A.");
	        } else if (percentage >= 45) {
	        	System.out.println("Student got Grade B.");
	        } else if (percentage >= 35) {
	        	System.out.println("Student got Grade C.");
	        } else {
	        	System.out.println("Student got failed in the examination.");
	        }
	        sc.close();
	}

}
