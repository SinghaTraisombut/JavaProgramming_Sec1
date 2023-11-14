import javax.swing.*;//1. import library for input data from dialog box
import java.text.*; 
public class Example4 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		//2. input data from dialog box
		String productName = JOptionPane.showInputDialog("Input product name : ");
		//input unit price from dialog box
		/*String strUnit = JOptionPane.showInputDialog("Input product unit : ");
		//convert string to unit
		int productUnit = Integer.parseInt(strUnit);*/
		int productUnit = Integer.parseInt(JOptionPane.showInputDialog("Input product name : "));
		//calculate totle price
		String strPrice = JOptionPane.showInputDialog("Input price per unit : ");
		float pricePerUnit = Float.parseFloat(strPrice);
		//display data to dialog box
		float totlePrice = productUnit* pricePerUnit;
		float vat =totlePrice +(totlePrice*7/100);
		JOptionPane.showMessageDialog(null,"Totle Price is "
				+totlePrice+ " bath." 
				+"\nAdd VAT 7%  is "+ frm.format(vat)+ " bath.");
		
		
		

	}

}
