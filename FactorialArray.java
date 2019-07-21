import java.util.Scanner;

public class FactorialArray {
	private int[]elements=new int [10];
	private int[]factorial=new int [10];
	private int n;
	public void getelements()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter n value: ");
		n=scan.nextInt();
		for (int i=0;i<n;i++)
		{
			System.out.println("enter an element: ");
			elements[i]=scan.nextInt();
		}
	}
	public void findfactorialvalues()
	{
		//5!=1*2*3*4*5
		int fact=0;
		for(int j=0;j<=elements[0];j++)
		{
			fact=fact*j;
		}
		factorial[0]=fact;
		for(int k=0;k<n;k++)
		{
			fact=1;
					for (int j=1;j<=elements[k];j++)
					{
						fact=fact*j;
					}
			factorial[k]=fact;
		}
	}
	public void printarray()
	{
		System.out.println("array elements \t factorial value");
		System.out.println("=================================");
		for(int i=0;i<n;i++)
		{
			System.out.println(elements[i]+" "+factorial[i]);
			
		}
	}
		
	
}
