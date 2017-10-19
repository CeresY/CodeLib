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
	
	/**
	 * 某周的周一是几号
	 * @param week
	 * @return
	 */
	@Test
	public void getMonday() {
		String week = "2017W36";
		int year_ = Integer.parseInt(week.substring(0, 4));
		int weekNo_ = Integer.parseInt(week.substring(5, 7));
		Calendar cal = Calendar.getInstance();  
        cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);        
        cal.set(Calendar.YEAR, year_); 
        cal.set(Calendar.WEEK_OF_YEAR, weekNo_);
        
        // 格式化
        String year = String.valueOf(cal.get(Calendar.YEAR));
        int _month = cal.get(Calendar.MONTH) + 1;
        String month = _month < 10 ? "0"+_month : String.valueOf(_month);
        int _day = cal.get(Calendar.DAY_OF_MONTH);
        String day = _day < 10 ? "0"+_day : String.valueOf(_day);
        System.out.println(year+"-"+month+"-"+day);
	}
}
