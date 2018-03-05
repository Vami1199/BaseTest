package javacxsj.loop4th;

import java.util.Scanner;

public class GuesssNumber {
	public static void main(String[] args) {
		int num = (int) (Math.random()*101);
		Scanner input = new Scanner(System.in);
		System.out.println("Guess 0-100");
		int guess = -1;
		while (guess != num) {
			System.out.print("Enter your number");
			guess = input.nextInt();
			if (guess == num) {
				System.out.println("yes,you are right");
			}else if (guess < num) {
				System.out.println("your number is too low");
			}else {
				System.out.println("your number is too high");
			}
		}
		
	}
}
