/*
	  write a java program to calculate the factorial of any number and find there sum of digits of the factorial  
	 */
import java.util.Scanner;
public class factorial {		
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		

		 System.out.print("Enter a number: ");
	     int number = sc.nextInt();
	     

	    
	     long factorial = 1;
	     for (int i = 1; i <= number; i++) {
	         factorial *= i;
	     }

	     
	     long temp = factorial;
	     int sumOfDigits = 0;
	     while (temp != 0) {
	         sumOfDigits += temp % 10;
	         temp /= 10;
	     }

	    
	     System.out.println("Factorial of " + number + " is " + factorial);
	     System.out.println("Sum of the digits of the factorial is " + sumOfDigits);
	 }
	}



