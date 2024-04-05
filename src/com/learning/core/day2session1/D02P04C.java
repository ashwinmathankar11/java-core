package com.learning.core.day2session1;

import java.util.*;

public class D02P04C {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int firstRepeatingIndex = findFirstRepeatingIndex(arr);

        if (firstRepeatingIndex != -1) {
            System.out.println("Index of the first repeating element: " + firstRepeatingIndex);
        } else {
            System.out.println("No repeating elements found.");
        }
        sc.close();
    }

    public static int findFirstRepeatingIndex(int[] arr) {
        int minIndex = Integer.MAX_VALUE;

        int[] lastIndex = new int[100000];
        
        for (int i = 0; i < lastIndex.length; i++) {
            lastIndex[i] = -1;
        }

        for (int i = arr.length - 1; i >= 0; i--) {

            if (lastIndex[arr[i]] != -1) {
                minIndex = Math.min(minIndex, lastIndex[arr[i]]);
            }
            lastIndex[arr[i]] = i;
        }
        return (minIndex == Integer.MAX_VALUE) ? -1 : minIndex;
    }

}
