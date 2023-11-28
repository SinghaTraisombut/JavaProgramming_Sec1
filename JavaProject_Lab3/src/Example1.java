import javax.swing.*;
import java.text.*;
public class Example1 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		final int BUFFET = 299;
		int numberofCustomer = Integer.parseInt(
				JOptionPane.showInputDialog("How many customer per bill"));
		double discout,totlePrice=0;
		totlePrice = BUFFET * numberofCustomer ;
		int member;
		do {
			member = JOptionPane.showConfirmDialog(null,"Totla price is "
					+frm.format(totlePrice) + "bath."
					+"\nDO you have a member card");
		}while(member == JOptionPane.CANCEL_OPTION);
		if(member == JOptionPane.YES_OPTION) {
			discout = totlePrice *90/100;
			JOptionPane.showMessageDialog(null,
					"Amount to be paid is "+totlePrice+"bath.");
		}
		else if(member == JOptionPane.NO_OPTION) {
			discout = totlePrice *90/100;
			JOptionPane.showMessageDialog(null,
					"Amount to be paid is "+totlePrice+"bath.");
		}
		else{
			JOptionPane.showMessageDialog(null,
					"Totle Price is "+frm.format(totlePrice)+"bath."
					+"\nDo you have a member card");
			}
		
		
	}

}
