package inter;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FatherT fo = new ChildT();
		fo.f1();
		
		ChildT m1 = (ChildT) new FatherT();
		m1.c1();
	}

}
