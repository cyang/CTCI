package arrays_and_strings;

/**
 * Created by ChrisYang on 8/25/15.
 */
public class CTCI_1_7 {
	// rotate a matrix by 90 degrees clockwise
	public static void rotate90(int[][] matrix, int n) {
		for (int layer = 0; layer < n / 2; layer++) {
			int last = n - 1 - layer;
			for (int i = layer; i < last; i++) {
				int offset = i - layer;

				int temp = matrix[layer][i];

				// top <- left
				matrix[layer][i] = matrix[last - offset][layer];

				// left <- bottom
				matrix[last - offset][layer] = matrix[last][last - offset];

				// bottom <- right;
				matrix[last][last - offset] = matrix[i][last];

				// right <- top (temp)
				matrix[i][last] = temp;
			}
		}
	}
}
