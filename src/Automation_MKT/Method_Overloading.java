package Automation_MKT;

public class Method_Overloading {


	void add()
	{

	}

	void add(int a, double b)
	{
		System.out.println(a + b);	
	}

	static void add(String a, int b, double c)
	{
		System.out.println("My name is" + a + "My Age is" + b + "My salary is" + c);
	}
	public static void main(String[] args) {
		add("Vijay",30,2165.95);

		Method_Overloading m1 = new Method_Overloading();
		m1.add(5, 100);

	}

}
