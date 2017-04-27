package mian;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import impl.CodeDescrip;
import inter.Descrip;

public class MianTest {
	
	static {
		System.out.println("static area");
	}
	
	
	public static void main(String[] args) {
		/*
//		Descrip descrip = new CodeDescrip();
//		descrip.function("");
		boolean flag = false; //false:交易正常；true:错误交易。
		flag = flag||true;
		System.out.println(flag);
		try {
			SimpleDateFormat fmt = new SimpleDateFormat("YYYY-MM-DD");
			Date d = fmt.parse("2010-01-31");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		*/
		 //test04();
		 //test02();
		MianTest foo = new MianTest();
		//System.out.println(foo.bankStr(null, 5));
		try {
			foo.testExcep();
		} catch (Exception e) {
			System.out.println("..........this mian");
			e.printStackTrace();
		}
	}
	
	public void testExcep() throws Exception {
		try {
			for(int i=0; i<10; i++) {
				if(i%3 == 1) {
					throw new Exception("..........this error code");
				}
			}
		} catch (Exception e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
			throw new Exception("....transfor......this error code");
		}
	}
	
	public void map() {
		/*Map<String, String> map = new HashMap<String, String>();
		map.put("A", "abslution");
		map.put("B", "bluding");
		if(map.get("C") != null) {
			System.out.println(map.get("C"));
		} else {
			System.out.println("no have!");
		}*/
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("BSCNTY", "-bscnty");
		map.put("BSPAY", "-bspay");
		//map.put("BSREN", "-bsren");
		map.put("TEST", "-margin");
		List<String> pracdeList = new ArrayList<String>();
		Set<String> keySet = map.keySet();
		for(String key : keySet) {
			if(("BSCNTY").equals(key)) {
				pracdeList.add("BSCNTY" + map.get(key));//国家码
				continue;
			}
			if(("BSPAY").equals(key)) {
				pracdeList.add("BSPAY" + map.get(key));//付款方式
				continue;
			}
			if(("BSREN").equals(key)) {
				pracdeList.add("BSREN" + map.get(key));//交易码
				continue;
			}
		}
		for(int i=0; i<pracdeList.size(); i++) {
			System.out.println(pracdeList.get(i));
		}
	}
	
	public void strSplit() {
		String str = "/BOP/EF/CN/A01/Z01/E/FSADFSA";
//		String str = "BOP/CNCNZ01/Z01CDEFG";
		String[] a = str.split("/E/");
		System.out.println("个数：" + a.length);
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println(a[1]);
		/*
		String s1 = str.split("/E/")[0];
		String s[] = s1.split("/");
		System.out.println("s1="+s1);
		int count = 0;
		for(int i=0; i<s.length; i++) {
			System.out.println(s[i]);
			count++;
		}
		System.out.println("个数：" + count);
		System.out.println("E[5]: " + s[5]);
		*/
	}
	
	public void math() {
		float f = (float) (Math.sin(60%360)*Math.PI/180.0);
		System.out.println(f);
		System.out.println(Math.sin(390));
	} 
	
	public void pattern() {
		String str = "less。ismore《汉字测试》 e[s]ta{bl-is}h<人生 如【逆旅，我】亦.是/行人>";
		String regex = "[\\｛\\｝\\［\\］\\【\\】\\（\\）\\．\\。\\－\\＿\\ \\{\\}\\[\\]\\(\\)\\.\\-\\《\\》\\＜\\＞\\＼\\／\\/]";
		String regex2 = "[\\｛|\\｝|\\［|\\］|\\【|\\】|\\（|\\）|\\．|\\。|\\－|\\＿|\\ |\\{|\\}|\\[|\\]|\\(|\\)|\\.|\\-|\\《|\\》|\\＜|\\＞|\\＼|\\／|\\/]";
		Matcher m =  Pattern.compile(regex).matcher(str);
		System.out.println(m.replaceAll(""));
		System.out.println(str.replaceAll(regex2, ""));
	}
	
	public void bariry() {
		String str = "2015年10月31日";
		byte[] b = str.getBytes();
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<b.length; i++) {
			if(b[i] >= 48 && b[i] <= 57) {
				sb.append(new String(b, i, 1));
			} else {
				sb.append("-");
			}
		}
		String dateStr = sb.toString().substring(0, sb.length()-2).replace("--", "-");
		System.out.println(dateStr);
		SimpleDateFormat d = new SimpleDateFormat("yyyy-M-d");
		
		try {
			System.out.println(d.parse(dateStr));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return;
	}
	
	public void page(int count) {
		Long lo = 300L;
		System.out.println(lo.compareTo(0L));
		/*String clract = "1";
		int i = count%10 > 0 ? count/10 + 1 : count/10;
		System.out.println(i);
		try {
			if(clract == null || "".equals(clract)) {
				throw new IllegalArgumentException("传入参数有误");
			}
			Map<String, Object> ckyMap = new HashMap<String, Object>();
//			System.out.println(ckyMap.isEmpty());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}*/
	}
	
	public void subStr() {
		String furinf = "java.123.abc";
//		System.out.println(str.substring(4, 24));//VAPC2017022710061965
//		System.out.println(Long.parseLong("00001230"));
		
		/*if(furinf != null && furinf.length() >= 24 && furinf.startsWith("VAPSVAPC")) {
			System.out.println(furinf);
		} else {
			System.out.println("xxx: " + furinf);
		}*/
		
		System.out.println(furinf.lastIndexOf("."));
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		System.out.println(list.size());
	}
	
