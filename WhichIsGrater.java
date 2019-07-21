import java.util.Scanner;

public class WhichIsGrater {
int i,j;
void value()
{
	Scanner Scan=new Scanner(System.in);
	System.out.println("enter the i value: ");
	i=Scan.nextInt();
	System.out.println("enter the j value: ");
	j=Scan.nextInt();
}
void process()
{
	if(i<j)
		{
		System.out.println(j+" value is grater");
		}
	else
		{
		System.out.println(i+" value is grater");
		}}
}