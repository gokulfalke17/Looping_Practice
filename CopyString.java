/*
2. Write a JAVA program to copy one string to another string.
*/

import java.util.Scanner;
class CopyString {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter String :: ");
		String str = scn.nextLine();

		String copy = str;
		System.out.println("Enter Copy String ::");
		str = scn.nextLine();

		System.out.println("Before Copy String :: "+ str);
		System.out.println("After Copy String :: "+ copy);

	}
}