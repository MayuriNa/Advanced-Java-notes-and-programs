package BasicProgram;

import java.util.Scanner;

public class prime {
public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("Enter number :");
		 int num = sc.nextInt();
		 
		int flag = 0 ;
		
		for(int i = 2 ; i <= num/2 ; i++ ) {
		         
		        if(num %i == 0) {
		        	flag = 1;
		        	break ;
		        }
		     }
		if(flag == 0) {
			System.out.println("Given number is prime" );
			}
		else {
			System.out.println("Given number is not prime ");
		}
		}


}