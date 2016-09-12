package arrays_and_strings;

public class CTCI_1_9 {
	// Using one call to s1.isSubstring(s2) to check if s1 is a rotation of s2
	// O(N)
	public static boolean stringRotation(String s1, String s2) {
		if (s1.length() == s2.length()) {
			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) == s2.charAt(0)) {
					// found start of rotation
					String s1Rotated = s1 + s1;
					return s1Rotated.contains(s2);
				}
			}
		}

		return false;
	}
}
