package Doggo;

public class Doggo {



	public String place(int i) {
		String retstr ="";
		 //for(j) one to 100 generate retStr = retStr + N+"xx",
//		skip j = i
		//where xx is places.getSuffixFeild(j).getFeild()
		for(int j = 1;j <=100;j++) {
			if(j == i) {continue;}
			int last = getlastint(j);
			String suffix;
			switch(last) {
			case 1: suffix = "st";break;
			case 2: suffix = "nd";break;
			case 3: suffix = "rd";break;
			default: suffix = "th";break;
			}
			if(j == 11|| j == 12 || j == 13) {suffix = "th";}
			retstr = retstr + j +suffix + ", ";
		 
		}
		//remove trailing comma and space
		retstr = retstr.substring(0, retstr.length() - 1);
		retstr = retstr.substring(0, retstr.length() - 1);
		return retstr;
	}
	private int getlastint(int i) {
//		Integer ii = i;
		String ii = ""+i;
		int n = Integer.parseInt(ii.substring(ii.length()-1));
		return n;
	}
	
	
}
































