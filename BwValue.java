import java.util.Scanner;

public class BwValue {
int i;
Scanner scan=new Scanner(System.in);
	  void value() { 
	  System.out.println("num : "); 
	  i=scan.nextInt();
	  }
	

void process()
{
	if(i>=10&&i<=20)
		{
		System.out.println(i+" valid");
		}
	else
		{
		System.out.println(i+" non valid");
		}
}
}