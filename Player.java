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
		
			
}

   