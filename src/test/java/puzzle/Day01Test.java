package puzzle;

import static org.junit.Assert.assertEquals;
import static puzzle.Day01.*;

import org.junit.Test;

public class Day01Test {

	@Test
	public void testSumWhenSameDigitAhead() {
		// part 1
		assertEquals(3, sumWhenSameDigitAhead("1122", 1));
		assertEquals(4, sumWhenSameDigitAhead("1111", 1));
		assertEquals(0, sumWhenSameDigitAhead("1234", 1));
		assertEquals(9, sumWhenSameDigitAhead("91212129", 1));
		
		// part 2
		assertEquals(6, sumWhenSameDigitAhead("1212", "1212".length() / 2));
		assertEquals(0, sumWhenSameDigitAhead("2112", "2112".length() / 2));
		assertEquals(4, sumWhenSameDigitAhead("123425", "123425".length() / 2));
		assertEquals(12, sumWhenSameDigitAhead("123123", "123123".length() / 2));
		assertEquals(4, sumWhenSameDigitAhead("12131415", "12131415".length() / 2));
	}

}
