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
		int rArr = sum(restOfArr(arr));
		int total = 0;
		if(arr.length == 0) {
			return total;
		}
		total = arr[0] + rArr;
		return total;
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
		System.out.println(Arrays.toString(arr));
		int result = sum(arr);
		System.out.println(result);
	}

}
