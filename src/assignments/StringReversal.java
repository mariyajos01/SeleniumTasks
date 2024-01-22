package assignments;

import java.util.Scanner;

public class StringReversal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string for reversal: ");
		String s1 = sc.nextLine();
		sc.close();

		System.out.print("After reverse string is: ");
		String rev = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			rev = rev + s1.charAt(i);
		}

		System.out.print(rev);

	}

}
