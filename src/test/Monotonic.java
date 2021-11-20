package test;
import java.util.*;

public class Monotonic {
	static boolean isMonotonic(int[] arr) {
		boolean increase = true;
		boolean decrease = true;
		for(int i = 0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				increase = false;
			}
			if(arr[i] < arr[i+1]) {
				decrease = false;
			}
		}
		return increase || decrease;
	}

	public static void main(String[] args) {
		System.out.print("Enter array size: ");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		System.out.println("Enter your array: ");
		int arr[] = new int[size];
		for (int j = 0; j < size; j++) {
			arr[j] = scanner.nextInt();
		}
		scanner.close();
		boolean result = isMonotonic(arr);
		System.out.println(result);

	}

}
