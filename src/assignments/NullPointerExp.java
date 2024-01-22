package assignments;

public class NullPointerExp {

	public static void main(String[] args) {

		try {
			int arr[] = null;
			System.out.println("The length of the "
					+ "array is : " + arr.length);
			
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}

	}

}
