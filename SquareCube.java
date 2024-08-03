package BasicProgram;
import java.util.Scanner;
public class SquareCube {

	    public static void main(String[] args) {
	       
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        double number = scanner.nextDouble();
	        		
	        double power1 = Math.pow(number, 1);
	        double power2 = Math.pow(number, 2);
	        double power3 = Math.pow(number, 3);

	        System.out.println("N^1 = " + power1);
	        System.out.println("N^2 = " + power2);
	        System.out.println("N^3 = " + power3);

	    }
	}



