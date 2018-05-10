package javacxsj.function5th;

import java.util.Scanner;

/**
 * 十进制转换成十六进制
 * @author DXJ
 *
 */
public class Decimal2HexConversion {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter an decimal number : ");
		int decimal = input.nextInt();
		System.out.println("the hex number for decimal " + decimal + " is " + decimalToHex(decimal));
	}
	
	public static String decimalToHex(int decimal){
		String hex ="";
		while(decimal != 0){
			int hexValue = decimal % 16;
			hex = toHexChar(hexValue) +hex;
			decimal = decimal /16;
		}
		return hex;
	}
	
	public static char toHexChar(int hexValue){
		if (hexValue <=9 && hexValue >=0) {
			char str = (char)(hexValue + '0');
			return str;
		}
		else {
			char string = (char)(hexValue - 10 + 'A');
			return string;
		}
	}
}
