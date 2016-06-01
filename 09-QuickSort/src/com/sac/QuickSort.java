package com.sac;

public class QuickSort {
	
	private int[] arrayElements;
	private int i = 0;
	private int j = 0;
	private int mid = 0;
	private int  temp = 0;
	
	public void sortElementsUsingQUickSort(int[] arrayElements){
		
		if(arrayElements.length == 0 || arrayElements == null){
			return;
		}
		
		this.arrayElements = arrayElements;
		
		int lowerIndex = 0;
		int higherIndex = arrayElements.length-1;
		
		//This method is used for ordering the elements in ascending order
		//quickSortAscending(lowerIndex, higherIndex);
		
		//This method is used for ordering the elements in descending order
		quickSortDescending(lowerIndex, higherIndex);
		
	}


	/**
	 * Sorts the array elements in descending order
	 * @param lowerIndex
	 * @param higherIndex
	 */
	private void quickSortAscending(int lowerIndex, int higherIndex){
		
		 i = lowerIndex;
		 j = higherIndex;
		
		 mid = (higherIndex+lowerIndex)/2;
		
		while(i <= j){
			
			while (arrayElements[i] < arrayElements[mid]){
				i++;
			}
			
			while (arrayElements[j] > arrayElements[mid]) {
				j--;
			}
			
			if(i <= j){
				
				//Swap Numbers
				 temp = arrayElements[i];
				arrayElements[i] = arrayElements[j];
				arrayElements[j] = temp;
				
				i++;
				j--;
			}
		}
		
		if(j > lowerIndex)
			quickSortAscending(lowerIndex, j);
		if(i < higherIndex)
			quickSortAscending(i, higherIndex);
		
	}
	
	/**
	 * Sorts the elements in ascending order
	 * @param lowerIndex
	 * @param higherIndex
	 */
private void quickSortDescending(int lowerIndex, int higherIndex){
		
		 i = lowerIndex;
		 j = higherIndex;
		
		 mid = (higherIndex+lowerIndex)/2;
		
		while(i <= j){
			
			while (arrayElements[i] > arrayElements[mid]){
				i++;
			}
			
			while (arrayElements[j] < arrayElements[mid]) {
				j--;
			}
			
			if(j >= i){
				
				//Swap Numbers
				temp = arrayElements[i];
				arrayElements[i] = arrayElements[j];
				arrayElements[j] = temp;
				
				i++;
				j--;
			}
		}
		
		//Recursion
		if(j > lowerIndex)
			quickSortDescending(lowerIndex, j);
		if(i < higherIndex)
			quickSortDescending(i, higherIndex);
		
	}
	
	public int[] getArrayElements() {
		return arrayElements;
	}
}
