package assignments;

public class Inheritance {

	class A {
		public void m1() {
			System.out.println("Parent Class");
		}
	}

	class B extends A {

		public void m2() {
			System.out.println("Child Class");
		}
	}

	/*
	 * //Multiple Inheritance is not supported in Java directly. For this we use
	 * Interface.
	 * 
	 * class C extends A,B {
	 * 
	 * public void c() { System.out.println("c"); } }
	 */

	public static void main(String[] args) {

	

	}

}
