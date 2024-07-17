import java.util.Scanner;
public class SquareCube {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number:");
		double num = sc.nextDouble();
		
		double squareNumber = num*num;
		double cubeNumber = num*num*num;
		
		System.out.println("Square of given number is :"+squareNumber);
		System.out.println("Cube of a given number is :"+cubeNumber);
	}

}
