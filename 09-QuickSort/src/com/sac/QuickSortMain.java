package com.sac;

public class QuickSortMain {

	public static void main(String[] args) {
		
		int[] arrayElements = {24,2,45,20,56,75,2,56,99,53,12};
		
		QuickSort quickSort = new QuickSort();
		quickSort.sortElementsUsingQUickSort(arrayElements);
		
		arrayElements = quickSort.getArrayElements();
		
		for (int i : arrayElements) {
			System.out.println(i);
		}
	}

}
