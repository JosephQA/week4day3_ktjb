package ktjb;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import DumbCalculator.CalculateDumbStuff;

public class CalculatorTest {
	int[] arr = {5,3,15};
	CalculateDumbStuff cds = new CalculateDumbStuff(arr);
@Test
public void tstinit() {
	assertEquals("5*3=15, 3*5=15, 15/5=3, 15/3=5", cds.dewIt());
}
}
