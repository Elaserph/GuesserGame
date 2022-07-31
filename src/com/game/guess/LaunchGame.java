package com.game.guess;

public class LaunchGame {
	public static void main(String args[]) {		
		
		int cont = 0;
		Umpire U = new Umpire();
		
		do {
			if(cont == 1)
				U.continueGame();
			U.collectNumFromGuesser();
			U.collectNumFromPlayer();
			U.compare();
			cont = U.continuePlaying();
		}while(cont == 1);
		
		U.byeBye();
	}
}
