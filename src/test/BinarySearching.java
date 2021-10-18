package test;

import java.util.Scanner;

public class BinarySearching {
	static boolean isBinarySearch(int[] arr, int x) {
		int left = 0;
		int right = arr.length-1;
		while(left <= right) {
			int mid = ((left+ right) /2);
			if(arr[mid] == x) {
				return true;
			} else if(x < arr[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return false;
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
		boolean result = isBinarySearch(arr, x);
		System.out.println(result);
	}
}





		






