/*
29. Write a java program to find all prime factors of a number. 
*/
import java.util.*;
public class FindAllPrimeFactors_29 {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

		int num,i;
		System.out.println("Enter Number ");
		num = scn.nextInt();
		
		System.out.println("Prime Factors ");
		for(i=2;i<num;i++) {
			while(num%i==0) {
				System.out.println(i);
				num = num/i;
			}
		}
		if(num>2){
			System.out.println(num);
		}
	}
}
