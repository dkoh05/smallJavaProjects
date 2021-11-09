package test;

import java.util.Scanner;

public class Fibonacci {
	static int calcFib(int x) {
		if(x <= 2) {
			return 1;
		} else {
			return calcFib(x-1) + calcFib(x-2);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scanner.nextInt();
		scanner.close();
		int result = calcFib(n);
		System.out.println(result);

	}

}
