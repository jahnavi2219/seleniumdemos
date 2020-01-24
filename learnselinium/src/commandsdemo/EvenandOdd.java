package commandsdemo;

import java.util.Scanner;

public class EvenandOdd {
	public static void main(String args[])
	{
		int n,  sumeven=0, sumodd=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of elements in array");
		n=sc.nextInt();
		 int[] a = new int[n];
	        System.out.println("Enter the elements of the array:");
	        for(int i = 0; i < n; i++)
	        {
	            a[i] = sc.nextInt();
	        }
	        for(int i = 0; i < n; i++)
	        {
	            if(a[i] % 2 == 0)
	            {
	                sumeven = sumeven + a[i];
	            }
	            else
	            {
	                sumodd = sumodd + a[i];
	            }
	        }
	        System.out.println("Sum of Even Numbers:"+sumeven);
	        System.out.println("Sum of Odd Numbers:"+sumodd);
	    }
	}
		
	


