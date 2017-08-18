package corejava.string;

import org.junit.Test;

public class StrTest {

	public void finalTest() {
//		String s1 = "aaa";
		String s1 = new String("aaa");
		//System.out.println(s1);
		
		//--------------
		int i=1;
		finalTest3(i);
		System.out.println(i);
	}
	
	@Test
	public void finalTest2() {
		System.out.println("abSDdF".toUpperCase());
		String str = "abc:assign";
		System.out.println(str.split(":")[0]);
	}
	
	public void finalTest3(int ii) {
		ii++;
	}
	
	public void init() {
		StringBuffer sb = new StringBuffer("A");
//		String str = "B";
		String str = new String("B");
		operate(sb, str);
		System.out.println("StringBuffer=" + sb);
		System.out.println("String=" + str);
	}
	
	public static void operate(StringBuffer sb, String str) {
		sb.append(str);
		System.out.println("operate-before = " + str);
		str += sb;
		System.out.println("str-after = " + str);
	}

}
