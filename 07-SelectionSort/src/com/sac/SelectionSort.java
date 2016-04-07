package com.sac;

public class SelectionSort {
	
	public int[] performSelectionSort(int[] arrayElements){
		
		for(int i = 0; i < arrayElements.length-1; i++){
			
			for(int j = i+1; j < arrayElements.length; j++){
				
				if(arrayElements[i] > arrayElements[j]){
					
					arrayElements[i] = arrayElements[i] + arrayElements[j];
					arrayElements[j] = arrayElements[i]-arrayElements[j];
					arrayElements[i] = arrayElements[i] - arrayElements[j];
				}
			}
		}
		
		return arrayElements;
	}

}
