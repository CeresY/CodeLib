package corejava.base;

public class StringCommon {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*String target = "0123456";
		String r = filterCustomerNo2(target);
		System.out.println(r);*/
		equalsM();
	}
	
	public static void equalsM() {
		String st1 = "hello";
		String st2 = "hello";
		System.out.println(st1==st2);
		System.out.println(st1.endsWith(st2));
		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());
	}
	
	private static String filterCustomerNo(String customerNo)
	{
		if (customerNo == null)
			return "";
		String realCustomerNo = customerNo;
		while (realCustomerNo.length()>0 && "0".equals(realCustomerNo.substring(0, 1)))
		{
			realCustomerNo = realCustomerNo.substring(1);
		}
		return realCustomerNo;
	}
	
	private static String filterCustomerNo2(String customerNo)
	{
		if (customerNo == null)
			return "";
		while (customerNo.length()>0 && "0".equals(customerNo.substring(0, 1)))
		{
			customerNo = customerNo.substring(1);
		}
		return customerNo;
	}

}
