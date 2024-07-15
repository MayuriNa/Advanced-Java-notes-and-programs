import java.util.Scanner;

public class EmployeeSalary {
	
	public static void main(String args[]) {
		String name;
		double basicSalary;
		double withdrawl;
		double remainingSalary;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name :");
		name = sc.nextLine();
		
		System.out.println("Enter Salary :");
		basicSalary = sc.nextDouble();
		
		System.out.println("Enter withdrawal amount :");
		withdrawl = sc.nextDouble();
		
		remainingSalary = basicSalary - withdrawl;
		System.out.println("Remaining salary :" +remainingSalary);
		
		if(basicSalary > 25000) {
			double tax = 0.1 * basicSalary;
			System.out.println("Tax amount :" +tax);
			
			remainingSalary = basicSalary - withdrawl - tax;
			System.out.println("Remaining Salary is :" +remainingSalary);
			
		}
		else {
			remainingSalary = basicSalary - withdrawl;
			System.out.println("Remaining salary is:" +remainingSalary);
		}
	}
	
}
