package dynamic_programming;

public class CTCI_9_1 {
	public static int countWays(int n) {
		if (n < 0) {
			return 0;
		}

		if (n == 0) {
			return 1;
		}

		return countWays(n - 1) + countWays(n - 2) + countWays(n - 3);
	}

	public static int countWaysDP(int n) {
		int[] m = new int[n + 1];
		for (int i = 0; i < n + 1; i++) {
			m[i] = -1;
		}

		return countWays(n, m);
	}

	public static int countWays(int n, int[] m) {
		if (n < 0) {
			return 0;
		}

		if (n == 0) {
			return 1;
		}

		if (m[n] != -1) {
			return m[n];
		}

		m[n] = countWays(n - 1, m) + countWays(n - 2, m) + countWays(n - 3, m);
		return m[n];
	}
}
