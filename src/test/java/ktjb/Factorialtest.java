package ktjb;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import Factorial.Factorial;

public class Factorialtest {
	Factorial fc = new Factorial();
	@Before
	public void setupFactorial() {}
	
	@Test
	public void testFactorial() {
			assertEquals("120 = 5!",fc.factorise(120));
			assertEquals("NONE",fc.factorise(150));
	}
	@Test
	public void testFactorialAdv() {
		assertEquals("479001600 = 12!",fc.factorise(479001600));
		assertEquals("3628800 = 10!",fc.factorise(3628800));
	}
	@Test
	public void testFactorialAdv2() {
		assertEquals("6 = 3!",fc.factorise(6));
		assertEquals("NONE",fc.factorise(18));
	}
}
