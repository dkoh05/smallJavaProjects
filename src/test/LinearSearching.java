package test;

import java.util.Scanner;

public class LinearSearching {
	static boolean sequentialSearch(int[] arr, int x) {
		boolean flag = false;
		for(int i = 0;i<arr.length;i++) {
			if (arr[i] == x) {
				flag = true;
				System.out.println(arr[i] + " found at position " + i);
			}
		}
		System.out.println(x + " not found");
		return flag;
	}
	public static void main(String[] arg) {
		System.out.print("Enter array size: ");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		System.out.println("Enter your array: ");
		int arr[] = new int[size];
		for (int j = 0; j < size; j++) {
			arr[j] = scanner.nextInt();
		}
		System.out.println("Enter the number you are looking for: ");
		int x = scanner.nextInt();
		scanner.close();
		boolean result = sequentialSearch(arr, x);
		System.out.println(result);
	}
}
