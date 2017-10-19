package corejava.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class DateTest {
	@Test
	public void compare() throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyyMM");
		Date d1 = format.parse("201702");
		Date d2 = format.parse("201704");
		System.out.println(d1.compareTo(d2));//-1
	}
	
	@Test
	public void systemDate() {
		System.out.println("Millis: " + System.currentTimeMillis());
		System.out.println("Nanotime: " + System.nanoTime());
	}
}
