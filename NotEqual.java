import java.util.Scanner;

public class NotEqual {
	int i,j;
	void value()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number i:");
		i=scan.nextInt();
		System.out.println("enter the number j:");
		j=scan.nextInt();	
	}
	void process()
	{
		
		if(i!=j)
		{
			System.out.println(i+" condition not same");
		}
		else {
			System.out.println(j+" condition same");
		}
	}
}
