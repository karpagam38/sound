import java.util.Scanner;

public class CheckRecSq {
	int l,b;
	Scanner scan=new Scanner(System.in);
	void getinput()
	{
		System.out.println("enter the l value: ");
		l=scan.nextInt();
		System.out.println("enter the b value: ");
		b=scan.nextInt();
		
	}
	void display()
	{
		if(l==b) {
			System.out.println("it's a sqare");
		}
		else {
			System.out.println("it's a rectangle");
		}
	}

}
