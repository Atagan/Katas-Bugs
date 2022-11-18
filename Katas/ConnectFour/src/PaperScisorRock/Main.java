package PaperScisorRock;

import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		
		playersInputs();
		
		
		
		
		
	}
	
	public static String game(String player1, String player2) {
		String win = "PLAYER ONE WIIIIIIIIIIINS!";
		String win2 = "PLAYER TWO WIIIIIIIIIIINS!";
		    if (player1.equals(player2)) {
		      System.out.println("IT WAS A DRAAAAAAAAAAAAW! TOO BAD, PLAY AGAIN!");
		      playersInputs();
		    }
		    if (player1.equals("rock") && player2.equals("scissors"))
		      return win;
		    if (player1.equals("scissors") && player2.equals("paper"))
		      return win;
		    if (player1.equals("paper") && player2.equals("rock"))
		      return win;
	    return win2;
	  }
	
	public static void playersInputs() {
		String player1, player2;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("PLAYER ONE! ROCK, PAPER, SCISSORS! NOW!");
			player1 = sc.nextLine().toUpperCase();
		}while(!(player1.equals("ROCK")||player1.equals("PAPER")||player1.equals("SCISSORS")));
		
		do{
			System.out.println("PLAYER TWO! ROCK, PAPER, SCISSORS! NOW!");
			player2 = sc.nextLine().toUpperCase();
		}while(!(player1.equals("ROCK")||player1.equals("PAPER")||player1.equals("SCISSORS")));
		System.out.println(game(player1, player2));
	}

}
