import java.util.Scanner;

public class StartEnd {
int start,end;
Scanner scan=new Scanner(System.in);
void getinput()
{
	System.out.println("enter the starting value: ");
	start=scan.nextInt();
	System.out.println("enter the endding value: ");
	end=scan.nextInt();
}
void diplay()
{
	for(int i=end;i<start;i++) {
	 if(i%5==0) {
		 System.out.println(i+"get");
	 }
	
	} 
		
	
}
}
