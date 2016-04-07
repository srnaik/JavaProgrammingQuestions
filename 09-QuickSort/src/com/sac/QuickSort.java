package com.sac;

public class QuickSort {
	
	private int[] arrayElements;
	
	public void sortElementsUsingQUickSort(int[] arrayElements){
		
		if(arrayElements.length == 0 || arrayElements == null){
			return;
		}
		
		this.arrayElements = arrayElements;
		
		int lowerIndex = 0;
		int higherIndex = arrayElements.length-1;
		quickSort(lowerIndex, higherIndex);
	}


	private void quickSort(int lowerIndex, int higherIndex){
		
		int i = lowerIndex;
		int j = higherIndex;
		
		int mid = (higherIndex+lowerIndex)/2;
		
		while(i <= j){
			
			while (arrayElements[i] < arrayElements[mid]){
				i++;
			}
			
			while (arrayElements[j] > arrayElements[mid]) {
				j--;
			}
			
			if(i <= j){
				
				//Swap Numbers
				int temp = arrayElements[i];
				arrayElements[i] = arrayElements[j];
				arrayElements[j] = temp;
				
				i++;
				j--;
			}
		}
		
		if(j > lowerIndex)
			quickSort(lowerIndex, j);
		if(i < higherIndex)
			quickSort(i, higherIndex);
		
	}
	
	public int[] getArrayElements() {
		return arrayElements;
	}
}
