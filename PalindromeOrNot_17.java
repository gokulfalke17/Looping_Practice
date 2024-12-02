/*
17. Write a java program to check whether a number is palindrome or not. 
*/

import java.util.*;
public class PalindromeOrNot_17 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

		int num;
		System.out.println("Enter Number ");
		num = scn.nextInt();

		int temp = num;
		int rev = 0;
		while(num!=0){
			int rem = num%10;
			rev = rev*10+rem;
			num = num/10; 
		}

		if(temp==rev) {
			System.out.println("It is Palindrome");
		}else{
			System.out.println("It is Not Palindrome");
		}
	}
}