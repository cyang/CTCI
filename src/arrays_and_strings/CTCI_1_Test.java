package arrays_and_strings;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CTCI_1_Test {
	@Test
	public void isUniqueTest() {
		assertEquals(CTCI_1_1.isUnique("abc"), true);
		assertEquals(CTCI_1_1.isUnique("acdza"), false);
		assertEquals(CTCI_1_1.isUnique("eeee"), false);
	}

	@Test
	public void checkPermutationTest() {
		assertEquals(CTCI_1_2.checkPermutation("God", "dog"), false);
		assertEquals(CTCI_1_2.checkPermutation("odg", "dog"), true);
	}

	@Test
	public void replaceSpacesTest() {
		assertArrayEquals(CTCI_1_3.replaceSpaces("He ll o W o rld".toCharArray(), "He ll o W o rld".length()),
				"He%20ll%20o%20W%20o%20rld".toCharArray());
		assertArrayEquals(CTCI_1_3.replaceSpaces("Mr John Smith    ".toCharArray(), 13),
				"Mr%20John%20Smith".toCharArray());
	}
}
