import java.util.Scanner;

public class Vow {
	char ch;
	Scanner scan=new Scanner(System.in);
	void getinput()
	{
		System.out.println("enter the letter");
		ch=scan.next().charAt(0);
		
	}
void process()
{
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	{
		System.out.println(ch+" is vow");
	}
	else
	{
		System.out.println(ch+" is not a vow");
	}
	
}
}
