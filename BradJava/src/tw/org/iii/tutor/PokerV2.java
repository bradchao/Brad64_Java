package tw.org.iii.tutor;

public class PokerV2 {

	public static void main(String[] args) {
		int[] poker = shuffle(52);
		// 發牌
		
		int[][] players = new int[4][13];
		for (int i=0; i<poker.length; i++) {
			players[i%4][i/4] = poker[i];
		}
		
		for (int[] player : players) {
			for (int card : player) {
				System.out.print(card + " ");
			}
			System.out.println();
		}
		
	}
	
	static int[] shuffle(int num) {
		// 1. 洗牌
		int count = num;
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
			//System.out.println(poker[i]);
		}
		//System.out.println("---");
		return poker;
	}
	
	
	

}
