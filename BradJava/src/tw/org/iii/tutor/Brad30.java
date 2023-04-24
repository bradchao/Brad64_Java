package tw.org.iii.tutor;

public class Brad30 {
	public static void main(String[] args) {
		//Brad301 obj1 = new Brad301();
		Brad301 obj2 = new Brad302();
		Brad301 obj3 = new Brad303();
		obj2.m2();
		obj3.m2();
	}
}
abstract class Brad301 {
	Brad301(int a){
		System.out.println("Brad301()");
	}
	void m1() {System.out.println("Brad301:m1()");}
	abstract void m2();
}
class Brad302 extends Brad301{
	Brad302(){
		super(2);
		System.out.println("Brad302()");
	}
	void m2() {System.out.println("Brad302:m2()");}
}
class Brad303 extends Brad301{
	Brad303(){
		super(3);
		System.out.println("Brad302()");
	}
	void m2() {System.out.println("Brad303:m2()");}
}



