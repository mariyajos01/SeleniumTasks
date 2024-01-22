package assignments;

import java.util.Scanner;

public class StringReversefunction {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string for reversal: ");
		String s1 = sc.nextLine();
		sc.close();

		StringBuilder reversedString = new StringBuilder();
		reversedString.append(s1);
		reversedString = reversedString.reverse();
		System.out.println("Reversed string: " + reversedString.toString());
	}

}
