/*
10.Write a JAVA program to count total number of words in a string.
*/
import java.util.Scanner;
class CountWordInString {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter String :: ");
		String str = scn.nextLine();

		int count = 1;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println("Number of Word in String is :: "+count);
	}
}