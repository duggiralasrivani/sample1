package Task4;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitTest {
	@Test
	public void test() {
		SimpleCompound sc=new SimpleCompound();

		assertEquals(270000,sc.simpleinterest(500000,3,18));
	}
	@Test
	public void test2() {
		SimpleCompound sc=new SimpleCompound();
	//	8235.05
		assertEquals(8000.0,sc.compoundinterest(5000,10,0.05,12),235.05);
	}

}
