package niuke.easy;

public class PrintMatrix {

	public static void main(String[] args) {

	}

	public void printMatrix(int[][] matrix) {
		if (matrix == null)
			return;
		int startX = 0, startY = 0, endX = matrix[0].length, endY = matrix.length - 1;

		while (startX < endX && startY < endY) {
			printCircle(matrix, startX, startY, endX, endY);
			startX++;
			startY++;
			endX--;
			endY--;
		}
	}

	private void printCircle(int[][] matrix, int startX, int startY, int endX,
			int endY) {

		for (int i = startY; i < endY; i++) {
			System.out.println(matrix[i][endX]);
		}

		for (int i = endX; i >= startX; i--) {
			System.out.println(matrix[endY][i]);
		}

		for (int i = endY; i >= startY; i++) {
			System.out.println(matrix[i][startX]);
		}
		for (int i = startX; i <= endX; i++) {
			System.out.println(matrix[startY][i]);
		}
	}
}
