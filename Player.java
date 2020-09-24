package com.gameworld;
import java.util.Random;
import java.util.Scanner;

public class Player {
	//Player properties
	public int score;     		//Score after each round
	public boolean batting;  	//batting turn is true if current player is batting
	public char name;    		//Name of player
	public int target;   		//target set for chasing player
	public int run;
	
	//default constructor
	public Player(){
		score =0;
		batting = false;
		run = 0;
		name = 'U';
		target = 0;
	}


	//overloaded constructor to initialize attribures
		public Player(char c){
			score =0;
			batting = false;
			run = 0;
			name = c;
			target = 0;
		}	
		//create a method called getRun returns runs by a player randomly
		public int getRun() {
			int[] runs = {0, 1, 2, 3, 4, 6};      	//runs Array to provide runs excluding "5"
			Random rand = new Random(); 
			int randRun = rand.nextInt(6);
			return runs[randRun];
		}
		
		//createing a static method to call from any player to match scores of current player with next player
		//Also to decide who is the winner during the number of rounds specified by the user
		public static String match(int rounds, Player currentPlayer, Player nextPlayer) {
			
			Player tempPlayer = new Player('\0'); 	//used to switch between two teams
			for(int round = 1; round <= rounds; round++) {  
				
				System.out.println("Round "+round+":");
				System.out.println(currentPlayer.name+" is batting");
				for(int ball = 0; ball < 6; ball++) {
					
					currentPlayer.batting = true;
					
					currentPlayer.run = currentPlayer.getRun();
					nextPlayer.run = nextPlayer.getRun();
					if(currentPlayer.run != nextPlayer.run)
					
						if(currentPlayer.name == 'A' ) {
							
							currentPlayer.score = currentPlayer.score + currentPlayer.run;
							System.out.println(currentPlayer.name +" throws "+currentPlayer.run+" "+nextPlayer.name+" throws "+nextPlayer.run+" "+ currentPlayer.name +"'s score is "+currentPlayer.score);
							if(currentPlayer.score < currentPlayer.target) {
								System.out.println("target"+currentPlayer.target);
								break;
							}
						}
						else {
							
							currentPlayer.score = currentPlayer.score + nextPlayer.run;
							System.out.println(currentPlayer.name +" throws "+currentPlayer.run+" "+nextPlayer.name+" throws "+nextPlayer.run+" "+ currentPlayer.name +"'s score is "+currentPlayer.score);
							if(currentPlayer.score < currentPlayer.target)
								break;
						}
					
					else if(currentPlayer.run == nextPlayer.run) {

						System.out.println(currentPlayer.name +" throws "+currentPlayer.run+" "+nextPlayer.name+" throws "+nextPlayer.run+" "+ currentPlayer.name +" is out");
						break;
					}
					
				}
				
				currentPlayer.target = currentPlayer.score;  //setting current payer score as target for opponent
				tempPlayer = currentPlayer;
				currentPlayer = nextPlayer;
				nextPlayer = tempPlayer;
			 
			}
			//deciding the winner and TIE between teams
			if(currentPlayer.score > nextPlayer.score)       
				return "Game Winner is "+currentPlayer.name;
			else if(currentPlayer.score < nextPlayer.score)
				return nextPlayer.name+" is winner";
			else
				return "TIE";
		}
		

			
}

   