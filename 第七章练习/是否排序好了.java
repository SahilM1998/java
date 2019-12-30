package 程序清单7;

import java.util.Scanner;
import java.util.Arrays;
public class 是否排序好了 {

		//7.19
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter list: ");
		int total = input.nextInt();
		int[] numbers = new int[total];
		for(int i = 0;i<total;i++) {
			numbers[i] = input.nextInt();
		}
		int[] newnumbers = new int[numbers.length];
		System.arraycopy(numbers,0,newnumbers,0,numbers.length);
		Arrays.sort(newnumbers);
		
		if(Arrays.equals(numbers, newnumbers)) {
			System.out.println("The list is already sorted");
		}else {
			System.out.println("The list is not sorted");
		}
	}
}
