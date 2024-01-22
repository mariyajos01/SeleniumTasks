package assignments;

public class MultipleInheritanceUsingInterface {

	interface IndianMedicalAssoication {
		public void ICU();
	}

	interface USMedicalAssoication {
		public void NICU();
	}

	public static class Hospital implements IndianMedicalAssoication, 
	USMedicalAssoication {
		public void ICU() {
			System.out.println("ICU from IndianMedicalAssoication");
		}

		public void NICU() {
			System.out.println("NICU from USMedicalAssoication");
		}
	}

	public static void main(String[] args) {

		Hospital h = new Hospital();
		h.ICU();
		h.NICU();
	}

}
