package javacxsj.array;

import java.util.Scanner;

public class AnalyzeNumbers {
	public static void main(String[] args) {
		final int NUMBER_OF_ELEMENTS = 10;
		double[] numbers = new double[NUMBER_OF_ELEMENTS];
		double sum = 0;
		Scanner input = new Scanner(System.in);
		for(int  i = 0;i<NUMBER_OF_ELEMENTS;i++){
			System.out.println("Enter a new number:");
			numbers[i]  = input.nextDouble();
			sum += numbers[i];
		}
		
		double  average = sum / NUMBER_OF_ELEMENTS;
		int count = 0;
		for(int i = 0;i<NUMBER_OF_ELEMENTS;i++){
			if (numbers[i]>average) {
				count++;
				System.out.println("Average is " + average);
				System.out.println("number of elements above average " + count);
			}
		}
	}
}
