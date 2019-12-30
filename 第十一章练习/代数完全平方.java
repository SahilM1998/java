package 程序作业11;

import java.util.Scanner;
public class 代数完全平方 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer m: ");
		int m,n=1;
		m = input.nextInt();
		int[] number = new int[100];
		int[] numbers = new int[100];
		int iC = m;
		int i,iCount=0;
		for(i=2;i<=m;i++) {
			while(m%i==0) {
				m = m/i;
				if(m!=1) {
					number[iCount++] = i;
					System.out.print(i+",");
				}else {
					number[iCount++] = i;
					System.out.println(i);
				}
			}
		}
		for(i = 0;i<iCount;i++) {
			int a = number[i];
			if(number[i]!=0) {
				for(int j = 0;j<iCount;j++) {
					if(number[i]==number[j]) {
						if(i!=j)number[j]=0;
						numbers[a]++;
					}
				}
				if(numbers[a]%2!=0) {
					n= n*a;
					System.out.println(n);
				}
			}
		}
		System.out.println("The smallest number n for m*n to be a perfect square is "+n);
		m = iC*n;
		System.out.println("m*n is "+m);
	}
}
