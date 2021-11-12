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


input x = 4

function calcFib(4)
base case // false
return 2 + 1 = 3

calcFib(3)
base case // false
return 1 + 1 = 2


calcFib(2)
base case // true
return 1

calcFib(1)
base case // true
return 1

calcFib(2)
base case // true
return 1