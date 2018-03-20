package uk.co.royharrington.codewars;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NoFivesTest {
	@Test
	public void exampleTests() {
		assertEquals(8, NoFives.dontGiveMeFive(1, 9));
		assertEquals(12, NoFives.dontGiveMeFive(4, 17));
		assertEquals(36, NoFives.dontGiveMeFive(-15, 25));
	}

}
