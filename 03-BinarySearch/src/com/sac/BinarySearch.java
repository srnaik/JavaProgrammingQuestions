package com.sac;

public class BinarySearch {

	public int searchElement(int[] array, int element){
		
		int start = 0;
		int end = array.length -1;
		
		while(start <= end){
			int mid = (start + end)/2;
			if(element == array[mid]){
				return 1;
			}else if(element < array[mid]){
				end = mid-1;
			}else{
				start = mid+1;
			}
		}
		
		return -1;
	}
}
