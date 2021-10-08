package test;

import java.util.Arrays;
import java.util.Scanner;

//Write a method
//that calculates the row sum for every row and returns each of the values in an array. 
//Index i of the return array contains the sum of elements in row i.

public class NewSumRowArray {
	static int[] calcSumRow(int[][] arr) {
		int sum = 0;
		int newArr[] = new int[arr.length];
		for (int i=0; i < arr.length; i++) {
		    for (int j=0; j < arr[i].length; j++) {
		        sum = arr[i][j]; // storing each element of the 2D array
		        newArr[i] = newArr[i] + sum; 
		    }
		}
		return newArr;
	}
	public static void main(String[] arg) {
		System.out.print("Enter 2D array size: ");
		Scanner scanner = new Scanner(System.in);
		int rows = scanner.nextInt();
		int columns = scanner.nextInt();
		System.out.println("Enter each individual array's size: ");
		int arr[][] = new int[rows][columns];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		scanner.close();
		int[] result = calcSumRow(arr);
		System.out.println(Arrays.toString(result));
	}
}
