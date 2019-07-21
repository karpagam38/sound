import java.util.Scanner;

public class SquareCube {
	int n;
	Scanner scan=new Scanner(System.in);
	
	void display()
	{
	for(int i=1;i<9;i++)
	{
		n=(int) Math.pow(i,3);
		System.out.println(n);
	}

	
	}
	
}
