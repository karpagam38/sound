import java.util.Scanner;

public class EnterNameRoll {
	int roll;
	String name,fieldofinterest;
	Scanner scan=new Scanner(System.in);
	void getinput()
	{
		System.out.println("enter the name: ");
		name=scan.next();
		System.out.println("enter the Roll number:" );
		roll=scan.nextInt();
		System.out.println("Field of interest: ");
		fieldofinterest=scan.next();
		
		
		
		
	}
	void display()
	{

		System.out.println("Hey my name is "+name+" "+roll+" +"+fieldofinterest);
		
	}

}
