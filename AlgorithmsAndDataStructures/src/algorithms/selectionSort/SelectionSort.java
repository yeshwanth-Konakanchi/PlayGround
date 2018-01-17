package algorithms.selectionSort;

import java.util.Arrays;

public class SelectionSort {
	
	public int[] sortUsingSelectSort(int[] arr){
		
		int index = 0;
		for(int i=0; i<arr.length; i++){
			
			
			int smallest = arr[i];		
			for(int j=i; j<arr.length; j++){
				 
				 if(arr[j]<=smallest){
					 
					 smallest = arr[j];
					 index=j;
				 }
				 
			}
			
			int temp = arr[i];
			arr[i]= smallest;
			arr[index] = temp;
			
		}
		
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {9,6,2,4,3,13,11,11,13};
		
		SelectionSort s = new SelectionSort();
		
		arr = s.sortUsingSelectSort(arr);
		
		System.out.println(Arrays.toString(arr));

	}

}
