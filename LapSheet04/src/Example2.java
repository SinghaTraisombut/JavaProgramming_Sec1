import java.util.*;

public class Example2 {

	public static void main(String[] args) {
		final double TAX_RATE_ABOVE_20K = 0.1;
		final double TAX_RATE_ABOVE_40K = 0.2;
		final double TAX_RATE_ABOVE_60K = 0.3;
		int taxableIncome;
		double taxPayable = 0;
		
		//Assume input for taxableIncome
		taxableIncome =85000;
		
		//Compute tex payble in 4 cases
		if(taxableIncome<=20000) {
			taxPayable = 0;
		}
		else if (taxableIncome<=40000) {
			taxPayable = (taxableIncome-20000) *TAX_RATE_ABOVE_20K;
		}
		else if (taxableIncome<=60000) {
			taxPayable = 20000 *TAX_RATE_ABOVE_20K+(taxableIncome-40000) *TAX_RATE_ABOVE_40K;
		}
		else {
			taxPayable = (20000* TAX_RATE_ABOVE_20K)+(20000 
					*TAX_RATE_ABOVE_40K)+(taxableIncome-60000) 
					*TAX_RATE_ABOVE_60K ;
		}
		//Print tex payable rounded to decimal places
		System.out.printf("The incom tex payable is : %.2f",taxPayable);
		
		
		
		
		
		
		
		
		

	}

}
