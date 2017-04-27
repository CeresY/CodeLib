package corejava.desigen;

public class TestTemp {
	public static void main(String[] args) {
		new CallTemplate().execute(new CallBack() {
			@Override
			public void roll() {
				System.out.println("这算不算接口实例化");
			}
		});
	}
}
