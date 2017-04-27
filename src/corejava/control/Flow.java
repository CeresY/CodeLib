package corejava.control;

import corejava.base.*;
public class Flow {
	static int LEN = 20;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//FlowInter in = new FlowInter();
		
		Flow flow = new Flow();
		flow.breakArea();
	}
	
	protected void breakArea() {
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
}
