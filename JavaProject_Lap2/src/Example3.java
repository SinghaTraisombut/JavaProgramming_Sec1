import java.util.*;//1.import for input data from keyboard
import java.text.*; 
public class Example3 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		//2.create class Scanner for input data from keyboard
		Scanner input = new Scanner(System.in);
		//3. display and input data
		System.out.print("Input product name : ");
		String  productName = input.nextLine();
		System.out.print("Input product unit : ");
		int productUnit = input.nextInt();
		System.out.print("Input price per unit : ");
		float priceperUnit = input.nextFloat();
		System.out.println();
		float totlePrice = productUnit*priceperUnit;
		System.out.println("Totle Price is "+frm.format(totlePrice) + " bath.");
		double vat = totlePrice +(totlePrice*7/100);
		System.out.println("Add VAT 7%  is "+ frm.format(vat)+ " bath.");
		
				
		
		
		

	}

}
