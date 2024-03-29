package tw.org.iii.myclasses;

import java.io.Serializable;

public class Student implements Serializable {
	private String name;
	private int ch, eng;
	private transient int math;
	private Bike bike;
	public Student(String name, int ch, int eng, int math) {
		this.name = name; this.ch = ch;
		this.eng = eng; this.math = math;
		bike = new Bike();
	}
	public int sum() {return ch+eng+math;}
	public double avg() {return sum() / 3.0; }
}
