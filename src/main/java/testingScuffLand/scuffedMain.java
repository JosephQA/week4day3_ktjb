package testingScuffLand;

public class scuffedMain {
	public static void main(String[] args) {
		for (int i = 0; i <= 100; i++) {
			String[] sufixes = new String[] { "th", "st", "nd", "rd", "th", "th", "th", "th", "th", "th" };
			switch (i % 100) {
			case 11:
			case 12:
			case 13:
				System.out.println(i + "th"); break;
			default:
				System.out.println(i + sufixes[i % 10]);
			}
		}

	}
}
