package test;

import java.util.*;

public class SumUsingRecursion {
	static int[] restOfArr(int[] arr) {
		int[] newArr = new int[arr.length-1];
		for(int i = 1;i<arr.length;i++) {
			newArr[i-1] = arr[i];
		}
		return newArr;
	}
	static int sum(int[] arr) {
		if(arr.length == 0) {
			return 0;
		}
		return arr[0] + sum(restOfArr(arr));
	}

	public static void main(String[] args) {
		System.out.print("Enter array size: ");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		System.out.println("Enter your array: ");
		int[] arr = new int[size];
		for (int j = 0; j < size; j++) {
			arr[j] = scanner.nextInt();
		}
		scanner.close();
		int result = sum(arr);
		System.out.println(result);
	}

}
