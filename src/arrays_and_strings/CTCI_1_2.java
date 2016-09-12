package arrays_and_strings;

import java.util.Arrays;

public class CTCI_1_2 {
	public static boolean checkPermutation(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}

		char[] s1Arr = s1.toCharArray();
		Arrays.sort(s1Arr);
		char[] s2Arr = s2.toCharArray();
		Arrays.sort(s2Arr);

		return Arrays.equals(s1Arr, s2Arr);
	}
}
