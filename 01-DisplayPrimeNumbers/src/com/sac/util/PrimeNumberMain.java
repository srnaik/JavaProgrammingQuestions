package com.sac.util;

import java.util.Scanner;

public class PrimeNumberMain {


	public static void main(String[] args){

		String range = "0";

		Scanner sc = new Scanner(System.in);
		System.out.println("Please specify the range and press enter :");
		
		if(sc.hasNextLine())
			range = sc.nextLine();
		
		PrimeNumberMain main = new PrimeNumberMain();
		main.displayPrimeNumbers(Integer.parseInt(range));
	}


	public void displayPrimeNumbers(int range){

		for (int i = 2; i <= range; i++){

			int count = 0;

			for(int j = 2; j<= i/2;j++){

				if(i%j==0){
					count++;
				}
			}

			if(count == 0){
				System.out.println(i);
			}
		}
	}
}
