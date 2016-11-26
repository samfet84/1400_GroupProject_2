package groupproject;

import java.util.Random;

public class Dice {
	Random rand;
	public Dice(){
        rand = new Random();  
        }
	public int rollDie(){
         
		int dieNum = rand.nextInt(6) + 1;
		return dieNum;
	}
}

