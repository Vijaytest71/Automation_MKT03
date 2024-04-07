package Automation_MKT;

import java.util.Scanner;

public class Array_scanner_class {

	public static void main(String[] args) {

		// get sum of array 

		System.out.println("Please Enter");
		Scanner s1 =  new Scanner(System.in);
		int n = s1.nextInt();

		int[] a  = new int[n];
		
		for(int i=0; i<n ; i++)
		{
			
			a[i]= s1.nextInt();
			//sum = sum +arr[i];


			System.out.print("array is" + a[i]);	//System.out.println("Array Is" + stringtochar);
		}
	}

}
