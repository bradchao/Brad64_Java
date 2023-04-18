package tw.org.iii.tutor;

public class Brad13 {

	public static void main(String[] args) {
		int i = 0;
		for (printBrad() ; i < 10; printLine()) {
			System.out.println(i++);
		}
	}
	
	static void printBrad() {
		int lottery = (int)(Math.random()*49+1);
		System.out.println("Brad" + lottery);
	}
	
	static void printLine() {
		System.out.println("----");
	}

}
