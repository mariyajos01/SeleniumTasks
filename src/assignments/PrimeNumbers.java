package assignments;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {

		int i = 0;
		int num = 0;
		String primeNumbers = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n = sc.nextInt();
		sc.close();

		System.out.println("Prime numbers "
				+ "from 1 to " + n + " are :");
		for (i = 1; i <= n; i++) {

			int counter = 0;
			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {

				primeNumbers = primeNumbers + i +" ";
			}
		}
		System.out.println(primeNumbers);
	}

}
