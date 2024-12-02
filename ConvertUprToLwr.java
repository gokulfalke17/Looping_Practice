/*
6. Write a JAVA program to convert uppercase string to lowercase.
*/
import java.util.Scanner;
class ConvertUprToLwr {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	
		System.out.println("Enter String :: ");
		String str = scn.nextLine();

		//without inbuilt method
		String s = "";
		for(int i=0;i<str.length();i++) {
			
			char ch = str.charAt(i);
			if(ch>=65 && ch<=90) {
				ch = (char)((int)ch+32);
			}
			s = s+ch;
		}
		System.out.println("Lower Case is (Without Using Inbuilt Method) :: "+ s);

		System.out.println("-----------------------------------------------------");

		//with inbuilt method 
		System.out.println("Lower Case is (Using Inbuilt Method) :: "+ str.toLowerCase());
	}
}