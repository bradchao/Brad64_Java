package tw.org.iii.tutor;

import tw.org.iii.myclasses.*;

public class Brad23 {

	public static void main(String[] args) {
		String id = "A123457777";
		if (id.matches("[ABC][12][0-9]{4}7{4}")) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}
	}

}
