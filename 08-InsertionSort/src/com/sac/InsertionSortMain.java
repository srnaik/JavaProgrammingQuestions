package com.sac;

public class InsertionSortMain {

	public static void main(String[] args) {
		
		int[] arrayElements = {20,10,8,14,12,-1,0,2};
		
		InsertionSort insertionSort = new InsertionSort();
		arrayElements = insertionSort.performInsertionSort(arrayElements);
		
		for (int i : arrayElements) {
			System.out.println(i);
		}

	}

}
