package javacxsj.function5th;

public class TestMethodOverloading {
	public static void main(String[] args) {
		System.out.println("the max between 3 and 4 is " + max(3, 4));
		System.out.println("the max between 2.3 and 3.2 is " + max(2.3, 3.2));
		System.out.println("the max between  2.3 and 3.2 and 4.1 is " + max(2.3, 3.2, 4.1));
	}
	public static int max(int num1,int num2){
		if (num1 > num2) {
		 return num1;
		}else {
			return num2;
		}
	}
	
	public static double max(double num1,double num2){
		if (num1>num2) {
			return num1;
		}else {
			return num2;
		}
	}
	
	public static double max(double num1,double num2,double num3){
		return max(max(num1, num2), num3);
	}
	
}
