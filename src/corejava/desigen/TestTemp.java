package corejava.desigen;

public class TestTemp {
	public static void main(String[] args) {
		new CallTemplate().execute(new CallBack() {
			@Override
			public void roll() {
				System.out.println("���㲻��ӿ�ʵ����");
			}
		});
	}
}
