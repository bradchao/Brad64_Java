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
	}

}
