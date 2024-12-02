/*
9. Write a JAVA program to count total number of vowels and consonants in a string.
*/
import java.util.Scanner;
class countVowelsConsonentsInString {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter String :: ");
		String str = scn.nextLine();
		
		int vowelsCount = 0;
		int consonentCount = 0;
		for(int i=0;i<str.length();i++) {
			
			char ch = str.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
				vowelsCount++;
			}else {
				consonentCount++;
			}
		}
		System.out.println("Vowels Count is :: "+vowelsCount);
		System.out.println("Consonents Count is :: "+consonentCount);
	}
}