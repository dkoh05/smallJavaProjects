package test;

import java.util.Scanner;

public class StudentScore {
	static int countEight(int num) {
		int count = 0;
		while(num>0) {
			int lastDigit = num % 10;
			if(lastDigit == 8) {
				count++;
			} 
			num = num/10;
		}
		return count;
	}

	public static void main(String[] args) {
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
		
		for(int i = 0;i<rows;i++) {
			System.out.println((i+1) + " Student");
			for(int j = 0;j<columns;j++) {
				int result = countEight(arr[i][j]);
				System.out.println("---- The grade of exam " + (i+1) + " has " + result + " eight(s)");
			}
		}
	}

}
