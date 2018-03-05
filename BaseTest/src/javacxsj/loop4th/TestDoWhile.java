package javacxsj.loop4th;

import java.util.Scanner;

public class TestDoWhile {
	public static void main(String[] args) {
		int data;
		int sum = 0;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("enter an int value (the program exits if the value =0 ): ");
			data = input.nextInt();
			sum += data;
		} while (data != 0);
		System.out.println(sum);
	}
}
