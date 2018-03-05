package javacxsj.loop4th;
/**
 * 学费20000时翻倍
 * @author DXJ
 *
 */
public class FutureTuition {
	public static void main(String[] args) {
		double tuition = 10000;
		int year = 1;
		while(tuition < 20000){
			tuition = tuition * 1.07;
			year ++;
		}
		System.out.println("tuition will be double in " + year + " years ");
	}
}	
