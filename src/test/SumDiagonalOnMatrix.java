package test;

import java.util.Scanner;

public class SumDiagonalOnMatrix {
	public static int calcDiagonalSum(int[][] arr) {
		int sumResult = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(i == j) {
					sumResult = sumResult + arr[i][j];
				}
			}
		}
		return sumResult;
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
		
		int result = calcDiagonalSum(arr);
		System.out.println(result);
	}
}
