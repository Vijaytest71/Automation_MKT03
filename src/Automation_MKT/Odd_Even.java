package Automation_MKT;

import java.util.Scanner;

public class Odd_Even {

	public static void Check_Odd_Even_using_for_loop()
	{
		for(int i =0 ; i<=10 ; i++)
		{
			// It will print Even number if int = 0 & will print odd number if int = 1
			
			System.out.println("It is Even Number" + i ); 
			i++;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Check_Odd_Even_using_for_loop();
		for(int i=1 ; i<=10 ; i++) 
		{
			System.out.println("Please Enter any number to check it is weather Odd or Ever");
			Scanner s1 = new Scanner(System.in);
			int number = s1.nextInt();

			if(number % 2 == 0)
			{
				System.out.println("It is Even Number");
			}
			else {
				System.out.println("It is Odd Number");
			}
		}
	}
}
