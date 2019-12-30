package 程序清单7;

import java.util.Scanner;
public class 打印不同的数 {

		//7.5
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[10];
		int[] newnumbers = new int[10];
		int i = 0,num=0,k = 0;
		System.out.print("Enter ten numbers: ");
		for(i = 0;i < 10;i++) {
			numbers[i] = input.nextInt();
		}
		
		for(i=0;i<10;i++) {
			for(int j=i;j<10;j++){
				if(numbers[i] == numbers[j]&&i!=j){
					numbers[j] = -1;
				}
			}
			if(numbers[i]!=-1) {
				num++;
				newnumbers[k] = numbers[i];
				k++;
			}
		}
		System.out.println("The number of distinc number is "+num);
		System.out.print("The distinc number are: ");
		for(i = 0;i<k;i++) {
			System.out.print(newnumbers[i]+" ");
		}
		System.out.println();
	}

}
