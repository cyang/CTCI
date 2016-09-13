package dynamic_programming;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CTCI_9_Test {
	@Test
	public void test1() {
		assertEquals(CTCI_9_1.countWays(1), 1);
		assertEquals(CTCI_9_1.countWays(2), 2);
		assertEquals(CTCI_9_1.countWays(3), 4);
		assertEquals(CTCI_9_1.countWays(4), 7);
		assertEquals(CTCI_9_1.countWays(10), 274);

		assertEquals(CTCI_9_1.countWaysDP(1), 1);
		assertEquals(CTCI_9_1.countWaysDP(2), 2);
		assertEquals(CTCI_9_1.countWaysDP(3), 4);
		assertEquals(CTCI_9_1.countWaysDP(4), 7);
		assertEquals(CTCI_9_1.countWaysDP(10), 274);
	}

}
