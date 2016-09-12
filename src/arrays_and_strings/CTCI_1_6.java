package arrays_and_strings;

/**
 * Created by ChrisYang on 8/25/15.
 */
public class CTCI_1_6 {
	public static void main(String[] args) {
		int[][] matrix = { { 0, 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9, 10, 11 }, { 12, 13, 14, 15 } };

		int n = matrix.length;
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				System.out.print(matrix[row][col] + " ");

			}
			System.out.println();
		}

		System.out.println();
		rotate90(matrix, 4);

		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				System.out.print(matrix[row][col] + " ");

			}
			System.out.println();
		}

	}

	// rotate a matrix by 90 degrees clockwise
	public static void rotate90(int[][] matrix, int n) {
		for (int layer = 0; layer < n; layer++) {
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
