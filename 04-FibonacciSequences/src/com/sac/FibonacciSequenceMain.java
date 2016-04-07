package com.sac;

import java.util.Scanner;

public class FibonacciSequenceMain {

	public static void main(String[] args) {
		
		int n = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Desired Number And Press Enter: ");
		if(scanner.hasNext())
			 n = scanner.nextInt();
		
		FibonacciSequence fibonacciSequence = new FibonacciSequence();
		int result = fibonacciSequence.calculateFibonacci(n);

		System.out.println("Fibonacci value of "+ n + " is: " + result);
	}

}
