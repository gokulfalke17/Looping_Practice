package gf.code_practice;

import java.util.Iterator;

public class RotateArrayNthPosition {
	public static void main(String[] args) {
		
		int arr[] = new int[] {1,2,3,4,5,6,7,8,};
		
		int index = 3;
		
		System.out.println();
		for(int i=0;i<index;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		System.out.println();
		for(int i=index;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		int j;
		
		for(int i=0;i<index;i++) {
			int temp = arr[0];
			for(j=0;j<arr.length-1;j++) {
				arr[j] = arr[j+1];
			}
			arr[j] = temp;
		}
		
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
