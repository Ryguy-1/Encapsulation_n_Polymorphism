package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EncapsulateTheDataTest {
EncapsulateTheData e = new EncapsulateTheData();
	@Test
	void testIR() {
		e.iRS(-1);
		assertEquals(0,e.iRG());
		e.dTS(23486187);
		assertEquals(360,e.dTG());
		e.nS("");
		assertEquals(" ",e.nG());
		e.mS("Hello");
		assertTrue(!(e.mG() instanceof String));
	}

}
