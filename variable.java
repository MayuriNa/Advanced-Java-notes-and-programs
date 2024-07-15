import java.util.Scanner;
	
public class variable {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter an integer: ");
	        int number = scanner.nextInt();

	        System.out.print("Enter a floating-point number: ");
	        float decimalNumber = scanner.nextFloat();

	        System.out.print("Enter a character: ");
	        char letter = scanner.next().charAt(0);

	        System.out.print("Enter a string: ");
	        String text = scanner.next();

	        
	        System.out.println("Integer value: " + number);
	        System.out.println("Floating-point value: " + decimalNumber);
	        System.out.println("Character value: " + letter);
	        System.out.println("String value: " + text);

	        
	}

}
