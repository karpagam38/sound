import java.util.Scanner;

public class ArithmeticOperators {
	int a,b,c;
	int sum,sub,div,mul;
	void get()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a value: ");
		a=scan.nextInt();
		System.out.println("enter b value: ");
		b=scan.nextInt();
	}
	void numbers()
	{
		sum=a+b;
		sub=a-b;
		div=a/b;
        mul=a*b;
	}
	void calculate()
	{
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(div);
		System.out.println(mul);
	}
	

}
