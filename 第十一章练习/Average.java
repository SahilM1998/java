package ³ÌÐò×÷Òµ11;

import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int iCount=0,positives=0,negatives=0,a;
		double average,total=0;
		System.out.print("Enter an integer,the input end if it is 0: ");
		do {
			a = input.nextInt();
			if(a>0) {
				positives++;
				total += a;
			}if (a<0){
				negatives++;
				total +=a;
			}
		}while(a!=0);
		average = total/(positives+negatives);
		System.out.println("The number of positives is "+positives);
		System.out.println("The number of negitives is "+negatives);
		System.out.println("The total is "+total);
		System.out.println("The average is "+average);

	}

}
