import java.util.*;
public class SalespersonSalary {

	public static void main(String[] args) {
		final double COMMISTION_RATE = 0.15;
		final int SENTINEL = -1;
		
		int seles ;
		double salary=0;
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("Enter sales in dollars (or -1 to end) :");
			seles = scan.nextInt();
			if(seles == SENTINEL) {
				System.out.print("bye");
				break;
			}
			salary = S_salary + seles * COMMISTION_RATE;
		}
		System.out.print("salary is : $"+salary);
	}

}
