package com.sac;

public class BubbleSort {
	
	
	public int[] sortArrayElements(int[] arrayElements){
		
		
		for(int m = arrayElements.length; m >= 0; m--){
			
			for(int i = 0; i < arrayElements.length-1;i++){
				
				if(arrayElements[i] > arrayElements[i+1]){
					
					arrayElements[i] = arrayElements[i] + arrayElements[i+1];
					arrayElements[i+1] = arrayElements[i] - arrayElements[i+1];
					arrayElements[i] = arrayElements[i] - arrayElements[i+1];
					
				}
			}
		}
		
		return arrayElements;
	}

}
