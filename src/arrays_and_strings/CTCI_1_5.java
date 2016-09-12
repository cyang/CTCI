package arrays_and_strings;

/**
 * Created by ChrisYang on 8/24/15.
 */
public class CTCI_1_5 {
	public static void main(String[] args) {
		String str = "aabcccccaaa";
		System.out.println(compress(str));

	}

	// Compress a string by counting the number of occurrences
	// of a character and placing that count after that character
	public static String compress(String str) {
		String newStr = "";
		int count = 1;
		char lastChar = str.charAt(0);

		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == lastChar)
				count++;
			else {
				newStr += lastChar + "" + count;
				count = 1;
				lastChar = str.charAt(i);

			}
		}

		return newStr + lastChar + count;
	}
}
