package test;

import java.util.Arrays;
import java.util.Scanner;

// Xenia the beginner mathematician is a third year student at elementary school. She is now learning the addition operation.
// The teacher has written down the sum of multiple numbers. Pupils should calculate the sum. 
// To make the calculation easier, the sum only contains numbers 1, 2 and 3. 
// Still, that isn't enough for Xenia. She is only beginning to count, so she can calculate a sum only if the summands follow in non-decreasing order.
// For example, she can't calculate sum 1+3+2+1 but she can calculate sums 1+1+2 and 3+3.
// You've got the sum that was written on the board. 
// Rearrange the summans and print the sum in such a way that Xenia can calculate the sum.

public class SortAndSum {
	static int[] selectionSort(int[] arr, int n) {
		int minIndex = 0;
		for(int i = 0;i<n-1;i++) {
			minIndex = i;
			for(int j = i+1;j<n;j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}
	
	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your array: ");
		String s = scanner.next();
		scanner.close();
		String[] strings = s.split("\\+");
		int n = strings.length;
		int[] arr = new int[n];
		for(int i = 0;i<n;i++) {
			int num = Integer.parseInt(strings[i]);
			arr[i] = num;
		}
		int[] result = selectionSort(arr,n);
		System.out.println(Arrays.toString(result));
		System.out.print(result[0]);
		for(int i = 1;i<n;i++) {
			System.out.print("+" + result[i]);
		}
		
	}
}
