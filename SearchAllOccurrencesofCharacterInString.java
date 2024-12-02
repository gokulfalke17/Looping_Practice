/*
16.Write a JAVA program to search all occurrences of a character in given string.
*/
import java.util.Scanner;
class SearchAllOccurrencesofCharacterInString {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter String :: ");
		String str = scn.nextLine();

		System.out.println("Enter Character For Search :: ");
		char ch = scn.next().charAt(0);
		
		System.out.println("Occurrences of All Search Character is :: ");
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == ch) {
				System.out.println(ch+"--->"+i);
			}
		}
	}
}
