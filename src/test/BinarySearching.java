package test;

import java.util.Scanner;

public class BinarySearching {
	static boolean isBinarySearch(int[] arr, int x) {
		int min = 0;
		int high = arr.length;
		boolean flag = false;
		int answer = 0;
		int mid;
		while(flag && (min < high)) {
			mid = ((min + high) /2);
			if(arr[mid] == x) {
				flag = true;
				answer = mid;
			} else if(x > arr[mid]) {
				min = mid + 1;
			} else {
				high = mid -1;
			}
		}
		if(flag = true) {
			System.out.println(x + " found at array index " + answer);
			return flag;
		} else {
			System.out.println(x + " was not found");
			return flag;
		}
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





		






