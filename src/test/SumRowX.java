package test;

import java.util.Scanner;

public class SumRowX {
	static int calcSumRow(int x, int[][] arr) {
		// var sumResult = 0
		// loop i from 0 to i>arr.length
		// sumResult = arr[i][x] + arr[i][x+1]
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
		System.out.println("Enter which row you want to print out: ");
		int x = scanner.nextInt();
		scanner.close();
		int result = calcSumRow(x, arr);
		System.out.println(result);
	}
}
