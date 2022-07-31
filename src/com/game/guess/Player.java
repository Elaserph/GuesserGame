package com.game.guess;

import java.util.Scanner;

public class Player {
	
	int guessNum;
	
	public int guessNum(int noPlayer, int range){
		
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Player "+noPlayer +" kindly guess the number in the range 1 to "+ range +" !!!");
			guessNum = scan.nextInt();
			}while(guessNum<0 || guessNum>range); 
		
		System.out.println();
		//scan.close();
		return guessNum;
	}
}
