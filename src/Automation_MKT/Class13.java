package Automation_MKT;

import java.util.Scanner;

public class Class13 {

	public static void main(String[] args) {

		check_Function();


	}

	public static void check_Function() 
	{
		Scanner s1 = new Scanner(System.in);
		int num = s1.nextInt();

		for(int i=1; i<num; i++)
		{
			if(i%2 == 0)
			{
				System.out.println("It is Even Number");
			}
			else
			{
				System.out.println("It is Odd Number"); 
			}
			System.out.println(i);
		}
		s1.close();
	}
}
