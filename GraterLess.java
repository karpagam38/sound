import java.util.Scanner;

public class GraterLess {
	int i;
	void get()
	{
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the i value");
		i=scan.nextInt();}
	void call()
	{
		if(i<50)
		{
			System.out.println("less 50");
		}
		else
		{
		System.out.println("greter then 50");
		}
	}
		
	

}
