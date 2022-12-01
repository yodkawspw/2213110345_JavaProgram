import javax.swing.*;
import java.util.Random;

public class Lab303 {
	public static void main(String[] args) {
		Random rand = new Random();
		int balance = rand.nextInt(9) * 100000;
		int withdraw;
		withdraw = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Your balance : "+balance+"\nInput money to withdraw: ","Input",JOptionPane.QUESTION_MESSAGE));
		int thousandBaht = withdraw/1000;
		int fivehundBaht = (withdraw%1000)/500;
		int hundredBaht = (withdraw%500)/100;
		int checkBaht = withdraw%100;
		if(withdraw > balance) {
			JOptionPane.showMessageDialog(null, 
					"Error: Cannot withdraw more than balance",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		else if(withdraw > 20000) {
			JOptionPane.showMessageDialog(null, 
					"Error: Cannot withdraw 20,000",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);	
		}
		else if(checkBaht > 1) {
			JOptionPane.showMessageDialog(null, 
					"Error: Cannot withdraw "+checkBaht+" baht.",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);	
		}
		else {
			JOptionPane.showMessageDialog(null, 
					"You withdraw "+withdraw+" baht."+
					"\n1,000 = "+thousandBaht+
					"\n500 = "+fivehundBaht+
					"\n100 = "+hundredBaht);
		}
	}
}
