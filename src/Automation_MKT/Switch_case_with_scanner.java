package Automation_MKT;

import java.util.Scanner;

public class Switch_case_with_scanner {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please enter number");

		Scanner s1 = new Scanner(System.in);
		int number = s1.nextInt();

		switch(number)
		{

		case 1:
			System.out.println("Case 1");
			break;

		case 2:
			System.out.println("Case 2");
			break;

		case 3:
			System.out.println("case 3");
			break;

		default:
			System.out.println("Entered number is Invalid");
		}
		
		s1.close();
	}

}
