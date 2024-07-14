import java.util.Scanner;

public class SimpleInterest {
public static void main(String args[]) {
		
		
		Scanner sc = new Scanner(System.in) ; 
		
		System.out.println("Enter principal value :" );
	    double Principal = sc.nextDouble();
		
		System.out.println("Enter Time value in year :");
	    int Time = sc.nextInt();
		
		System.out.println("Enter Rate value :");
		double Rate = sc.nextDouble();
		
		double simpleInterest = (Principal*Time*Rate)/100;
		
		System.out.println("Simple interest is :" +simpleInterest);
		
		
		
	}
}
