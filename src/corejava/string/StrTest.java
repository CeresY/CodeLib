package corejava.string;

import org.junit.Test;

public class StrTest {

	public void contains() {
		String str = "${User?id}";
	}
	
	@Test
	public void replaceTest() {
		StrTest obj = new StrTest();
		StrTest obj2 = null;
		if(obj2 instanceof StrTest) {
			System.out.println("正是在下".toLowerCase());
		} else {
			System.out.println("你认错人了".toLowerCase());
		}
	}
	
	@Test
	public void sub() {
		String s = "0123456";
		System.out.println(s.substring(0, 4));
	}
	
	@Test
	public void split() {
		String s = ",b,,c,";
		String[] arr = s.split(",");
		for(String str : arr) {
			System.out.println("["+str+"]");
		}
	}
	
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
