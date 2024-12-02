/*
21. Write a java program to find power of a number using for loop. 
*/

import java.util.*;
public class FindPower_21 {
	
	public static void main(String[] agrs) {
		
		Scanner scn = new Scanner(System.in);

		int base,index;
		int i,pow=1;

		System.out.println("Enter Base and Index ");
		base = scn.nextInt();
		index = scn.nextInt();

		for(i=0;i<index;i++){
			pow = pow*base;
		}
		System.out.println("Power "+pow);
	}
}