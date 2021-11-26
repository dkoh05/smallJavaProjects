package test;

import java.util.Arrays;
import java.util.Scanner;

public class bubbleSort {
	static int[] bubble(int[] arr) {
		boolean flag = false;
		int decrement = arr.length - 1;
		while(!flag) {
			flag = true;
			for(int i = 0;i<decrement;i++) {
				if(arr[i] < arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					flag = false;
				}
			}
			decrement--;
		}
		return arr;
		
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
		scanner.close();
		int[] result = bubble(arr);
		System.out.println(Arrays.toString(result));
		
	}
}


		



