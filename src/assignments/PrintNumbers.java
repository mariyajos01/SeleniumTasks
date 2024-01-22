package assignments;

import java.util.Scanner;

public class PrintNumbers {
	
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count upto print in ascending order");
		Integer num=sc.nextInt();
		
		for(int i=0;i<=num;i++)
		{
			System.out.println(i);
		}
		
		System.out.println("***********************************************");
		System.out.println("Enter the count upto print in descending order");
		Integer num1=sc.nextInt();
		
		
		for(int i=num1;i>=0;i--)
		{
			System.out.println(i);
		}
		sc.close();
	}

}
