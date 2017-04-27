package corejava.base;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

/**
 * 日期处理
 * @author yangzhan-xps13
 * @date 2017年4月25日-上午10:41:09
 */
public class DateTest {
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd"); 
	
	/**
	 * 获取当月最后一天和第一天
	 * @throws ParseException 
	 */
	@Test
	public void lastDay() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
		Date date = sdf.parse("2017-07-01");
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		
		Date firstDayOfMonth = calendar.getTime();  
		System.out.println(sdf.format(firstDayOfMonth));
		
		calendar.add(Calendar.MONTH, 1);
		calendar.add(Calendar.DAY_OF_MONTH, -1);
		Date lastDayOfMonth = calendar.getTime();
		System.out.println(sdf.format(lastDayOfMonth));
	}
	
	/**
	 * 星期几
	 * @throws ParseException 
	 */
	@Test
	public void dayOfWeek() throws ParseException {
		Date date = sdf.parse("20170101");
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int day = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println(day == 1 ? 7 : day-1);
	}
}
