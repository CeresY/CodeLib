package mian;

public class DameonThread implements Runnable{
	static long bt;
	static long et;
	
	@Override
	public void run() {
		bt = System.currentTimeMillis();
	}

}
