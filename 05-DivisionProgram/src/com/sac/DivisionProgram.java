package com.sac;

public class DivisionProgram {

	public void numbersDivisibleByThreeAndFive(int range){

		for(int i = 1; i <= range; i++){

			 if(i%3==0 && i%5==0){
				System.out.println("Bing and Bang!, Divisible by both Three and Five");
			}else if(i%3==0){
				System.out.println("Bing!, Divisible by Three");
			}else if(i%5==0){
				System.out.println("Bang!, Divisible by Five");
			}else{
				System.out.println(i);
			}
		}
	}

}
