package 程序清单7;

import java.util.Scanner;
import java.util.Arrays;
public class 计算数字的出现次数 {

		//7.3
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the integers between 1 and 100: ");

		int[] numbers = new int[100];
		int i = 0;
		int number,fre =0;
		while(i >=0) {
			number = input.nextInt();
			if(number != 0) {
				numbers[i] =number;
				i++;
				fre++;
			}else {
				break;
			}
	    }
		
		int k = 0;
		int[] newnumbers = new int[fre];
		for(int j = 0;j<numbers.length;j++) {
			if(numbers[j] != 0&&k<fre) {
				newnumbers[k] = numbers[j];
				k++;
			}
		}
		Arrays.sort(newnumbers);

		 for (int j = 0; j < fre; j++) {
		        if (j==0 ||(newnumbers[j] != newnumbers[j - 1])) {
		            System.out.println(newnumbers[j] + " occurs " + getCount(newnumbers[j], newnumbers,fre) + " times");
		        }
		    }

	}

	public static int getCount(int indexNum, int[] num,int fre) {
    int count = 0;
    for (int i = 0; i < fre; i++) {
        if (indexNum == num[i]) {
            count++;
        }
    }
    return count;
}
}
