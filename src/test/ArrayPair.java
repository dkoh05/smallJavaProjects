package test;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPair {
	static int[] bubble(int[] arr) {
		boolean flag = false;
		int n = arr.length -1;
		while(!flag) {
			flag = true;
			for(int i = 0;i<n;i++) {
				if(arr[i] > arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					flag = false;
				}
			}
		}
		return arr;
	}
	static int calc(int[] arr) {
		int[] sortArr = bubble(arr);
		System.out.println(Arrays.toString(sortArr));
		int sum = 0;
		for(int i = 0;i<sortArr.length -1;i = i+2) {
			sum = sum + sortArr[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		while(true) {
			System.out.print("Enter array size: ");
			Scanner scanner = new Scanner(System.in);
			int size = scanner.nextInt();
			if(size%2 == 1) {
				System.out.println("Enter an even numbered size");
				continue;
			}
			System.out.println("Enter your array: ");
			int arr[] = new int[size];
			for (int j = 0; j < size; j++) {
				arr[j] = scanner.nextInt();
			}
			scanner.close();
			int result = calc(arr);
			System.out.println(result);
			break;
		}

	}

}
