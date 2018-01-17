package algorithms.bubbleSort;

import java.util.Arrays;

public class BubbleSort {
	
	static void bubbleSort(int[] lst) {
		int n = lst.length;
		boolean swapped = true;
		while (swapped == true)
		{
			swapped = false;
			for (int i = 0; i < n-1; i++) {
				if (lst[i] > lst[i+1]) {
					int temp = lst[i];
					lst[i] = lst[i+1];
					lst[i+1] = temp;
					swapped = true;
				}
			}
		} 
		
		System.out.println(Arrays.toString(lst));
	}
	
	public static void main(String[] args) {
		
		int[] lst ={10,9,1,3,4,5,10};
		BubbleSort.bubbleSort( lst);
		
	}

}
