package javacxsj.choose3rd;

import java.util.Scanner;

/**
 * num1 num2 ��� ��
 */
public class SubtractionQuiz {
	public static void main(String[] args) {
		int num1 = (int) (Math.random() * 10);
		int num2 =(int) (Math.random() * 10);
		if (num1 < num2) {
			int temp = num1;;
			num1 = num2;
			num2 = temp;
		}
		System.out.print("what is " + num1 + "-" + num2 + "?");
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		if (num1 - num2 == answer) {
			System.out.println("��");
		}else{
			System.out.println("��\n" + num1 + "-" + num2 + " should be" + (num1 - num2));
		}
	}
}
