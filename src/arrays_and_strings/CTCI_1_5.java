package arrays_and_strings;

public class CTCI_1_5 {

	// check if there is one/zero edit away from s1 to s2
	// edits can be replace, insert, or delete
	public static boolean oneAway(String s1, String s2) {
		if (s1.length() == s2.length()) {
			if (s1.equals(s2)) {
				return true;
			} else {
				return checkReplace(s1, s2);
			}
		} else if (s1.length() + 1 == s2.length()) {
			return checkInsert(s1, s2);
		} else if (s1.length() - 1 == s2.length()) {
			return checkInsert(s2, s1);
		}
		return false;
	}

	// Check one char has been replaced
	private static boolean checkReplace(String s1, String s2) {
		int countReplace = 0;

		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				countReplace++;
			}
		}

		return countReplace == 1;
	}

	// Check that one char has been inserted into s1 to become s2
	private static boolean checkInsert(String s1, String s2) {
		int i = 0;
		int j = 0;

		while (i < s1.length() && j < s2.length()) {
			if (s1.charAt(i) != s2.charAt(j)) {
				if (i != j) {
					// When there is more than one difference in char
					return false;
				}
				j++;
			} else {
				i++;
				j++;
			}
		}

		return true;
	}
}
