package com.game.guess;

import java.util.Scanner;

public class Guesser {
	
	int guessNum, numOfPlayers, selRange;
	
	public int selectRange() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Guesser kindly choose an upper limit of guessing number range... 0 to what??? write below:");
		selRange = scan.nextInt(); 
		System.out.println();
		return selRange;
	}
	
	public int guessNumber(){
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Guesser kindly choose a number to guess in the range 0 to "
		+ selRange +" (pshh...you selected the upper limit as "+ selRange +")!!!");
			guessNum = scan.nextInt(); 
		}while(guessNum<0 || guessNum>selRange);
		
		System.out.println();
		//scan.close();
		return guessNum;
	}
	
	public int numberOfPlayers(){
		
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.println("Guesser, how many players will play? Enter down below:");
		numOfPlayers = scan.nextInt(); 
		System.out.println();
		//scan.close();
		return numOfPlayers;
	}
}
