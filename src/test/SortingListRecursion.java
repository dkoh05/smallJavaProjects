package test;

import java.util.Arrays;
import java.util.Scanner;

public class SortingListRecursion {
	  static int[] sort(int[] arr){
		    int n = arr.length;
		    int fhn = n/2; // the no. of elements in the first half
		    int shn = n - fhn; // no. of elements in the second half
		    int[] firstHalf = new int[fhn]; 
		    int[] secondHalf = new int[shn];
		    if(n <2){
		      return arr;
		    }
		    
		    for(int i = 0;i<fhn;i++){ // move first half of arr to firstHalf
		      firstHalf[i] = arr[i];
		    }
		    for(int i = 0;i<shn;i++){ // move the rest to secondHalf
		      secondHalf[i] = arr[i+fhn]; 
		    }
		    firstHalf = sort(firstHalf);
		    secondHalf = sort(secondHalf);
		    
		    return merge(arr, firstHalf, secondHalf, fhn, shn);
		  }
		  static int[] merge(int[] arr, int[] firstHalf, int[] secondHalf, int fhn, int shn){
		    int i = 0;
		    int j = 0;
		    int k = 0;
		    while(i < fhn && j < shn){ // while there are still elements in firstHalf and secondHalf
		      if(firstHalf[i] <= secondHalf[j]){
		        arr[k] = firstHalf[i];
		        i++; // move to next value of firstHalf
		      } else{
		        arr[k] = secondHalf[j];
		        j++; // move to next value of secondHalf
		      }
		      k++; // increment to the next element of arr
		    }
		    // move leftover elements of both halves to arr
		    while(i< fhn){
		      arr[k] = firstHalf[i];
		      i++;
		      k++;
		    }
		    while(j< shn){
		      arr[k] = secondHalf[j];
		      j++;
		      k++;
		    }
		    return arr;
		  }
		  
		  public static void main(String[] args) {
		    System.out.print("Enter array size: ");
		    Scanner scanner = new Scanner(System.in);
		    int size = scanner.nextInt();
		    System.out.println("Enter your array: ");
		    int arr[] = new int[size];
		    for (int j = 0; j < size; j++) {
		      arr[j] = scanner.nextInt();
		    }
		    scanner.close();
		    int[] sort = sort(arr);
		    System.out.println(Arrays.toString(sort));
		  }
}
