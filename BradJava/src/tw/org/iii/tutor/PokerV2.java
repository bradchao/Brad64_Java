package tw.org.iii.tutor;

public class PokerV2 {

	public static void main(String[] args) {
		int[] poker = shuffle();
		// 發牌
		
		int[][] players = new int[4][13];
		for (int i=0; i<poker.length; i++) {
			players[i%4][i/4] = poker[i];
		}
		
		
		
	}
	
	static int[] shuffle() {
		// 1. 洗牌
		int count = 52;
		int[] poker = new int[count];
		boolean isRepeat;
		int temp;
		for (int i=0; i<poker.length; i++) {
			do {
				temp = (int)(Math.random()*count);
				
				// 檢查機制
				isRepeat = false;
				for (int j=0; j<i; j++) {
					if (temp == poker[j]) {
						// 重複了
						isRepeat = true;
						break;
					}
				}
			}while (isRepeat);
			
			poker[i] = temp;
			System.out.println(poker[i]);
		}
		System.out.println("---");
		return poker;
	}
	
	
	

}
