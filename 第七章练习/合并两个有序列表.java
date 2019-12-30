package 程序清单7;

import java.util.Arrays;
import java.util.Scanner;
public class 合并两个有序列表 {
	
	//7.31
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number1,number2;
		
		System.out.print("Enter list1: ");
		number1 = input.nextInt();
		int[] list1 = new int[number1];
		for(int i = 0;i<list1.length;i++) {
			list1[i] = input.nextInt();
		}
		
		System.out.print("Enter list2: ");
		number2 = input.nextInt();
		int[] list2 = new int[number2];
		for(int i = 0;i<list2.length;i++) {
			list2[i] = input.nextInt();
		}
		
		System.out.print("The merge list is: ");
		for(int i = 0;i<list1.length+list2.length;i++) {
			System.out.print(merge(list1,list2)[i]+" ");
		}
		System.out.println();
	}
	
	public static int[] merge(int[] list1,int[] list2) {
		int[] newList = new int[list1.length+list2.length];
		System.arraycopy(list1,0,newList,0, list1.length);
		System.arraycopy(list2,0,newList,list1.length, list2.length);
		Arrays.sort(newList);
		return newList;
	}

}
