package tw.org.iii.tutor;

import tw.org.iii.myclasses.Bike;

public class Brad33 {
	public static void main(String[] args) {
		int a = 10;
		Integer b = new Integer(10);
		Integer c = new Integer("10");
		Integer d = Integer.parseInt("10");
		Integer e = 12;	// auto-boxing
		System.out.println(e.doubleValue());
		
		Bike b1 = new Bike();
		Bike b2 = new Bike();
		System.out.println(b + e); // b, c=> auto-unboxing
		
		
		
	}
}
