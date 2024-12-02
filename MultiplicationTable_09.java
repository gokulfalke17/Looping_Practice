/*
9. Write a java program to print multiplication table of any number. 
*/

import java.util.*;
public class MultiplicationTable_09 {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int num,i;
		System.out.println("Enter Number ");
		num = scn.nextInt();

		System.out.println("Multiplication Table ");
		for(i=1;i<=10;i++) {
			System.out.printf("%d x %d = %d\n", num,i,num*i);
		}
	}
}