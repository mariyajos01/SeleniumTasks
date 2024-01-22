package assignments;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayInAscendingOrder {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();

		numbers.add(50);
		numbers.add(5);
		numbers.add(80);
		numbers.add(101);
		numbers.add(42);
		numbers.add(17);
		numbers.add(90);
		numbers.add(10);

		System.out.println("Before sorting : " + numbers);
		Collections.sort(numbers); // Sort Array in Ascending order
		System.out.println("After sorting : " + numbers);
	}

}
