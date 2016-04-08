package com.sac;

public class MergeSort {
	
	private int[] arrayElements;
	
	public void sortArray(int[] arrayElements){
		this.arrayElements = arrayElements;
		doMergeSort(0, arrayElements.length-1);
	}
	
	public void doMergeSort(int lowerIndex, int higherIndex){
		
		if(lowerIndex < higherIndex){
			int mid = (lowerIndex + higherIndex)/2;
			doMergeSort(lowerIndex, mid);
			doMergeSort(mid+1, higherIndex);
			mergeSort(lowerIndex, mid, higherIndex);
		}
	}
	
	
	private void mergeSort(int lowerIndex, int mid, int higherIndex){
		
		int[] tempArray = new int[arrayElements.length];
		
		for (int i = lowerIndex; i <= higherIndex; i++) {
			tempArray[i] = arrayElements[i];
		}
		
		int i = lowerIndex;
		int j = mid+1;
		int k = lowerIndex;
		
		while(i <= mid && j <= higherIndex){
			
			if(tempArray[i] <= tempArray[j]){
				arrayElements[k] = arrayElements[i];
				i++;
			}else{
				arrayElements[k] = arrayElements[j];
				j++;
			}
			
			k++;
		}
		while( i<= mid){
		
			arrayElements[k] = tempArray[i];
			k++;
			i++;
		}
		
	}

	public int[] getArrayElements() {
		return arrayElements;
	}

	public void setArrayElements(int[] arrayElements) {
		this.arrayElements = arrayElements;
	}
	
	

}
