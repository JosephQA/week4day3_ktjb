package Factorial;

public class Factorial {

	public String factorise(int i) {
		// TODO Auto-generated method stub

		int j = 1;
		String eqStr = actuallyFactorise(i, j, null);
		if (eqStr == "NONE") {
			return eqStr;
		} else {
			return i + eqStr;
		}

	}

	private String actuallyFactorise(double num, int divisor, String retString) {
		// until = 1 recursive division of num incrementing divisor, return " =!divisor"
		// if less than 1 return "NONE"

		divisor = divisor + 1;
		num = num / divisor;

		if (num > 1) // carry on
		{
			retString = actuallyFactorise(num, divisor, retString);
		}
		if (num < 1)// not a factorial
		{
			retString = "NONE";
		}
		// if num == 1 return string "= <num>!"
		if (retString == null) { // only return highest divisor string
			retString = " = " + divisor + "!";
		}
		return retString;
	}

}
