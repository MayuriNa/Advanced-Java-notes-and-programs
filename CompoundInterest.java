import java.util.Scanner;
public class CompoundInterest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter principal :");
		double principal = sc.nextDouble();
		
		System.out.println("Enter annual interest Rate :");
		double Rate = sc.nextDouble();
		
		System.out.println("Enter number of time compoundInterest in per year");
		int timeCompounded = sc.nextInt();
		
		System.out.println("Enter number of the intrest:");
		int number = sc.nextInt();
		
		double amount = principal * (Math.pow((1+Rate/100),(timeCompounded * number))) - principal;

			System.out.println("Principal is :" +principal); 
			System.out.println("Rate is :"+Rate);
			System.out.println("timeCompounded :" +timeCompounded);
			System.out.println("number :" +number);
			System.out.println("Compound interest :" +amount);
	}
}


