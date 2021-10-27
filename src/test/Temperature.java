package test;

// enter four cities, and then for each city, enter the highest and lowest temperature of the day
// the program then calculates the upper and lower bounds of temperatures
// it will then print out any city's temperatures that are above the upper temperature or lower than the lower temperature

import java.util.Iterator;
import java.util.Collections;
import java.util.*;

public class Temperature {
	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> cities = new ArrayList<String>();
		ArrayList<Integer> highestTemp = new ArrayList<Integer>();
		ArrayList<Integer> lowestTemp = new ArrayList<Integer>();
		
		int highestTotal = 0;
		int lowestTotal = 0;
		for(int i = 0;i<4;i++) {
			System.out.print("Enter a city: ");
			cities.add(scanner.nextLine());
			System.out.print("Enter the highest temperature of that city for today: ");
			highestTemp.add(scanner.nextInt());
			System.out.print("Enter the lowest temperature of that city for today: ");
			lowestTemp.add(scanner.nextInt());
			highestTotal = highestTotal + highestTemp.get(i);
			lowestTotal = lowestTotal + lowestTemp.get(i);
		}
		scanner.close();
		int highestAvg = highestTotal/4;
		int lowestAvg = lowestTotal/4;
		
		for(int i= 0;i<4;i++) {
			if(highestTemp.get(i)>highestAvg) {
				System.out.print("Cities with above highest average temp. :");
				System.out.println(cities.get(i));
			}
			if(lowestTemp.get(i)<lowestAvg) {
				System.out.print("Cities with below lowest average temp. :");
				System.out.println(cities.get(i));
			}
		}

	}
}
