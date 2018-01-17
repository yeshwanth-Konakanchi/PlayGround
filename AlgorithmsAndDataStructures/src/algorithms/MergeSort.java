package algorithms;

public class MergeSort {
	
	public void mergeSort(int[] arr){
		
		int arrLen = arr.length;
		int rightArrLen = 0;
		int leftArrLen = 0;
		
		leftArrLen = arrLen/2;
		
		if (arrLen%2!=0){
			rightArrLen = (arrLen/2) + 1;
		}
		else{
			rightArrLen = arrLen/2;
		}
		
		while(arr.length>0){
			
			
		}
			
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {8,9,4,5,2,6,10,3,2};
	}

}
