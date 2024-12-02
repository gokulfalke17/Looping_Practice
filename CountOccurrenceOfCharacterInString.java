/*
17.Write a JAVA program to count occurrences of a character in given string.
*/
import java.util.Scanner;
class CountOccurrenceOfCharacterInString {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter String :: ");
		String str = scn.nextLine();

		System.out.println("Enter Character For Search :: ");
		char ch = scn.next().charAt(0);
		
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == ch) {
				++count;
			}
		}
		System.out.println("Character Count is :: "+count);
	}
}