package com.sac;

public class QuickSortMain {

	public static void main(String[] args) {
		
		
		int[] arrayElements = {6,4,0,5,0,1,0,0,1,0};
		
		QuickSort quickSort = new QuickSort();
		quickSort.sortElementsUsingQUickSort(arrayElements);
		
		arrayElements = quickSort.getArrayElements();
		//System.out.println(arrayElements.length);
		
		for (int i : arrayElements) {
			System.out.println(i);
		}
	}

}
