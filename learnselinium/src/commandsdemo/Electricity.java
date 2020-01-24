package commandsdemo;

import java.util.Scanner;

public class Electricity {
	public static void main (String args[])
	{
		int prevreading, presentreading, units;
		double bill;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  prevreading");
		prevreading=sc.nextInt();
		System.out.println("enter presentreading");
		presentreading=sc.nextInt();
		units=presentreading-prevreading;
		if(units<30)
		{
			bill=units*2.5;
			System.out.println("bill is"+bill);
		
		}
		else if(units<=30 && units<=70)
		{
			bill=units*3.5;
			System.out.println("bill is"+bill);
		
		}
		else
		{
			bill=units*4.5;
			System.out.println("bill is"+bill);
		
		}
	}

}
