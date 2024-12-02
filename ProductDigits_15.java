/*
15. Write a java program to calculate product of digits of a number. 

input
12345
output
120  //5*4*3*2*1=120
*/

import java.util.*;
public class ProductDigits_15 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num, temp;
        int mul = 1;

        System.out.println("Enter Number ");
        num = scanner.nextInt();

		while(num!=0) {
			int rem = num%10;
			mul = mul*rem;
			num = num/10;
		}


        System.out.println("Product of Digits "+ mul);
    }
}