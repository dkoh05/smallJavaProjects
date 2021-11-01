package test;

import java.util.Arrays;

public class RecursionFindMax {
	static int[] restOfArr(int[] arr) {
		int[] newArr = new int[arr.length-1];
		for(int i = 1;i<arr.length;i++) {
			newArr[i-1] = arr[i];
		}
		return newArr;
	}
	static int findMax(int[] arr) {
		if(arr.length == 0) {
			return Integer.MIN_VALUE;
		}
		int possible_max_1 = arr[0];
		int possible_max_2 = findMax(restOfArr(arr));
		for(int i = 0;i<arr.length;i++) {
			if(possible_max_1 > possible_max_2) {
				return possible_max_1;
			} 
		}
		return possible_max_2;
	}
	
	public static void main(String[] args) {
		// output of findMax = max int of the array list
		int result = findMax(new int[]{1, 2, 3,4,7,8,2,1});
		System.out.println(result);

	}

}
