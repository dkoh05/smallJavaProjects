package test;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSorting {
	static int[] selectionSort(int[] arr, int n) {
		int minIndex = 0;
		for(int i = 0;i<n-1;i++) {
			minIndex = i;
			for(int j = i+1;j<n;j++) {
				if(arr[j] > arr[minIndex]) {
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
		System.out.print("Enter array size: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println("Enter your array: ");
		int arr[] = new int[n];
		for (int j = 0; j < n; j++) {
			arr[j] = scanner.nextInt();
		}
		scanner.close();
		int[] result = selectionSort(arr, n);
		System.out.println(Arrays.toString(result));
	}
}
