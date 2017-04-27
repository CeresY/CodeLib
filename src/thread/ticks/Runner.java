package thread.ticks;


public class Runner {

	public static void main(String[] args) {
		long bt = System.currentTimeMillis();
		
		ThreadMain tm = new ThreadMain();
		Thread t1 = new Thread(tm, "T1: ");
		Thread t2 = new Thread(tm, "T2: ");
		Thread t3 = new Thread(tm, "T3: ");
		t1.start();
		t2.start();
		t3.start();
		
/*		ThreadMain tm2 = new ThreadMain();
		Thread t1_2 = new Thread(tm2, "T1_2: ");
		Thread t2_2 = new Thread(tm2, "T2_2: ");
		Thread t3_2 = new Thread(tm2, "T3_2: ");
		t1_2.start();
		t2_2.start();
		t3_2.start();*/
		
		//tm, tm2�������������̶߳��������������������߳̿��Զ��������಻Ӱ��
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		long et = System.currentTimeMillis();
		System.out.println("��ʱ�� " + (et-bt) + " 1/1000 seconds");
	}

}
