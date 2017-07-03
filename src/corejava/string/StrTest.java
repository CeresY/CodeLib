package corejava.string;

public class StrTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StrTest f = new StrTest();
		f.finalTest();
	}
	
	public void finalTest() {
//		String s1 = "aaa";
		String s1 = new String("aaa");
		finalTest2(s1);
		//System.out.println(s1);
		
		//--------------
		int i=1;
		finalTest3(i);
		System.out.println(i);
	}
	
	public void finalTest2(String s) {
		s = "bbb";
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
