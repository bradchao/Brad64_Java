package tw.org.iii.tutor;

public class Brad11 {

	public static void main(String[] args) {
		int a = 13;
		int b = -2;
		System.out.println(a ^ b);
		
//		a = a ^ b;	// a = ?
//		b = a ^ b;	// 
//		a = a ^ b;
//		System.out.printf("a = %d; b = %d\n", a, b);
		
		a = a + b;	// a = 5
		b = a - b;	// b = 3
		a = a - b;	// a = 2
		System.out.printf("a = %d; b = %d\n", a, b);
		
				
	}

}
