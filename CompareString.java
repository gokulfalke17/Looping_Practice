/*
4. Write a JAVA program to compare two strings
*/
import java.util.Scanner;
class CompareString {

	public static int compareString(String s1, String s2) {
		if(s1.length()==s2.length()) {
			int diff=0;
			for(int i=0;i<s1.length();i++) {
				if(s1.charAt(i)!=s2.charAt(i)) {
					diff = (int)s1.charAt(i)-(int)s2.charAt(i);
					break;
				}
			}
			return diff;
		} else {
			return -1;
		}
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//without inbuilt method
		System.out.println("Enter First String :: ");
		String s1 = scn.nextLine();

		System.out.println("Enter Second String :: ");
		String s2 = scn.nextLine();

		int compare = compareString(s1,s2);
		if(compare==0) {
			System.out.println("String Are Equals");
		}else{
			System.out.println("String Are Not Equals");
		}
		
		System.out.println("--------------------------------");

		//using inbuilt method
		System.out.println("With Inbuilt Method");
		String s3 = "abc";
		String s4 = "abc";

		int result = s3.compareTo(s4);

		if(result==0) {
			System.out.println("Strings Are Equals...");
		}else{
			System.out.println("Strings Are Not Equals...");
		}
	}
}