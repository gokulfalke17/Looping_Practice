/*
5. Write a JAVA program to convert lowercase string to uppercase.
*/

import java.util.Scanner;
class ConvertLwrToUpr {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter String :: ");
		String str = scn.nextLine();

		//without inbuilt method 
		String s="";
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);

			if(ch>=97 && ch<=122) {
				ch = (char)((int)ch-32);
			}
			s = s+ch; 
		}
		System.out.println("Upper Case  is (Without Using Inbuilt Method) :: "+ s);
		
		System.out.println("-----------------------------------------------------");

		//using inbuilt method
		System.out.println("Upper Case  is (Using Inbuilt Method) :: "+ str.toUpperCase());
	}
}