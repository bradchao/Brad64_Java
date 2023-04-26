package tw.org.iii.tutor;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import tw.org.iii.myclasses.Student;

public class Brad59 {
	public static void main(String[] args) {
		Student s1 = new Student("Brad", 52, 43, 64);
		System.out.println(s1.sum() + ":" + s1.avg());
		
		try {
			FileOutputStream fout = new FileOutputStream("dir1/s1");
			ObjectOutputStream oout = new ObjectOutputStream(fout);
			oout.writeObject(s1);
			oout.flush();
			oout.close();
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
