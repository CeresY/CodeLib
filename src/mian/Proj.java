package mian;

public class Proj {
	private String m;
	private int a;

	public String getM() {
		return m;
	}

	public void setM(String m) {
		this.m = m;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	public static void main(String[] args) {
		Proj a1 = new Proj();
		a1.setM("father");
		
		Proj a2 = a1;
		a2.setA(2);
		
		Proj a3 = a1;
		a3.setA(3);
		
		System.out.println(a1.getA());
		System.out.println(a2.getA());
		System.out.println(a3.getA());
	}
}
