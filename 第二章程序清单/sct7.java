package ≥Ã–Ú«Âµ•2;

public class sct7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long totalMilliseconds=System.currentTimeMillis();
		
		long totalSeconds=totalMilliseconds/1000;
		long currentSeconds=totalSeconds%60;
		
		long totalMins=totalSeconds/60;
		long currentMins=totalMins%60;
		
		long totalHours=totalMins/60;
		long currentHours=totalHours%24;
		
		System.out.println("Current time is "+currentHours+":"+currentMins+":"+currentSeconds);
	}

}
