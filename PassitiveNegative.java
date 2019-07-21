import java.util.Scanner;

public class PassitiveNegative {
	int i;
	Scanner scan=new Scanner(System.in);
	void getinput()
	{
		System.out.println("numer : ");
		i=scan.nextInt();
	}
	void value()
	{
		if(i<=0)
		{
			System.out.println(" negative value"+i);
		}
		else
		{
			System.out.println(i+" passitive value");
		}
	}

}
