package arrays_and_strings;

public class CTCI_1_8 {
	// If element in MxN matrix is 0, change the row and col to be 0s
	// O(n^2)
	public static void zeroMatrix(int[][] m) {
		int[] zeroRows = new int[m.length];
		int[] zeroCols = new int[m[0].length];

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] == 0) {
					zeroRows[i] = 1;
					zeroCols[j] = 1;
					break;
				}
			}
		}

		zeroRows(m, zeroRows);
		zeroCols(m, zeroCols);
	}

	private static void zeroRows(int[][] m, int[] zeroRows) {
		for (int i = 0; i < zeroRows.length; i++) {
			if (zeroRows[i] == 1) {
				for (int j = 0; j < m[i].length; j++) {
					m[i][j] = 0;
				}
			}
		}
	}

	private static void zeroCols(int[][] m, int[] zeroCols) {
		for (int i = 0; i < zeroCols.length; i++) {
			if (zeroCols[i] == 1) {
				for (int j = 0; j < m[i].length; j++) {
					m[j][i] = 0;
				}
			}
		}

	}
}
