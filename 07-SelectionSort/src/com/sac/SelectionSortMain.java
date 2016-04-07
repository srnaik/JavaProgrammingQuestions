package com.sac;

public class SelectionSortMain {

	public static void main(String[] args) {
		
		int[] arrayElements = {12,8,6,4,2,-1,18,14,-4,-2};
		
		SelectionSort selectionSort = new SelectionSort();
		arrayElements = selectionSort.performSelectionSort(arrayElements);
		
		for (int i : arrayElements) {
			System.out.println(i);
		}
	}

}
