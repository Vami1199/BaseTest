package javacxsj.array;

import java.text.SimpleDateFormat;
import java.util.Date;

public class time {
	
	public static void main(String[] args){
	Date date = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat();
	//sdf.applyPattern("yyyy-MM-dd");
	sdf.applyPattern("yyyy-MM-dd HH:mm:ss");
	System.out.println(sdf.format(date));
	}
}
