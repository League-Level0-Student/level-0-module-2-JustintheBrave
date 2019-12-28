package _06_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random ran = new Random();
int first=ran.nextInt(9);
int second=ran.nextInt(9);
int third=ran.nextInt(9);
int four=ran.nextInt(9);
int five=ran.nextInt(9);

JOptionPane.showMessageDialog(null, first + " " + second + " " + third + " " + four + " " + five + " ");
	}

}
