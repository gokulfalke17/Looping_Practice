/*
5. Write a java program to print all odd number between 1 to 100. 
*/

import java.util.*;
public class AllOddNumbers_05 {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

		int num;
		System.out.println("Enter Number ");
		num = scn.nextInt();
		
		System.out.println("All Odd Numbers ");
		for(int i=1;i<=num;i++) {
			if(i%2!=0){
				System.out.println(i);
			}
		}
	}
}
