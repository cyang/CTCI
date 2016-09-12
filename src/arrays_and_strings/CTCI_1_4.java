package arrays_and_strings;

public class CTCI_1_4 {
	// Check if string is a permutation of a palindrome
	public static boolean isPalindromePermutation(String s) {
		int[] charFrequency = new int[(int) 'z' - (int) 'a' + 1];
		for (char c : s.toLowerCase().toCharArray()) {
			if (c != ' ') {
				charFrequency[(int) c - (int) 'a']++;
			}
		}

		int oddCharCount = oddCharCount(charFrequency);

		if (s.replaceAll(" ", "").length() % 2 == 0) {
			return oddCharCount == 0;
		} else {
			return oddCharCount == 1;
		}
	}

	private static int oddCharCount(int[] charFrequency) {
		int oddCharCount = 0;

		for (int i : charFrequency) {
			if (i > 0 && i % 2 == 1) {
				// char count is odd
				oddCharCount++;
			}
		}

		return oddCharCount;
	}
}
