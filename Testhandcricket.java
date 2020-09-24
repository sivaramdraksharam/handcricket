package com.testgame;

import static org.junit.Assert.*;

import org.junit.Test;

import com.gameworld.Player;

import junit.framework.Assert;

public class Testhandcricket {

	@Test
	public void testMatches()
	{
		
		Player A=new Player('A');
		Player B=new Player('B');
		
		Assert.assertEquals("Game Winner is A",Player.match(2, A, B));
		
		

	}

}
