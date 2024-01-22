package assignments;

import java.util.Scanner;

public class SwapTwoNumbers {

	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number for swapping");
		Integer s1=sc.nextInt();
		Integer s2=sc.nextInt();
		sc.close();
		
		int a, b, temp=0;
		a=s1;
		b=s2;
		System.out.println("Before Swapping a="+" "+a+" "+"and b="+" "+b);
		temp=a;
		s1=b;
		s2=temp;
		
		System.out.println("After swapping b="+" "+s1+" "+"and b="+" "+s2);
		
		
		
	}
}
