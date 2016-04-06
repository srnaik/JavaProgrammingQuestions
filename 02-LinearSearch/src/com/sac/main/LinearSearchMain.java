package com.sac.main;

public class LinearSearchMain {
	
	public static void main(String[] args) {

		int[] arrayElements = {10,20,30,40,50};
		
		LinearSearch linearSearch = new LinearSearch();
		int result = linearSearch.searchElement(arrayElements, 10);
		if(result == 1){
			System.out.println(" Element Found ");
		}else{
			System.out.println(" Element not Found ");
		}
		
	}

}
