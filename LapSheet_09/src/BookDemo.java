import java.util.*;
public class BookDemo {

	public static void main(String[] args) {
		Book b1 =new Book();
		Scanner scan = new Scanner(System.in);
		System.out.print("Imput book title :");
		String title = scan.nextLine();
		System.out.print("Imput book price :");
		float price = scan.nextFloat();
		System.out.print("Imput book Publish year :");
		int Publishyear = scan.nextInt();
		b1.setTitle(title);
		b1.setPrice(price);
		b1.setPublishyear(Publishyear);
		System.out.println();
		System.out.println(b1);
 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
