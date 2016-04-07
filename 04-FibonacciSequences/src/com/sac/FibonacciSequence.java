package com.sac;

public class FibonacciSequence {
	
	private int fibonacciOfZero = 0;
	private int fibonacciOfOne = 1;
	private int fibonacciOfN = 0;
	
	
	public int calculateFibonacci(int n){
		
		for(int i = 2; i <= n; ++i){
			fibonacciOfN = fibonacciOfOne + fibonacciOfZero;
			fibonacciOfZero = fibonacciOfOne;
			fibonacciOfOne = fibonacciOfN;
		}
		return fibonacciOfN;
	}

}
