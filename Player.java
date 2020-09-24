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
		
		
		
		

	
	
}

   