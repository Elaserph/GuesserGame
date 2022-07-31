package com.game.guess;

import java.util.Scanner;

public class Umpire {
	
	int numFromGuesser, numOfPlayers, range;
	int [] numberGuessedByPlayers;
	
	Umpire(){
		
		System.out.println();
		System.out.println("OK... Lets begin! I am the Umpire who will preside over this game...");	
		System.out.println();
		
	}
	
	public void collectNumFromGuesser() {
		
		Guesser G = new Guesser();
		range = G.selectRange();
		numOfPlayers = G.numberOfPlayers();
		numFromGuesser = G.guessNumber(); 	
	}
	
	public void collectNumFromPlayer() {
		
		numberGuessedByPlayers = new int[numOfPlayers];
		
		for(int i = 0; i < numOfPlayers; i++) {
			Player P = new Player();
			numberGuessedByPlayers[i] = P.guessNum(i+1, range);
		}	
	}
	
	public void compare() {
		
		int flag = 0;
		for(int i = 0; i < numOfPlayers; i++) {
			if(numberGuessedByPlayers[i] == numFromGuesser) {
					System.out.println("Player "+ ((int)i+1) +" guessed it correctly!!! wooh!");
					flag = 1;
				}
		}
		if(flag == 0)
			System.out.println("No one guessed the number correctly...!!! oops!");
		System.out.println();
	}
	
	public int continuePlaying() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.println("Do you want to continue playing??? if yes, press 1 else 0...");
		int cont = scan.nextInt();
		System.out.println();
		return cont;
	}
	
	public void continueGame() {
		System.out.println("OK!!! let's continue the Game");
		System.out.println();
	}
	
	public void byeBye() {
		System.out.println("Ahhh...as you wish, GAME OVER... BYE BYE!!!");
		System.out.println();
	}
}
