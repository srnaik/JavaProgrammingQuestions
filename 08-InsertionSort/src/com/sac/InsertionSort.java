package com.sac;

public class InsertionSort {
	
	public int[] performInsertionSort(int[] arrayElements){
		
		for(int i = 1; i < arrayElements.length; i++){
			for (int j = i; j > 0; j--) {
				if(arrayElements[j-1] > arrayElements[j]){
					arrayElements[j-1] = arrayElements[j-1] + arrayElements[j];
					arrayElements[j] = arrayElements[j-1] - arrayElements[j];
					arrayElements[j-1] = arrayElements[j-1] - arrayElements[j];
				}
			}
		}
		
		
		return arrayElements;
	}

}
