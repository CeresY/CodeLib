package corejava.math;

public class MathT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		scope();
	}
	
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

}