	public void mapStr() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("v1", "k1");
		map.put("v2", "k2");
		map.put("v3", "k3");
		System.out.println(map.toString());
		
	}
	
	public void zhishu() {
		String str = "abc";
		if(str.startsWith("abc")) {
			System.out.println("1-"+str);
		} else {
			System.out.println("2-"+str);
		}
	}
	
	public void parserDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		try {
			Date d = sdf.parse("201506250002");
			System.out.println(d);
			if(d.before(new Date())){
				System.out.println("hah");
			} else {
				throw new Exception("error day");
				//System.out.println("t");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.hashCode());
		}
	}
	
	public void n() {
		String lasamt = "fafs";
		if("".equals(lasamt) || lasamt == null) {
			lasamt = "0";
		}
		System.out.println("["+lasamt+"]");
	}
	
	public void getDDMMYYY() {
		String date = "2015-07-11";
		String rtn = "";
		if (null != date && !"".equals(date)) {
			String[] strDate = date.split("-");
			rtn = strDate[2] + strDate[1] + strDate[0];
		}
		System.out.println(rtn);
	}
	
	public void putall() {
		Map<String, String> map1 = new HashMap<String,String>();
		map1.put("11","1aaa");
		map1.put("12","1bbb");
		map1.put("13","1ccc");
		
		Map<String, String> map2 = new HashMap<String,String>();
		map2.put("21","2aaa");
		map2.put("22","2bbb");
		map2.put("23","2ccc");
		map2.put("24","2ddd");
		map2.put("25","2eee");
		
		map1.putAll(map2);
	}
	
	public void borrow(double cash, int year) {
		double rate = 0.054;
		double r =0;
		while(year-->0) {
			r += cash*rate;
		}
		System.out.println(r);
	}
	
	public void while_1() {
		int i=10;
		while(i-->0) {
			System.out.println(i);
		}
	}
	
	public void i() {
		String filePath = "x";
		if(!"".equals(filePath) && filePath != null) {
			System.out.println("有值");
		} else {
			System.out.println("没值");
		}
		
		List<Integer> iList = new ArrayList<Integer>();
		for(int i=0; i<10; i++) {
			iList.add(i);
		}
		
		for(int k : iList) {
			System.out.println(k);
		}
		System.out.println("重新赋值");
		
		List<Integer> iList2 = new ArrayList<Integer>();
		iList2.add(111);
		iList2.add(222);
		
		iList = iList2;
		
		for(int k : iList) {
			System.out.println(k);
		}
	}
	
	public void test4() {
		//System.out.println(String.format("%c5", "abc"));
		System.out.println(Integer.valueOf("12s"));
	}
	
	public String bankStr(String str, int size) {
		StringBuffer sb = new StringBuffer();
		if(str.length()<size) {
			for(int i=0; i<size-str.length(); i++) {
				sb.append("0");
			}
			sb.append(str);
			return sb.toString();
		} else {
			return str;
		}
	}
	
	public void test3() {
		Proj p = null;
		String m = p.getM();
		if(!"m".equals(m)) {
			System.out.println("error");
		} else {
			System.out.println("succ");
		}
		
	}
	
	public void test2() {
		String str = "1.2";
		int i = Integer.parseInt(str);
		System.out.println(i);
		
	}
	
	public void test1() {
		System.out.println("".length());
		StringBuffer sb = new StringBuffer();
		String st = new String(
				"<DRACC_QUR_RESPONSE><PLT_CODE>EPLATBB</PLT_CODE><TRX_CODE>MC01</TRX_CODE>"+
				"<TRX_SERNO>EPLAT002015060509141736504</TRX_SERNO><RTRX_SERNO>BOC00002015060500000025652</RTRX_SERNO>" );
		int i = st.indexOf("<TRX_SERNO>")+10;
		char[] ch = st.toCharArray();
		for(int k=i; k<ch.length&&k>=10; k++) {
			char c = ch[k];
			if(c == '<') {
				break;
			}
			sb.append(c);
		}
		System.out.println("序号:  "+sb.toString());
	}
	
	public void testFor() {
		for(int i=0; i<10; i++) {
			testLogic(i);
		}
		System.out.println("end");
	}
	
	public void testLogic(int i) {
		if(i%2 != 0) {
			return;
		}
		System.out.println(i);
	}
	
	public void test05(int i) {
		test06();
		if(i == 0) {
			return;
		} else {
			System.out.println(i);
		}
	}
	
	public void test06() {
		int i=0;
		//i = 8/i;
		return;
	}
	
	public static void test04() {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	 	try {
		 	Date date1 = sdf.parse("2015-04-03 16:10:40");
			Date date2 = sdf.parse("2015-04-03 16:10:40");
			
			System.out.println(date1.after(date2));
		} catch (ParseException e) {
			//e.printStackTrace();
		}
	}
	
	public static void test01() {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	 	try {
		 	Date date1 = sdf.parse("2015-04-03 16:10:48");
			Date date2 = sdf.parse("2015-04-03 16:10:40");
			long l1,l2;
			l1 = date1.getTime();
			l2 = date2.getTime();
			long diff = (l1-l2)/1000;
			System.out.println(l1+"-"+l2+"="+diff);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public static void test02() {
		long l1 = 7948805000L;
		System.out.println(l1/(60*1000));
	}
	
	public static void test03() {
		int i = 12;
		Integer i2 = new Integer(2);
		System.out.println(i2.getClass().getName());
		
		String[] str = new String[3];
		//return str;
	}
	
}
