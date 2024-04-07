package Automation_MKT;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		System.out.println("Please Enter Name");
		Scanner s1 = new Scanner(System.in);
		String name = s1.next();
		
		int len = name.length();
		String Rev = "";

		for(int i= len-1; i>=0; i--)
		{
			Rev = Rev + name.charAt(i);
		}
		System.out.println("String Is: " + name + "& Reverse string is " + Rev);
	if(name.equals(Rev))
	{
		System.out.println("This is Palindrom Number");
	}
	else
	{
		System.out.println("This is not Palindrom Number");
	}
	}
	

}
