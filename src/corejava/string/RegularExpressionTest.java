package corejava.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class RegularExpressionTest {
	@Test
	public void pattern() {
		/*String str = "${Today?string(\"yyyy/MM/dd\")}";
		Pattern p = Pattern.compile("(\\[[^\\]]*\\])");
		Matcher m = p.matcher(str);*/
		// 近7天
		String str = "[${7Days?string(\"yyyy-MM-dd\")}]";
		//String str = "[${Today?string(\\\"yyyy-MM-dd HH:mm:ss\\\")}]";
		Pattern p = Pattern.compile("^\\[\\$\\{(7Days)");
		Matcher m = p.matcher(str);
		while (m.find()) {
			String replaceBefore2 = m.group();
			System.out.println(replaceBefore2);
		}
	}
}
