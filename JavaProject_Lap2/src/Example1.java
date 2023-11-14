
public class Example1 {

	public static void main(String[] args) {
		String isbn="IB2-6325-85-4-1",title="Basic Java Programming";
		int unit=5;
		//float price = 225.75f;
		double price = 225.75f;
		System.out.println("Book ISBN : "+isbn);
		System.out.println("Book Title : "+title);
		System.out.println("Book Unit : "+unit);
		System.out.println("Book Price : "+price);
		System.out.println("--------------------------------------------");
		double totlePrice = unit*price;
		System.out.println("Totle Price is "+totlePrice);
		double vat = totlePrice +(totlePrice*7/100);
		System.out.println("Add VAT 7% is "+vat);
		
		
		

	}

}
