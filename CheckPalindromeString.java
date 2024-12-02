/*
12. Write a JAVA program to check whether a string is palindrome or not.
*/
import java.util.Scanner;
class CheckPalindromeString {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter String :: ");
		String str = scn.nextLine();

		String rev = "";
		for(int i=str.length()-1;i>=0;i--) {
			rev = rev+str.charAt(i);
		}
		System.out.println("Reverse String is :: "+rev);

		if(str.equals(rev)) {
			System.out.println("Is Palindrome String");
		}else {
			System.out.println("Is Not Palindrome String");
		}
	}
}