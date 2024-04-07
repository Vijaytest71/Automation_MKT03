package Automation_MKT;

public class Array_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum =0;
		int arr[] = {10, 5, 12,6,9,15};
		for(int i = 0;i<arr.length ; i++)
		{
			System.out.print("Array Value is:" + arr[i]);
			sum = sum + arr[i];

		}
		System.out.println("Sum of Array is : " + sum);
	}

}
