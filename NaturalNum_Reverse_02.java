/*
2. Write a java program to print all natural numbers in reverse (from n to 1). - using while loop 
*/

import java.util.*;
public class NaturalNum_Reverse_02 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

		int num,i;
		System.out.println("Enter Number ");
		num = scn.nextInt();

		System.out.println("Natural Numbers in Reverse ");
		for(i=num;i>=1;i--) {
			System.out.println(i);
		}
	}
}
