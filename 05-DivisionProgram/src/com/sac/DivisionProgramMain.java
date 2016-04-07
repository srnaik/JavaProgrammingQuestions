package com.sac;

import java.util.Scanner;

public class DivisionProgramMain {

	public static void main(String[] args) {
		
		int range = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please specify the range and press Enter");
		if(scanner.hasNext()){
			range = scanner.nextInt();
		}
		
		DivisionProgram divisionProgram = new DivisionProgram();
		divisionProgram.numbersDivisibleByThreeAndFive(range);

	}

}
