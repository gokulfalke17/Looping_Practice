/*
11.Write a JAVA program to find reverse of a string.
*/

import java.util.Scanner;
class ReverseString {
	public static void main(String[] args) {

		//by using inbuilt method
		StringBuffer sb = new StringBuffer("gokul");

		System.out.println("Before Reverse String :: "+sb);
		sb = sb.reverse();
		System.out.println("After Reverse String :: "+sb);
		System.out.println();
		//------------------------------------------------------------------------------

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter String :: ");
		String str =scn.nextLine();



		String rev = "";
		for(int i=str.length()-1;i>=0;i--) {
			rev = rev+str.charAt(i);
		}
		
		System.out.println("Before Reverse String :: "+rev);
	}
}