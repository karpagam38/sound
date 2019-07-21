import java.util.Scanner;

public class ThreeVari {
	int a,b,c;
	Scanner scan=new Scanner(System.in);
	void getinput()
	{
		System.out.println("enter a value: ");
		a=scan.nextInt();
		System.out.println("enter b value: ");
		b=scan.nextInt();
		System.out.println("enter c value: ");
		c=scan.nextInt();
		
	}
	void process()
	{
		if(a>=b&&a>=c)
		{
			System.out.println(a+" A value is less then compare to a&c");
		}
		else if(b>=a&&b>=c)
		{
		System.out.println(b+" B value is grater than compare to a&c ");	
		}
		else
		{
			System.out.println(c+" C value is grater value compare to b&c");
		}
	}

}
