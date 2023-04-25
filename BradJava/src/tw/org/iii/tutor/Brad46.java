package tw.org.iii.tutor;

import java.io.File;

public class Brad46 {

	public static void main(String[] args) {
		File file1 = new File("D:/dir12");
		if (file1.exists()) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}
	}

}
