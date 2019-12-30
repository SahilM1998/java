package 程序作业11;

import java.util.Scanner;
public class 加法测试 {
	public static void main(String[] args) {
		int number1 = (int)(Math.random()*10);
		int number2 = (int)(Math.random()*10);
		int[] number = new int[100];
		Scanner input = new Scanner(System.in);
		System.out.print("What is "+number1+" + "+number2+"? ");
		int answer  = input.nextInt();
		int iCount=0;
		while(number1+number2!=answer) {
			number[iCount++] =answer;
			System.out.println("Wrong ansewr.Try again. What is "+number1+" + "+number2+"? ");
			for(int i = 0;i<iCount-1;i++) {
				if(answer==number[i]) {
					System.out.println("You already entered "+number[i]);
				}
			}
			answer = input.nextInt();
		}
		System.out.println("You got it");
	}
}
