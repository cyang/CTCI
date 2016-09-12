package arrays_and_strings;

public class CTCI_1_1 {
	public static boolean isUnique(String input) {
		int check = 0;
		for (int i = 0; i < input.length(); i++) {
			int curr = input.charAt(i) - 'a';

			if ((check & (1 << curr)) != 0) {
				return false;
			}
			check |= (1 << curr);
		}
		return true;
	}
}
