package assignments;

import java.util.Scanner;

public class Factorial {
	
	
	public static void main(String []args)
	{
		//Take input from the user
        //Create an instance of the Scanner Class
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find the factorial:");
		Integer num=sc.nextInt();
		sc.close();
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.print("Factorial is:" +fact);
	}
	

}
