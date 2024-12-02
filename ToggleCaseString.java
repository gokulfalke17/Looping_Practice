/*
7. Write a JAVA program to toggle case of each character of a string.
*/
import java.util.Scanner;
class ToggleCaseString {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter String :: ");
		String str = scn.nextLine();
		
		String s = "";
		for(int i=0;i<str.length();i++) {
			
			char ch = str.charAt(i);
			if(ch>=65 && ch<=90) {
				ch = (char)((int)ch+32);
			}else if(ch>=97 && ch<=122){
				ch = (char)((int)ch-32);
			}
			s = s+ch;
		}
		System.out.println("Toggle Case is :: "+s);
	}
}