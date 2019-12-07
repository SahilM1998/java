package ≥Ã–Ú«Âµ•2;

import java.util.Scanner;
public class dt5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number for seconds: ");		
		int seconds=input.nextInt();
		
		int mins=seconds/60;
		int remainingSeconds=seconds%60;
		System.out.println(seconds+" seconds is "+mins+" minutes and "+remainingSeconds+" seconds");
	}

}
