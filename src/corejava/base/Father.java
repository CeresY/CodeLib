package corejava.base;

public class Father {
	private String name;
	
	public Father(String name) {
		this.name = name;
	}

	public void say() {
		System.out.println("Father say: " + this.name);
	}
}
