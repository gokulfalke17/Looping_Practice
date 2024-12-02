/*
8. Write a JAVA program to find total number of alphabets, digits or special character in a string.
*/
import java.util.Scanner;
class CountAlphabetsSymbolsNumbersInString {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter String :: ");
		String str = scn.nextLine();

		int alphaCount = 0;
		int symbolCount = 0;
		int numCount = 0;

		for(int i=0;i<str.length();i++) {
			
			char ch = str.charAt(i);
			if(ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
				alphaCount++;
			}else if(ch>='0' && ch<='9') {
				numCount++;
			}else {
				symbolCount++;
			}
		}
		System.out.println("Alphabets Count is :: "+alphaCount);
		System.out.println("Special Character Count is :: "+symbolCount);
		System.out.println("Number Count is :: "+numCount);
	}
}