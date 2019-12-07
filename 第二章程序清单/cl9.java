package ≥Ã–Ú«Âµ•2;

import java.util.Scanner;

public class cl9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter annual interest rate, e.g., 5.75%: ");
		double annualInterest=input.nextDouble();
		
		System.out.print("Enter number of years as an integer, e.g., 5: ");
		double years=input.nextDouble();
		
		System.out.print("Enter loan amount, e.g., 120000.95: ");
		double loanAmount=input.nextDouble();
		
		double monthInterest=annualInterest/1200;
		double monthlyPayment=loanAmount*monthInterest/(1-1/Math.pow(1+monthInterest, years*12));
		double totalPayment=monthlyPayment*12*years;
		
		System.out.println("The monthly payment is $ "+(int)(monthlyPayment*100)/100.0);
		System.out.println("The total payment is $ "+(int)(totalPayment*100)/100.0);
	}

}
