package tw.org.iii.tutor;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Brad56 {
	public static void main(String[] args) {
		try {
			long start = System.currentTimeMillis();
			FileOutputStream fout = new FileOutputStream("dir2/brad.mkv");
			FileInputStream fin = new FileInputStream("dir1/eeit64.mkv");
			int len; byte[] buf = new byte[4*1024];
			while ((len = fin.read(buf)) != -1) {
				fout.write(buf, 0, len);
			}
			fin.close();
			fout.flush();
			fout.close();
			System.out.println("finish2:" + (System.currentTimeMillis()-start));
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
