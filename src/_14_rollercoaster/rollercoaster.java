package _14_rollercoaster;

import javax.swing.JOptionPane;

public class rollercoaster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String height = JOptionPane.showInputDialog("how tall are you in inches?");
		int inch = Integer.parseInt(height);
		if(inch<48) {
			JOptionPane.showMessageDialog(null, "you need to grow first");
		}
		else if(inch>48) {
			JOptionPane.showMessageDialog(null, "you can come on the ride");
		}
		
		
	}

}
