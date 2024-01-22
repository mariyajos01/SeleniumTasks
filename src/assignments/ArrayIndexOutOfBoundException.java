package assignments;

public class ArrayIndexOutOfBoundException {

	public static void main(String[] args) {

		try {

			String name[] = { "Mariya", "Henna", "Rani", "Jose", "Antony" };
			System.out.print(name[5]); // ArrayIndexOutOfBoundsException

		} catch (ArrayIndexOutOfBoundsException e)

		{
			System.out.print(e.getMessage());
		}

	}

}
