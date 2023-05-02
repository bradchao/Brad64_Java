package tw.org.iii.tutor;

public class Brad72 {
	public static void main(String[] args) {
		Brad721 obj1 = new Brad721("A");
		Brad721 obj2 = new Brad721("B");
		Brad722 obj3 = new Brad722("C");
		Thread t1 = new Thread(obj3);
		
		obj1.start(); obj2.start(); t1.start();
		System.out.println("main");
	}
}
class Brad721 extends Thread {
	String name;
	Brad721(String name){
		this.name = name;
	}
	@Override
	public void run() {
		for (int i=0; i<10; i++) {
			System.out.println(name + "." + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}
	}
}

class Brad722 implements Runnable {
	String name;
	Brad722(String name){
		this.name = name;
	}
	@Override
	public void run() {
		for (int i=0; i<10; i++) {
			System.out.println(name + "." + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}
	}
}
