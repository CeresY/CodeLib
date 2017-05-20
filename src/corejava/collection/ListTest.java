package corejava.collection;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ListTest {
	@Test
	public void remove() {
		List<String> list = new ArrayList<String>();
		for(int i=0; i<10; i++) {
			char c = (char)(97+i);
			list.add(String.valueOf(c));
		}
		for(int i=0; i<list.size(); i++) {
			System.out.println(i + " " +list.get(i));
			list.remove(list.get(i));
		}
	}
}
