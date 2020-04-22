package testingScuffLand;

// import  DumbCalculator.CalculateDumbStuff;

public class scuffedMain {
	//static CalculateDumbStuff cds;
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
//		int[] intAr = {2,5,7,9,2,4,89,6,1,1,2,4};
//		 cds = new CalculateDumbStuff(intAr);
//		cds.dewIt();

	}
}
