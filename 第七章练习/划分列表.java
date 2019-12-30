package 程序清单7;

import java.util.Scanner;
public class 划分列表 {
 
	//7.32
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the list: ");
		int number = input.nextInt();
		int[] numbers = new int[number];
		for(int i = 0;i<numbers.length;i++) {
			numbers[i] = input.nextInt();
		}
		partition(numbers,0,numbers.length-1);
		System.out.println("After the partition,the list is: ");
		for(int i = 0;i<numbers.length;i++) {
			System.out.print(numbers[i]+" ");
		}
		
	}
	public static void partition(int[] list,int left,int right){
		if(left>=right){
		    return;
		}
		int i = left,j = right;
		int key = list[i];
		while(i<j){
			while(i<j&&key<=list[j]){
				j--;
			}
			list[i] = list[j];
			while(i<j&&key>=list[i]){
				i++;
			}
			list[j] = list[i];
		}
		list[i] = key;
		partition(list,left,i-1);
		partition(list,i+1,right); 
  }
}
