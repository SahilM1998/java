package 程序清单7;

import java.util.Scanner;
public class 对学生排序 {

		//7.17
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int StuNum = input.nextInt();
		
		String[] names = new String[StuNum];
		double[] grades = new double[StuNum];
		
		for(int i = 0; i < StuNum; i++) {
			System.out.print("Enter the name: ");
			names[i]= input.next();
			System.out.print("Enter the grades: ");
			grades[i] = input.nextDouble();
		}
		
		for(int i = 0;i<StuNum;i++) {
			for(int j = i;j<StuNum;j++) {
				if(grades[i]<grades[j]) {
					double temp = grades[j];
					grades[j] = grades[i];
					grades[i] =temp;
					
					String itemp = names[j];
					names[j] = names[i];
					names[i] = itemp;
				}
			}
		}
		
		System.out.print("Descending order of names: ");
		for(int i = 0;i<StuNum;i++) {
			System.out.print(names[i]+" ");
		}
		System.out.println();
	}

}
