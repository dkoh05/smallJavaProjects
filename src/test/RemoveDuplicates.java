package test;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
	static ArrayList<Integer> removeDupe(int[] arr) {
		int n = arr.length;
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for(int i = 0;i<n-1;i++) {
			if(arr[i] != arr[i+1]) {
				temp.add(arr[i]);
			}
		}
		if(n >=1) {
			temp.add(arr[n-1]);
		}
		return temp;
	}
	public static void main(String[] arg) {
		int[] arr = new int[] {1,1,1,1,1,2,2,2,2,7,9,9,10};
		ArrayList<Integer> result = removeDupe(arr);
		System.out.println(result);
		
	}
}
