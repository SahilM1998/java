package ≥Ã–Ú«Âµ•7;

public class TestPassArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2};
		System.out.println("Before invoking swap");
		System.out.println("array if {"+a[0]+", "+a[1]+"}");
		swap(a[0],a[1]);
		System.out.println("After invoking swap");
		System.out.println("array if {"+a[0]+", "+a[1]+"}");
		
		System.out.println("Before invoking swapInarray");
		System.out.println("array if {"+a[0]+", "+a[1]+"}");
		swapInarray(a);
		System.out.println("After invoking swapInarray");
		System.out.println("array if {"+a[0]+", "+a[1]+"}");	
		
	}
	
	public static void swap(int n1,int n2) {
		int temp = n1;
		n1=n2;
		n2=temp;
	}
	
	public static void swapInarray(int[] array) {
		int temp = array[0];
		array[0] = array[1];
		array[1] = temp;
	}
}
