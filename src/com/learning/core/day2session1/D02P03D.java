package com.learning.core.day2session1;

public class D02P03D {

	public static void main(String[] args) {
		
		int n = 5;
		//Outer Loop
		for(int i=1; i<=n; i++) {
			//Inner Loop
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
