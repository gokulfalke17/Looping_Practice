/*
4. Write a java program to print all even numbers between 1 to 100. - using while loop 
*/

import java.util.*;
public class AllEvenNumbers_04 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

		int num;

		System.out.println("Enter Number ");
		num = scn.nextInt();
		
		System.out.println("Even Numbers ");
		for(int i=1;i<=num;i++){
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
}
