package Automation_MKT;

abstract class Facebook_Class
{
	void add()//concreate method 1
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	static void subtract()//concreate method 2
	{
		System.out.println(Math.subtractExact(10, 20));
	}
	abstract void multiple();// abstract method 1
	abstract void divide();//abstract method 2
}
public class Abstact_class extends  Facebook_Class
{
	void modulus()
	{

	}

	public static void main(String[] args) {

		Abstact_class ab1 = new Abstact_class();
		ab1.multiple();
		ab1.divide();
		ab1.add();
		ab1.subtract();
	}
	@Override
	void multiple() {
		System.out.println("Multiple");
		
	}
	@Override
	void divide() {
		System.out.println("Divide");
		
	}

}

