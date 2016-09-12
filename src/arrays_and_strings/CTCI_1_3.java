package arrays_and_strings;

/**
 * Created by ChrisYang on 8/24/15.
 */
public class CTCI_1_3 {
	// Replace spaces in a string with "%20"
	public static char[] replaceSpaces(char[] str, int trueLength) {
		int spaceCount = 0, newLength = 0, j = 0;
		for (int i = 0; i < trueLength; i++) {
			if (str[i] == ' ')
				spaceCount++;
		}

		newLength = trueLength + spaceCount * 2;

		char[] newStr = new char[newLength];

		for (int i = 0; i < trueLength; i++) {
			if (str[i] == ' ') {
				newStr[j++] = '%';
				newStr[j++] = '2';
				newStr[j++] = '0';
			} else {
				newStr[j++] = str[i];
			}
		}

		return newStr;
	}
}
