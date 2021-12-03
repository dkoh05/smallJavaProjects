package test;

public class TargetIndex {
	static int findIndex(int[] arr, int target) {
		int n = arr.length;
		for(int i = 0;i<n;i++) {
			if(arr[i] == target) {
				return i;
			} 
			if(arr[i] > target) {
				return i;
			}
		}
		return n;
	}

	public static void main(String[] args) {
		int[] arr = new int[] {};
		int target = 0;
		int result = findIndex(arr, target);
		System.out.println(result);

	}

}
