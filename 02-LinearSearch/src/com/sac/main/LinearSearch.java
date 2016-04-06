package com.sac.main;

public class LinearSearch {

	
	public int searchElement(int[] array, int elementID){
		
		for(int i = 0; i < array.length; i++){
			
			if(array[i] == elementID){
				return 1;
			}
		}
		
		return -1;
		
	}
}
