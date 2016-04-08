package com.sac;

public class MergeSortMain {

	
	
	public static void main(String[] args) {
		
		int[] arrayElements = {10,-2,0,2,8,6,4};
		
		MergeSort mergeSort = new MergeSort();
		mergeSort.sortArray(arrayElements);
		arrayElements = mergeSort.getArrayElements();
		
		for (int i : arrayElements) {
			System.out.println(i);
		}
	}

}
