import java.util.Scanner;
public class Circle {
	
	public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
    
    public static double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

 
        double area = calculateArea(radius);
        double circumference = calculateCircumference(radius);
        
        System.out.println("Area of the circle: " + area);
        System.out.println("Circumference of the circle: " + circumference);

  
    }
}
