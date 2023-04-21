package tw.org.iii.tutor;

public class Brad28 {

	public static void main(String[] args) {
		//Brad281 obj1 = new Brad281(2);
		//Brad282 obj2 = new Brad282();
		Brad283 obj3 = new Brad283();
	}

}
class Brad281 extends Object{
	Brad281(int a){
		// super();
		System.out.println("Brad281(int)");
	}
}
class Brad282 extends Brad281 {
	Brad282(){
		// super();
		super(3);
		System.out.println("Brad282()");
	}
}
class Brad283 extends Brad282 {
	Brad283(){
		System.out.println("Brad283()");
	}
}
