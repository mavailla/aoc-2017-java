package puzzle;

import static org.junit.Assert.assertEquals;
import static puzzle.Day03.*;

import org.junit.Test;


public class Day03Test {

	@Test
	public void testManhattanDistance() {
	
		// part 1
		assertEquals(0, manhattanDistance(1));
		assertEquals(3, manhattanDistance(12));
		assertEquals(4, manhattanDistance(21));
		assertEquals(326, manhattanDistance(361527));  // my input
		
		// part 2
		assertEquals(23, firstValueWrittenLargerThanInput(12));
		assertEquals(806, firstValueWrittenLargerThanInput(800));
		assertEquals(363010, firstValueWrittenLargerThanInput(361527));  // my input

	}


}
