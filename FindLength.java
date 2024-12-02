/*
1. Write a JAVA program to find length of a string.
*/

//without inbuilt method
import java.util.Scanner;
class FindLength {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter String :: ");
		String str = scn.nextLine();

		int count = 0;
		for(char c : str.toCharArray()) {
				count++;
		}

		System.out.println("Length of String is (Without Inbuilt Method) :: "+ count);
	
		//using Inbuilt method
		int length =  str.length();
		System.out.println("Length of String is (With Inbuilt Method) :: "+length);
	}
}