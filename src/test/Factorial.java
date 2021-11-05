package test;
import java.util.*;

public class Factorial {
	static int calcFactorial(int n) {
		if(n<=1) {
			return 1;
		}
		return calcFactorial(n-1) * n ;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scanner.nextInt();
		scanner.close();
		int result = calcFactorial(n);
		System.out.println(result);

	}

}
