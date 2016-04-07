package com.sac;

public class BubbleSortMain {

	public static void main(String[] args) {
	
		int[] arrayElements = {12,10,8,6,4,14,18,16,24,2};
		
		BubbleSort bubbleSort = new BubbleSort();
		arrayElements = bubbleSort.sortArrayElements(arrayElements);

		System.out.println("Sorted Array " + arrayElements.length);
		
		for (int i : arrayElements) {
			System.out.println(i);
		}
	}

}
