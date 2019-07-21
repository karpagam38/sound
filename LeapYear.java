import java.util.Scanner;

public class LeapYear {
int i;
Scanner scan=new Scanner(System.in);
void getinput()
{
	System.out.println("year: ");
	i=scan.nextInt();
}
void display()
{
	if(i% 4==0) {
		System.out.println(i+ " it's a leap year");
	}
	else {
		System.out.println(i+ " it's not a leap year");
	}
}
}
