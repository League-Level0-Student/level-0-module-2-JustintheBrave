package _15_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String age = JOptionPane.showInputDialog("how old are you?");
		int year = Integer.parseInt(age);
		
		if(year<18) {
			JOptionPane.showMessageDialog(null, "no one cares what you think");
		}
		else if (year>=18) {
			JOptionPane.showInputDialog("who should the next president be?");
		}
		
		
		
		
	}

}
