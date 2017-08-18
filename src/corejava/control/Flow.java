package corejava.control;

import org.junit.Test;

import corejava.base.*;
public class Flow {
	static int LEN = 20;
	
	public static void mian() {
		Flow foo = new Flow();
		foo.breakWhile();
	}
	
	@Test
	public void breakArea() {
		for(int m=0; m<LEN; m++) {
			System.out.println("M=" + m);
			for(int n=0; n<LEN; n++) {
				System.out.print(n + "\t");
				if(n == 4) {
					break;
				}
			}
			System.out.println();
		}
	} 
	
	@Test
	public void breakWhile() {
		int i = 10;
		while(i-->0) {
			if(i == 5) {
				break;
			}
			System.out.println(i);
		}
	}
}
