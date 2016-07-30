package niuke.easy;

import java.util.ArrayList;

public class FindNumbersWithSum {

	public static void main(String[] args) {
		System.out.println(FindNumbersWithSum(new int[] { 1, 2, 4, 7, 11, 15 },
				15));
	}

	public static ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
		int i = 0;
		int j = array.length - 1;
		ArrayList<Integer> list = new ArrayList<Integer>();

		while (i < j) {
			if (array[i] + array[j] == sum) {
				list.add(array[i]);
				list.add(array[j]);
				break;
			} else if (array[i] + array[j] < sum) {
				i++;
			} else {
				j--;
			}
		}

		return list;
	}
}
