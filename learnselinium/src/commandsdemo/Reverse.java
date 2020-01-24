package commandsdemo;

import java.util.Scanner;


public class Reverse {
	public static void main(String args[])
	{
		int n, re=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		n=sc.nextInt();
		if(n>0)
		{
		while(n!=0)
		{
			int a=n%10;
			re=a+re*10;
			n=n/10;
			
		}
		System.out.println("reversed no is"+re);
	}
	else if(n<0)
	{
		while(n!=0)
		{
			int a=n%10;
			re=a+re*10;
			n=n/10;
	}
		System.out.println("negative no: -"+re);
}
}}