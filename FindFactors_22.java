/*
22. Write a java program to find all factors of a number. 
*/

import java.util.*;
public class FindFactors_22 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

		int num,i;
		System.out.println("Enter Number ");
		num = scn.nextInt();

		System.out.println("Factor are ");
		for(i=1;i<=num;i++){
			
			if(num%i==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
}