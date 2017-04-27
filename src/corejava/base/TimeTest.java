package corejava.base;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeTest {
	public static void test1() {
		System.out.println(System.currentTimeMillis());
	}
	
	public static void test2() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		try {
			Date date = sdf.parse("19700101 00:00:00");
			long t = date.getTime();
			System.out.println(date);
			System.out.println(t);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(new Date(-28800000L));
		System.out.println(new Date(-120L));
	}
	
	public static void main(String[] args) {
		test2();
	}
}
