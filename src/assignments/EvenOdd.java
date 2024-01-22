package assignments;

import java.util.Scanner;

public class EvenOdd {
	

	public static void main(String []args)
	{
		//Take input from the user
        //Create an instance of the Scanner Class
		Scanner sc=new Scanner(System.in);//create a scanner object
		System.out.println("Enter the number:");
		Integer num=sc.nextInt();
		if(num %2==0) {
			System.out.println("The given number"+" "+num+" "+ "is Even");
		}else
			System.out.println("The given number"+" "+num+" "+ "is Odd");
		sc.close();
	}
}
