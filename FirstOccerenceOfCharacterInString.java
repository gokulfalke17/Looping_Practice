/*
14.Write a JAVA program to find first occurrence of a character in a given string.
*/
import java.util.Scanner;
class FirstOccerenceOfCharacterInString {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter String :: ");
		String str = scn.nextLine();

		System.out.println("Enter Character for Search :: ");
		char ch = scn.next().charAt(0);

		int index = myFirstOcc(str, ch);
		if(index!=-1) {
			System.out.println("First Occurence Found Index is :: "+ index);
		}else {
			System.out.println("Not Found");
		}
	}
	
	public static int myFirstOcc(String str, char ch) {
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch) {
				return i;
			}
		}
		return -1;
	}
}