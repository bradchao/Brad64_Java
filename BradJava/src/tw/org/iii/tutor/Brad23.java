package tw.org.iii.tutor;

import tw.org.iii.myclasses.*;

public class Brad23 {

	public static void main(String[] args) {
		String id = "A123456789";
		if (TWId.checkId(id)) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}
		System.out.println("---");
		
		TWId id1 = new TWId();
		TWId id2 = new TWId(1);
		TWId id3 = new TWId(false);
		TWId id4 = new TWId(true, 0);
		
		System.out.println(id1.getId());
		System.out.println(id2.getId());
		System.out.println(id3.getId());
		System.out.println(id4.getId());
		
		TWId id5 = TWId.createTWId("A123456789");
		System.out.println(id5.getId());
		
		
		
		
		
		
		
		
	}

}
