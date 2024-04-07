package Automation_MKT;

public class minumum_value {

	public static void main(String[] args) {

		int arr[][] = {{3,4,6},{8,9,1},{2,9,7}};
		int min =arr[0][0];
		int max = arr[0][0];

		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				if(arr[i][j] < min)
				{
					min = arr[i][j];
				}
			}
		}
		for(int i=0; i<3 ;i++)
		{
			for(int j =0; j<3; j++)
			{
				if(arr[i][j]>max)
				{
					max = arr[i][j];
				}
			}
		}
		System.out.println("Min number is:" + min);
		System.out.println("Max number is" + max);
	}

}
