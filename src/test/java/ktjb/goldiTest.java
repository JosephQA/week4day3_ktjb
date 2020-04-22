package ktjb;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import Goldilocks.AndHerPhatAss;
import Goldilocks.Masstemp;

public class goldiTest {
	static ArrayList<Integer> result = new ArrayList<Integer>();
	static ArrayList<Masstemp> tst2 = new ArrayList<Masstemp>();
	static ArrayList<Masstemp> tstlumo = new ArrayList<Masstemp>();
	static ArrayList<Integer> resultlumo = new ArrayList<Integer>();
	AndHerPhatAss goldi = new AndHerPhatAss(null);
	@BeforeClass
	public static void setuplists() {
		Masstemp mt1 = new Masstemp(100.0,80);
		tst2.add(mt1);
		Masstemp mt2 = new Masstemp(30.0,50);
		tst2.add(mt2);
		Masstemp mt3 = new Masstemp(130.0,60);
		tst2.add(mt3);
		Masstemp mt4 = new Masstemp(90.0,450);
		tst2.add(mt4);
		Masstemp mt5 = new Masstemp(100.0,120);
		tst2.add(mt5);
		Masstemp mt6 = new Masstemp(120.0,64);
		tst2.add(mt6);
		Masstemp mt7 = new Masstemp(100.0,12);
		tst2.add(mt7);
		Masstemp mt8 = new Masstemp(100.0,120);
		tst2.add(mt8);
		result.add(2);result.add(5);result.add(6);
		Masstemp mtl1 = new Masstemp(100.0,80);
		tstlumo.add(mtl1);
		Masstemp mtl2 = new Masstemp(30.0,50, 99);
		tstlumo.add(mtl2);
		Masstemp mtl3 = new Masstemp(130.0,60, 32);
		tstlumo.add(mtl3);
		Masstemp mtl4 = new Masstemp(90.0,450,78);
		tstlumo.add(mtl4);
		Masstemp mtl5 = new Masstemp(100.0,120,79);
		tstlumo.add(mtl5);
		Masstemp mtl6 = new Masstemp(120.0,64,98);
		tstlumo.add(mtl6);
		Masstemp mtl7 = new Masstemp(100.0,12,85);
		tstlumo.add(mtl7);
		Masstemp mtl8 = new Masstemp(100.0,120,0);
		tstlumo.add(mtl8);
		resultlumo.add(5);resultlumo.add(6);
		
	}
	@Test
	public void testGoldi() {
		assertEquals(result,goldi.getValidOnes(tst2));
	}
	@Test
	public void testGoldiLumo() {
		assertEquals(resultlumo,goldi.getValidOnes(tstlumo));
	}
	
	

}
