package com.learning.core.day2session1;

import java.util.Scanner;

public class D02P04D {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] num = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();

        System.out.println("Distinct combinations of " + k + " numbers:");
        combinations(num, k, 0, new int[k], 0);

        sc.close();
    }

    public static void combinations(int[] nums, int k, int start, int[] com, int index) {
        if (index == k) {
            for (int num : com) {
                System.out.print(num + " ");
            }
            return;
        }

        for (int i = start; i < nums.length; i++) {
            com[index] = nums[i];
            combinations(nums, k, i + 1, com, index + 1);

            while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                i++;
            }
        }
    }
}
