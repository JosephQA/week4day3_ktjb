package Calculator;

public class Calculator {

	public String relatedNumbers(int a, int b, int c) {
		String ou = "";
		int result;
		
		if (a <= b || a >= c) {
			result = a * b;
			System.out.println(a + " x " + b +" = " + result);
		}else
		{
			result = c * b;
			System.out.println(a + " x " + b +" = " + result);
		}
		
		

		return result;
		
	}
	
	}
