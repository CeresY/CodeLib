package corejava.string;

public class Replace {
	public static void main(String[] args) {
		regex();
	}
	
	public static void regex() {
		String v = "abc{0}efg{1}123";
		System.out.println(v.replace("\\{([^}]+)\\", "F20"));
	}
}
