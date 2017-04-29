package corejava.math;

import org.junit.Test;

public class MathT {

	public static void scope() {
		System.out.println(Float.MAX_VALUE);
	}
	
	public static void randomDouble() {
		int counter = 10;
		for(int i=0; i<counter; i++) {
			double d = Math.random();
			System.out.println("d=" + d + "\td*99=" + d*99);
		}
	}
	
	@Test
	public void test() {
		int i = 5;
		System.err.println("整除:" + i/4);
	}

}
