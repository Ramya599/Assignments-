import java.util.Scanner;
public class TaxCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Basic Salary :-");
		int Basicsal =sc.nextInt();
		float HRA = (float)(Basicsal * 0.15);
		float DA = (float)(Basicsal * 0.60);
		float tax=1;
		int taxRate = 0;
		if(Basicsal<500000) {
			taxRate = 0;
			tax=(float)(Basicsal * 0.0);			
		}
		else if(Basicsal>500000 && Basicsal<1000000) {
			taxRate = 20;
			tax= (float)(Basicsal * 0.20);
		}
		else {
			taxRate = 30;
			tax=(float)(Basicsal * 0.30);
		}
		 System.out.println("For salary "+Basicsal+", Tax would be @ "+taxRate+"% amount = " +tax+" Rs.");
		 System.out.println("HRA is :"+HRA);
		 System.out.println("DA is  :"+DA);
		
		float totalSal=(Basicsal+HRA+DA)-tax;
		System.out.println("Total Salary = "+totalSal);
	}
}


OUTPUT:
Enter Basic Salary :-400000
For salary 400000, Tax would be @ 0% amount = 0.0 Rs.
HRA is :60000.0
DA is  :240000.0
Total Salary = 700000.0
