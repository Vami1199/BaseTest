package javacxsj.loop4th;

import java.util.Scanner;

/**
 * 求最大公约数
 * @author DXJ
 *
 */
public class GreatestCommonDivistor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("first integer :");
		int n1 = input.nextInt();
		System.out.print("second integer :");
		int n2 = input.nextInt();
		
		int gcd = 1;
		/*int k = 2;
 		while (k <= n1 && k <= n2) {
 			if (n1 % k == 0 && n2  % k == 0){
 				gcd = k ;
 			} 
				
			k++;
			if(n1 % k == 0 && n2 % k == 0)
				gcd = k;
			k++;
		}*/
		
		for(int k = 1; k <= n1 && k <= n2; k++ ){
			if (n1 % k == 0 && n2 % k == 0) {
				gcd = k;
			}
		}
		
		System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);
	}
}
