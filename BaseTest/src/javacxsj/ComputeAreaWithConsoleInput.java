package javacxsj;

import java.util.Scanner;

public class ComputeAreaWithConsoleInput {
	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		System.out.print("enter a number for r: ");
		double redius = input.nextDouble();
		double area = redius * redius * 3.14159;
		System.out.println("the area for the circle of r " + redius + " is " +area); 
	}
}
