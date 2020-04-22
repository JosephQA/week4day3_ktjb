package Doggo;
import Doggo.Places;
public class Doggo {



	public String place(int i) {
		String retstr ="";
		 //for(j) one to 100 generate retStr = retStr + N+"xx",
//		skip j = i
		//where xx is places.getSuffixFeild(j).getFeild()
		for(int j = 1;j <=100;j++) {
			if(j == i) {continue;}
			Places[] suffx = Places.values();
			
			retstr = retstr;  
		}
		//remove trailing comma
		return retstr;
	}
	private int getlastint(int i) {
//		Integer ii = i;
		String ii = ""+i;
		int n = Integer.parseInt(ii.substring(ii.length()-1));
		return n;
	}
	public String getsuffixFeild(int i) {
		Places[] arr = Places.values();
		return arr[i - 1].name();
	}
}
































