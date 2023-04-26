package tw.org.iii.tutor;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import tw.org.iii.myclasses.Student;

public class Brad60 {
	public static void main(String[] args) {
		try {
			ObjectInputStream oin = new ObjectInputStream(
				new FileInputStream("dir1/s1"));
			Object obj = oin.readObject();
			if (obj instanceof Student) {
				Student s2 = (Student)obj;
				System.out.println(s2.sum() + ":" + s2.avg());
			}else {
				System.out.println("Not");
			}
			oin.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
