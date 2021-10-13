package test;

import java.util.Scanner;

public class DiagonalSquare {
	static int diagonalSum(int[][] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i][i];
		}
		return sum;
	}

	static int diagonalSum2(int[][] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i][arr.length-i-1];
		}
		return sum;
	}

	public static void main(String[] arg) {
		System.out.print("Enter 2D array size: ");
		Scanner scanner = new Scanner(System.in);
		int rows = scanner.nextInt();
		System.out.println("Enter each individual array's size: ");
		int arr[][] = new int[rows][rows];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		scanner.close();
		int result = diagonalSum2(arr);
		System.out.println(result);
	}
}
