package 程序清单7;

public class 优惠券收集人问题 {

		//7.24
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		boolean flag = false;
		boolean[] card = new boolean[4];
		
		while(!flag) {
			if(card[0]&&card[1]&&card[2]&&card[3]) {
				flag = true;
			}else {
				switch(chooseCard(card)) {
				case "Spades":
					card[0] = true;
					break;
				case "Hearts":
					card[1] = true;
					break;
				case "Diamonds":
					card[2] = true;
					break;
				case "Clubs":
					card[3] = true;
				}
				count++;
			}
		}
		System.out.println("Number of picks: "+count);
	}
	
	public static String chooseCard(boolean[]card) {
		int[] deck = new int[52];
		String[] suits = {"Spades","Hearts","Diamonds","Clubs"};
		String[] ranks = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		
		for(int i=0;i<deck.length;i++) {
			deck[i]=i;
		}
		for(int i=0;i<deck.length;i++) {
			int index = (int)(Math.random()*deck.length);
			int temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}
		
		    int i = (int)Math.random()*deck.length;
			String suit = suits[deck[i]/13];
			String rank = ranks[deck[i]%13];
			
			switch(suit) {
			case "Spades":
				if(!card[0]) {
					System.out.println(rank+" of "+suit);
					card[0] = true;
				}
				break;
			case "Hearts":
				if(!card[1]) {
					System.out.println(rank+" of "+suit);
					card[1] = true;
				}
				break;
			case "Diamonds":
				if(!card[2]) {
					System.out.println(rank+" of "+suit);
					card[2] = true;
				}
				break;
			case "Clubs":
				if(!card[3]) {
					System.out.println(rank+" of "+suit);
					card[3] = true;
				}
				break;
			}
			
			return suit;
	}

}
