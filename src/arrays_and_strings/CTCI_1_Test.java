package arrays_and_strings;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CTCI_1_Test {
	@Test
	public void isUniqueTest() {
		assertTrue(CTCI_1_1.isUnique("abc"));
		assertFalse(CTCI_1_1.isUnique("acdza"));
		assertFalse(CTCI_1_1.isUnique("eeee"));
	}

	@Test
	public void checkPermutationTest() {
		assertFalse(CTCI_1_2.checkPermutation("God", "dog"));
		assertTrue(CTCI_1_2.checkPermutation("odg", "dog"));
	}

	@Test
	public void replaceSpacesTest() {
		assertArrayEquals(CTCI_1_3.replaceSpaces("He ll o W o rld".toCharArray(), "He ll o W o rld".length()),
				"He%20ll%20o%20W%20o%20rld".toCharArray());
		assertArrayEquals(CTCI_1_3.replaceSpaces("Mr John Smith    ".toCharArray(), 13),
				"Mr%20John%20Smith".toCharArray());
	}

	@Test
	public void isPalindromePermutationTest() {
		assertTrue(CTCI_1_4.isPalindromePermutation("Tact Coa"));
		assertFalse(CTCI_1_4.isPalindromePermutation("hello world"));
		assertTrue(CTCI_1_4.isPalindromePermutation("rrcacea"));
		assertTrue(CTCI_1_4.isPalindromePermutation("roor"));
	}

	@Test
	public void oneAwayTest() {
		assertTrue(CTCI_1_5.oneAway("pale", "ple"));
		assertTrue(CTCI_1_5.oneAway("pales", "pale"));
		assertTrue(CTCI_1_5.oneAway("pale", "bale"));
		assertFalse(CTCI_1_5.oneAway("pale", "bae"));
		assertFalse(CTCI_1_5.oneAway("pale", "palest"));
	}

	@Test
	public void compressTest() {
		assertEquals(CTCI_1_6.compress("aabcccccaaa"), "a2b1c5a3");
		assertEquals(CTCI_1_6.compress(""), "");
	}

	@Test
	public void rotate90Test() {
		int[][] input1 = { { 1 } };
		CTCI_1_7.rotate90(input1, input1.length);
		int[][] output1 = { { 1 } };

		for (int i = 0; i < input1.length; i++) {
			assertArrayEquals(input1[i], output1[i]);
		}

		int[][] input2 = { { 0, 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9, 10, 11 }, { 12, 13, 14, 15 } };
		CTCI_1_7.rotate90(input2, input2.length);
		int[][] output2 = { { 12, 8, 4, 0 }, { 13, 9, 5, 1 }, { 14, 10, 6, 2 }, { 15, 11, 7, 3 } };

		for (int i = 0; i < input2.length; i++) {
			assertArrayEquals(input2[i], output2[i]);
		}

		int[][] input3 = { { 1, 2 }, { 3, 4 } };
		CTCI_1_7.rotate90(input3, input3.length);
		int[][] output3 = { { 3, 1 }, { 4, 2 } };

		for (int i = 0; i < input3.length; i++) {
			assertArrayEquals(input3[i], output3[i]);
		}
	}
}
