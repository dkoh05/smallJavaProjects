package test;

import java.util.Iterator;
import java.util.Collections;
import java.util.*;

public class ArrayList2 {
	public static void main(String[] arg) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Mango");
		list.add("Jackfruit");
		list.add("Watermelon");
		list.add("Banana");
//		Iterator<String> itr = list.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		// insert an element into the array list at the first position
//		list.add(0, "Dates");
//		itr = list.iterator();
//		System.out.println("New Array List: ");
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		// Retrieve an element (at a specified index) from a given array list
//		String result = list.get(3);
//		itr = list.iterator();
//		System.out.println("Retrieved element: ");
//		System.out.println(result);
//		//Update a specific array element by given element.
//		String input = "Mango";
//		String input2 = "Apple";
//		for(int i = 0;i<list.size();i++) {
//			if(list.get(i) == "Mango") {
//				list.set(i,input2);
//			}
//		}
//		System.out.println("Specified array: ");
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		System.out.println("Index of " + input2 + ": " + list.indexOf(input2));
		//Remove the third element from an array list.		
//		list.remove(2);
//		for(int i = 0;i< list.size();i++) {
//			System.out.println(list.get(i));
//		}
		// sort a given array list
		Collections.sort(list);
		for(int i= 0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		// Shuffle elements in an array list.
		Collections.shuffle(list);
		System.out.println("Shuffled List: ");
		for(int i= 0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		// Reverse elements in an array list
		Collections.reverse(list);
		System.out.println("Reversed Array List");
		for(int i= 0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
	}
}
