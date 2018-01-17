package com.crmindz.bcjMay2017.practiceTest1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonSlot {
	
	private static List<int[]> arrayList = new ArrayList<int[]>();
	
	public static void main(String[] args) {
		
		mapToArray(7, 10);
		mapToArray(3, 5);
		mapToArray(4, 10);
		
		int[] tempArray = new int[12];
		
		for(int[] array : arrayList){
			for(int i=0;i<12;i++){
				tempArray[i] += array[i];
			}
		}
		
		int max = tempArray[0];
		for (int i = 0; i < tempArray.length; i++) {
		    if (tempArray[i]> max) {
		      max = tempArray[i];
		    }
		}
		
		if(max>1){
			System.out.println("The available time slots are:"+ Arrays.toString(tempArray));
			for(int i = 0; i < tempArray.length; i++){
				if(tempArray[i] == max){
					System.out.print(i+"pm to "+(i+1)+"pm  ");
				}
			}
		}else{
			System.out.println("There are no common time slots available");
		}
		
	}
	
	public static void mapToArray(int startTime, int endTime){
		
		int[] timeIntervalArray = new int[12];
		
		for(int i=0;i<12;i++){
			timeIntervalArray[i] = 0;
			if(i>=startTime && i<endTime){
				timeIntervalArray[i] = 1;
			}
		}
		
		arrayList.add(timeIntervalArray);
	}
}