import java.util.Scanner;

public class Vote {
	int i;
	Scanner scan=new Scanner(System.in);
void getinput()
{
	System.out.println("enter the age: ");
	i=scan.nextInt();	
}
void display() {
	if(i>=18)
	{
		System.out.println(i+ "age is elligible to vote");
	}
	else
	{
		System.out.println(i+ "age is not elligible to vote");
	}
}
}
