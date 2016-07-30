package niuke.easy;

import java.util.Iterator;

public class Find {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	public static boolean Find(int[][] array, int target) {
		boolean flag = false;
		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == target) {
					flag = true;
					break;
				}
			}
			if (flag) {
				break;
			}
		}
		return flag;
	}

	/**
	 * 这种方法效率更高
	 * @param arr
	 * @param target
	 * @return
	 */
	public static boolean FindArray(int[][] arr, int target) {
		int rows = arr.length;
		int columns = arr[0].length;
		boolean flag = false;
		if (arr != null && rows > 0 && columns > 0) {
			int row = 0;
			int column = columns - 1;
			while (row < rows && column >= 0) {
				int tempValue = arr[row][column];
				if (target > tempValue) {
					++row;
				} else if (target < tempValue) {
					--column;
				} else {
					flag = true;
					break;
				}
			}
		}
		return flag;
	}

}
