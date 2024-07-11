import java.util.Scanner;
class Practise02
{
	static Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	static Boolean b=s.nextBoolean();
	public static void main(String[] args)
	{
		Practise02 o1=new Practise02();
		Practise02 o2=new Practise02();
		System.out.println(o1.a+" "+o2.a);
		System.out.println(o1.b+" "+o2.b);
	}
}
