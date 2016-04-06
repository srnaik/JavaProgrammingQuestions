package com.sac;

public class BinarySearchMain {

	public static void main(String[] args) {
		
		int []arrElements = {10,20,30,40,50};
		BinarySearch binarySearch = new BinarySearch();
		int result = binarySearch.searchElement(arrElements, 20);
		System.out.println(result);

	}

}
