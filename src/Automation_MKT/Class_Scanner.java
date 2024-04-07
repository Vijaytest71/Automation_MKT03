package Automation_MKT;

import java.util.Scanner;

public class Class_Scanner {

	Scanner s1 = new Scanner(System.in);
    int a = s1.nextInt(); // Global Variable
    int b = s1.nextInt(); // Global Variable
	
	public static void main (String[] args)
	{
		Class_Scanner scan = new Class_Scanner();
		
		scan.add();
		scan.sub();
		scan.multi();
		scan.div();

	}

	public void add()	
	{
		int c = a +b;
		System.out.println("Addition is:" + c);
	}
	
	public void sub()
	{
		int d = a - b;
		System.out.println("Substraction Is:" + d);
	}

	public void multi()
	{
		int e = a *b;
		System.out.println("Multiplication Is:" + e);
	}
	public void div()
	{
		int f = a/b;	
		System.out.println("Division Is:" + f);
	}

}
