package assignments;

import java.util.Scanner;

public class PrintDescending {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count upto print in descending order");
		Integer num=sc.nextInt();
		sc.close();
		
		for(int i=num;i>=1;i--)
		{
			System.out.println(i);
		}
		
	}

}
