package �����嵥7;

import java.util.Scanner;
import java.util.Arrays;
public class ���ַ����е��ַ����� {
	//7.34
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the string: ");
		Scanner input = new Scanner(System.in);
		String str = input.next(); 
		str=sort(str);
		System.out.println(str);
	}
	public static String sort(String s) {
		char[] chs = s.toCharArray();
		Arrays.sort(chs);
		String result = String.valueOf(chs);
		return result;
	}
}
