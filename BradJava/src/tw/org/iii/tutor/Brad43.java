package tw.org.iii.tutor;

public class Brad43 {
	public static void main(String[] args) {
		Bird b1 = new Bird();
		try {
			b1.setLeg(3);
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println("Error");
		}
	}
}

class Bird {
	private int leg;
	void setLeg(int leg) throws Exception {
		if (leg >= 0 && leg <= 2) {
			this.leg = leg;
		}else {
			throw new Exception();
		}
	}
}
