package javacxsj.choose3rd;

import java.util.Scanner;

public class ComputeTax {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("(0-single filer, 1-married jointly,\n" + 
		"2-married separately, 3-head of household)\n" + 
		"Enter the filing status: ");
		int status = input.nextInt();
		
		System.out.print("Enter the taxable income: ");
		double income = input.nextDouble();
		
		double tax = 0;
		if (status == 0) {
			if (income <= 8350) {
				tax = income * 0.10;
			}else if (income <= 82250) {
				tax = 8350 * 0.10 + (33950 - 8350)*0.15 + (income - 33950)*0.25;
			}else if (income <= 171550) {
				tax = 8350 * 0.10 + (33950 -8350) * 0.15 + (82250 -33950) * 0.25 +(income -82550)*0.28;
			}
		}else if (status == 1) {
			
		} else {
			System.err.println("Error: invalid status");
			System.exit(0);
		}
		
		System.out.println("Tax is " + (int)(tax * 100) / 100.0);
	}
}
