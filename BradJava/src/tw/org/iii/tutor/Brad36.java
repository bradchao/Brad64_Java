package tw.org.iii.tutor;

import java.util.HashSet;
import java.util.Iterator;

public class Brad36 {
	public static void main(String[] args) {
		HashSet<String> ss = new HashSet<>();
		HashSet<String> set = new HashSet<>();
		set.add("III");
		set.add("Brad");
		set.add("Eric");
		set.add("Peter");
		set.add("Tony");
		
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("----");
		for (String v : set) {
			System.out.println(v);
		}
		
		
		
		
		
		
		
	}
}
