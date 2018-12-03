package puzzle;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static puzzle.Day04.*;

import org.junit.Test;


public class Day04Test {

	@Test
	public void testIsPassphraseValid() {
	
		// part 1
		assertTrue(isPassphraseValid("ahoihju sdyn phi uhz lupbx", false));
		assertFalse(isPassphraseValid("ahoihju ahoihju", false));
		assertEquals(466, validPassphrases("day04.txt", false));
		
		// part 2
		assertFalse(isPassphraseValid("abc cba", true));
		assertEquals(251, validPassphrases("day04.txt", true));
	}


}
