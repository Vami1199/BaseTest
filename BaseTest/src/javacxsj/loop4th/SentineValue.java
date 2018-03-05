package javacxsj.loop4th;

import java.util.Scanner;
/**
 * 输入0这个标志值时退出程序 
 * @author DXJ
 *
 */
public class SentineValue {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter an int value (the program exits if the value is 0):");
		int data  = input.nextInt();
		int sum  = 0;
		while ( data != 0) {
			sum += data;
			System.out.println("enter an int value (the program exits if the value is 0):");
			data = input.nextInt();
		}
		System.out.println("The sum is " + sum);
		
		/*
		//以下是个无限循环   浮点数在学术上近似，不能确保item会变成真正的0
		double item = 1;
		double sum =  0;
		while (item != 0) {
			sum += item;
			item -= 0.1;
		}
		System.out.println(sum);
		*/
	}
}
