package tw.org.iii.tutor;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Brad55 {
	public static void main(String[] args) {
		try {
			long start = System.currentTimeMillis();
			FileOutputStream fout = new FileOutputStream("dir2/brad.mkv");
			FileInputStream fin = new FileInputStream("dir1/eeit64.mkv");
			int b;
			while ((b = fin.read()) != -1) {
				fout.write(b);
			}
			fin.close();
			fout.flush();
			fout.close();
			System.out.println("finish:" + (System.currentTimeMillis()-start));
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
