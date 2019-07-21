import java.util.Scanner;

public class ReverseArray {
	private int[]numbers=new int[10];
	private int[]reverse=new int[10];
	int n;
	public void getnumbers()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter n value: ");
		n=scan.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("enter an element: ");
			numbers[i]=scan.nextInt();
		}
	}
public void storeReverseOrder()
{
	int j=1;
	for(int i=0;i<n;i++) {
		reverse[n-j]=numbers[i];
		
		j++;
	}
	for (int i = 0; i<n; i++) {
	System.out.println(reverse[i]+" "+ numbers[i]);
} }
}
