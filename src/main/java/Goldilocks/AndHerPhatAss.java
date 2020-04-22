package Goldilocks;

import java.util.ArrayList;

public class AndHerPhatAss {
	private ArrayList<Masstemp> weightTemp = new ArrayList<Masstemp>();
	int index = -1;

	public AndHerPhatAss(ArrayList<Masstemp> list) {
		// TODO Auto-generated constructor stub
		weightTemp = list;
	}

	public ArrayList<Integer> getValidOnes(ArrayList<Masstemp> listIn) {
		Masstemp goldilocks = listIn.get(0);
		ArrayList<Integer> outlist = new ArrayList<Integer>();
		double goldiMass = goldilocks.mass;
		int goldiTemp = goldilocks.temp;

		listIn.forEach(ele -> {
			index = index + 1;
			if (index == 1||index ==0) {}else { // skip goldilocks herself
				if (ele.mass >= goldiMass && ele.temp <= goldiTemp && ele.lumos >= 70) {
					outlist.add(index);
				}
			}
		});

		return outlist;
	}
}
