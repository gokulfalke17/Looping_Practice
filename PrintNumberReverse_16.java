/*
16. Write a java program to enter a number and print its reverse. 
*/

import java.util.Scanner;
public class PrintNumberReverse_16 {

	public static void main(String[] args){
		
		Scanner scn = new Scanner(System.in);

		int num,rem,rev=0;
		System.out.println("Enter Number ");
		num = scn.nextInt(); //1234

		while(num!=0){ //1234!=0 123!=0 12 1!=0
			rem = num%10;  //1234%10-->123 123%10-->12 12%10=1 1%10=0
			rev = rev*10+rem; //0*10+123-->123 0*10+12 0*10+1 0*10+1
			num = num/10; //123 12 1 1
		}

		System.out.println("Reverse Number "+rev); //4 3 2 1
	}
}