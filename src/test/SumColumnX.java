package test;

import java.util.Scanner;
// Write a method
// that returns the sum of the elements in Column x of 2d array

public class SumColumnX {
	static int calcSumColumn(int x, int[][] arr) {
        int sumResult = 0;
        for(int i=0;i<arr.length;i++){
            sumResult = sumResult + arr[i][x];
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
		System.out.println("Enter which column you want to print out: ");
		int x = scanner.nextInt();
		scanner.close();
		int result = calcSumColumn(x, arr);
		System.out.println(result);
	}
}
