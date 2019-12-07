package ≥Ã–Ú«Âµ•2;

import java.util.Scanner;

public class st8 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter purchase amount: ");
		double purchase=input.nextDouble();
		
		double tax=purchase*0.06;
		System.out.println("Sales tax is $ "+(int)(tax*100)/100.0);
	}

}
