//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _04_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();

		// 1. Use each value of randomNumber to give the user a random compliment.
		
		for(int i=0; i<11; i++) {
			JOptionPane.showInputDialog("tell me ur name");
			
			int randomNumber = randomMaker.nextInt(5);
		
			if(randomNumber==1) {
			JOptionPane.showMessageDialog(null, "ur cool");
		}
		else if(randomNumber==2) {
			JOptionPane.showMessageDialog(null, "ur are cool");
		}
		else if(randomNumber==3) {
			JOptionPane.showMessageDialog(null, "ur arent cool");
		}
		else if(randomNumber==4) {
			JOptionPane.showMessageDialog(null, "ur special");
		}
		else if(randomNumber==5) {
			JOptionPane.showMessageDialog(null, "ur good at coding");
		}	
		}
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}

