package ≥Ã–Ú«Âµ•9;

import java.util.Scanner;
public class ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows and columns in the array: ");
		int rows = input.nextInt();
		int columns = input.nextInt();
		
		double[][] array = new double[rows][columns]; 
		System.out.println("Enter the array: ");
		for(int i = 0;i<rows;i++) {
			for(int j = 0;j<columns;j++) {
				array[i][j] = input.nextDouble();
			}
		}
		
		Location MAX = locateLargest(array);
		System.out.println("The location of the largest element is "+MAX.maxValue+" at "+"("+MAX.row+", "+MAX.column+")");
	}
	
	public static Location locateLargest(double[][] a) {
		Location MaxLocation = new Location();
		MaxLocation.column = 0;
		MaxLocation.row = 0;
		MaxLocation.maxValue = a[0][0];
		
		for(int row=0;row<a.length;row++) {
			for(int column=0;column<a[1].length;column++) {
				if(MaxLocation.maxValue<a[row][column]) {
					MaxLocation.maxValue = a[row][column];
					MaxLocation.row = row;
					MaxLocation.column = column;
				}
			}
		}
		return 	MaxLocation;
	}

}
