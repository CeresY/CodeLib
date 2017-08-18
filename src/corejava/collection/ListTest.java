package corejava.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

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
	
	@Test
	public void delElement() {
		int i=10;
		Set<String> sets = new HashSet<String>();
		while(i-->0) {
			char c = (char)(i+65);
			sets.add(String.valueOf(c));
		}
		Iterator<String> it = sets.iterator();
		while(it.hasNext()) {
			String str = it.next();
			if("A".equals(str) || "D".equals(str) || "F".equals(str) || "I".equals(str)) {
				it.remove();//删除str元素
			}
		}
		Iterator<String> it_ = sets.iterator();
		while(it_.hasNext()) {
			System.out.println(it_.next());
		}
	}
}
