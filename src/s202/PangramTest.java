package s202;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import s201.NAmstrong;

class PangramTest {

	@Test
	public void testisTrue() {
		assertTrue(Pangram.isPangramma("The five boxing wizards jump quickly"));
	}
	
	@Test
	public void testisFalse() {
		assertFalse(Pangram.isPangramma("La casa è sul cucuzzulo"));
	}

}
