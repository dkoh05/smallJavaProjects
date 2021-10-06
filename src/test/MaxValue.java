package test;
import java.util.Scanner;
public class MaxValue {
	static int findMaxValue(int[][] arr) {
		int max_value = arr[0][0];
		for(int i = 0;i<arr.length;i++) {
			for(int j= 0;j<arr[i].length;j++) {
				if(max_value>arr[i][j]) {
					max_value = arr[i][j];
				}
			}
		}
		return max_value;
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
		int result = findMaxValue(arr);
		System.out.println(result);
	}
}