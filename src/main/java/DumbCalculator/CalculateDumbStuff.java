package DumbCalculator;

public class CalculateDumbStuff {
//handle input of numbers
	//return string of valid cacluation for those numbers on each other, 
	//excluding the same number N from appearing twice or more in one calculations
	int[] intArr;
	public CalculateDumbStuff(int[] intAr) {
		// TODO Auto-generated constructor stub
		intArr = intAr;
	}
	public String dewIt() {
		String retstr = "";
//		cycle though  all combinations of 3 elements in the array
		for(int i = 0 ; i < intArr.length; i++) {
			for(int j = 0; j < intArr.length; j++) {
				if( j == i ) { continue;} //dont do maths to yourself 
				for(int k= 0; k < intArr.length; k++) {
					if(k==i||k==j) {continue;} //don't do maths to yourself 
					//if valid maths add to return string
					System.out.println(" "+ intArr[i]+" "+intArr[j]+" "+intArr[k]);
					if(addABC(intArr[i], intArr[j], intArr[k])){retstr = retstr +intArr[i] +"+"+intArr[j]+"="+intArr[k]+", ";}
					if(subABC(intArr[i], intArr[j], intArr[k])){retstr = retstr +intArr[i] +"-"+intArr[j]+"="+intArr[k]+", ";}
					if(mulABC(intArr[i], intArr[j], intArr[k])){retstr = retstr +intArr[i] +"*"+intArr[j]+"="+intArr[k]+", ";}
					if(divABC(intArr[i], intArr[j], intArr[k])){retstr = retstr +intArr[i] +"/"+intArr[j]+"="+intArr[k]+", ";}
					
					
				}
			}
		}
		
		//remove ", " from end of string
		retstr = retstr.substring(0, retstr.length() - 1);
		retstr = retstr.substring(0, retstr.length() - 1);
		System.out.println(retstr);
		
		return retstr;
	}
	private boolean addABC(int a, int b ,int c) {
		System.out.println((a+b == c));
		return (a+b == c);
	}
	private boolean subABC(int a, int b ,int c) {
		System.out.println((a-b == c));
		return (a-b == c);
	}
	private boolean mulABC(int a, int b ,int c) {
		System.out.println((a*b == c));
		return (a*b == c);
	}
	private boolean divABC(int a, int b ,int c) {
	System.out.println((a/b == c));
		return (a/b == c);
	}
	
}
