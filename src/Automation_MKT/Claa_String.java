package Automation_MKT;

import java.util.Scanner;

public class Claa_String {

	public static void main(String[] args) {

		System.out.println("Enter Name which you wanna Reverse");
	Scanner s1 = new Scanner(System.in);
	String name = s1.next();
	
	String rev="";
	
	for(int i = name.length()-1; i>=0; i--)
	{
	rev = rev + name.charAt(i);	
		
	}
	System.out.println("Rev is " + rev);
	}
}
