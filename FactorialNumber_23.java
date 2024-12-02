/*
23. Write a java program to calculate factorial of a number. 
*/
import java.util.*;
public class FactorialNumber_23 {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

		int num,i;
		int fact = 1;

		System.out.println("Enter Number ");
		num = scn.nextInt();

		for(i=1;i<=num;i++) {
			fact = fact*i;
		}

		System.out.println("Factorials "+ fact);
	}
}