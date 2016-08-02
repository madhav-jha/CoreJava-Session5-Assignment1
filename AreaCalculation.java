package session5.assignment1;

import java.util.Scanner;
import java.lang.Math;

public class AreaCalculation extends Shapes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Area of which geometrical shape you want to calculate viz. 1 for Rectangle and 2 for Triangle ");
		 int ch = sc.nextInt();
		
		if(ch == 1) {
			System.out.println("Enter sides of the rectangle:");
			length = sc.nextDouble();
			breadth = sc.nextDouble();
			System.out.println("Area of the rectangle = "+length*breadth);
		}
		
		else if(ch == 2) {
			System.out.println("Enter three sides of the triangle:");
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();
			double s = (a+b+c)/2;
			double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
			System.out.println("Area of the triangle ="+area);
			
			
		}
		else
			System.out.println("Please enter valid shape");
		

	}

}
