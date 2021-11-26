package test;

public class TwoSum {

	public static void main(String[] args) {
		int[] arr = new int[] {4, 3, 1, 5, 7};
		int target = 12;
		int n = arr.length;
		
		for(int i = 0;i<n-1;i++) {
			for(int j = i+1;j<n;j++) {
				if((arr[i] + arr[j]) == target) {
					System.out.print(i + "," + j);
					return;
				}
			}
		}

	}

}
