package Automation_MKT;

import java.util.ArrayList;
import java.util.Collections;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList a1 = new ArrayList();
		a1.add(807);
		a1.add(123);
		a1.add("Vikramaditya");
		a1.add(86.65);
		a1.add(true);
		a1.add(-25);
		System.out.println(a1);

		ArrayList a2 =  new ArrayList();

		a2.add(982);
		a2.add(84);
		a2.add(95);
		a2.add(-25);
		Collections.sort(a2);;
System.out.println("After Sorting" + a2);
	}
}
