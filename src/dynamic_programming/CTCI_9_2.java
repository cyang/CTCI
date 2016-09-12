package dynamic_programming;

public class CTCI_9_2 {
	public static int countPath(int x, int y) {
		if (x == 1 && y == 1) {
			return 0;
		}

		if (x > 1 && y > 1) {
			return countPath(x - 1, y) + countPath(x, y - 1);
		} else {
			return 1;
		}
	}
}
