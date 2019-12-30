package ≥Ã–Ú«Âµ•7;

import java.util.Scanner;
public class √∞≈›≈≈–Ú {

		//7.18
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double[] numbers = new double[10];
		System.out.print("Enter the numbers: ");
		for(int i = 0;i < 10;i++) {
			numbers[i] = input.nextDouble();
		}
		
		for(int i = 0;i < 10;i++) {
			for(int j = i;j<10;j++) {
				if(numbers[i] > numbers[j]) {
					double temp = numbers[j];
					numbers[j] = numbers[i];
					numbers[i] = temp;
				}
			}
		}
		
		for(int i = 0;i<10;i++) {
			System.out.print(numbers[i]+" ");
		}
		System.out.println();
	}

}
