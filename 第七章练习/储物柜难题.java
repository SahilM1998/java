package 程序清单7;

public class 储物柜难题 {
	
	//7.23
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean[] cabinets = new boolean[100];
		for(int i = 0;i<100;i++) {
			cabinets[i] = false;
		}
		
		for(int m = 1;m<=100;m++) {
			for(int n = m ; n<=100;n+=m) {
				cabinets[n-1] = !cabinets[n-1];
			}
		}
		for(int i = 0;i<100;i++) {
			if(cabinets[i]) {
				System.out.println(i+1+" ");
			}
		}
	}

}
