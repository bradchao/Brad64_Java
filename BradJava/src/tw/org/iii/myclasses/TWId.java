package tw.org.iii.myclasses;

public class TWId {
	private String id;
	public TWId() {
		
	}
	public TWId(boolean isMale) {
		
	}
	public TWId(int area) {
		
	}
	public TWId(boolean isMale, int area) {
		
	}
	private TWId(String myid) {
		
	}
	
	public static boolean checkId(String id) {
		// 1. len = 10
		// 2. c1 => A-Z
		// 3. c2 => 1, 2
		// 4. c3-10 => 0 - 9
		boolean isRight = false;
		if (id.matches("[A-Z][1289][0-9]{8}")) {
			
		}
		
		return isRight;
	}
	
	
	
}
