/*
15.Write a JAVA program to find last occurrence of a character in a given string.
*/
import java.util.Scanner;
class LastOccerenceOfCharacterInString{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter String :: ");
		String str = scn.nextLine();

		System.out.println("Enter Character For Search ::  ");
		char ch = scn.next().charAt(0);

		int index = myLastOcc(str, ch);
		if(index!=-1) {
			System.out.println("Last Occurence Found Index is :: "+ index);
		}else {
			System.out.println("Not Found");
		}
	}

	public static  int myLastOcc(String str, char ch) {
		for(int i=str.length()-1;i>=0;i--) {
			if(str.charAt(i)==ch) {
				return i;
			}
		}
		return -1;
	}

}