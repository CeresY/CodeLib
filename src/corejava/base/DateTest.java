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

	/**
	 * 获取当月最后一天
	 */
	@Test
	public void lastDay() {
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(new Date().getTime());
		//cal.set(currentDate.getDate(), cal.getActualMaximum(currentDate.getDate()));
		/*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(cal.getTime()));*/
		System.out.println(Calendar.DATE);
	}
}
