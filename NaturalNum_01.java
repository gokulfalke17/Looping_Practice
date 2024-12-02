/*
1. Write a java program to print all natural numbers from 1 to n. - using while loop 
*/

import java.util.*;
public class NaturalNum_01 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

		int num;

		System.out.println("Enter Number ");
		num= scn.nextInt();

		System.out.println("Natural Numbers ");
		for(int i=1;i<=num;i++) {
			System.out.println(i);
		}
	}
}
