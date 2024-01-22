package assignments;

public class Pattern {
	
	public static void main(String[]args)
	{
		System.out.println("Pattern1");//pattern1
		for(int i=0;i<=5;i++)
		{
			for (int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Pattern2");//pattern2
		for(int i=0;i<=5;i++)
		{
			for (int j=0;j<=5;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
