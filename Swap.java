import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		
		
		int a ,b , temp ; 
		Scanner sc = new Scanner(System.in); 
		
		
		System.out.println("Enter value of a :");
		a = sc.nextInt();
		
		
		System.out.println("Enter value of b :");
		b = sc.nextInt();
		
		
		temp = a;
		a = b ; 
		b = temp;
		System.out.println("after swaping:");
	    System.out.println("value of a :" +a);
	    System.out.println("value of b :" +b);
	    System.out.println("value of temp :" +temp);
	   
	}

}
