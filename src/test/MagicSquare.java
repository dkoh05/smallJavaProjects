package test;

import java.util.Scanner;

//Write a method
//that checks if the 2d array is a magic square. 
//This means that it must be square, and that all row sums, all column sums, and the two diagonal-sums must all be equal.

public class MagicSquare {
	static int calcSumColumn(int x, int[][] arr) { 
        int sumResult = 0;
        for(int i=0;i<arr.length;i++){
            sumResult = sumResult + arr[i][x];
        }
		return sumResult;
	}
	
	static int calcSumRow(int x, int[][] arr) {
		int sumResult = 0;
		for(int i = 0;i<arr[x].length;i++) {
			sumResult = sumResult + arr[x][i];
		}
		return sumResult;
	}
	static int calcDiagonalSum(int[][] arr) {
		int sumResult = 0;
		for (int i = 0; i < arr.length; i++) {
			sumResult = sumResult + arr[i][i];
		}
		return sumResult;
	}
	static int calcDiagonalSum2(int[][] arr) {
		int sumResult = 0;
		for (int i = 0; i < arr.length; i++) {
			sumResult = sumResult + arr[i][arr.length-i-1];
		}
		return sumResult;
	}
	
	
	static boolean isMagicSquare(int[][] arr) {
		int sum = calcSumColumn(0,arr);
		for(int i = 0;i < arr.length;i++) { 
			int sumColumn = calcSumColumn(i, arr);
			System.out.println(sumColumn);
			if(sum != sumColumn) { 
				return false;
			}
		}
		for(int j = 0;j<arr.length;j++) {
			int sumRow = calcSumRow(j, arr);
			System.out.println(sumRow);
			if(sum != sumRow) {
				return false;
			}
		}
		int sumDiagonals = calcDiagonalSum(arr);
		System.out.println(sumDiagonals);
		if (sum != sumDiagonals) {
			return false;
		}
		int sumDiagonals2 = calcDiagonalSum2(arr);
		System.out.println(sumDiagonals2);
		if (sum != sumDiagonals2) {
			return false;
		}
		return true;
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
		boolean result = isMagicSquare(arr);
		System.out.println(result);
	}
}
