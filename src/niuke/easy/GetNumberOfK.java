package niuke.easy;

public class GetNumberOfK {

	public static void main(String[] args) {

	}

	/**
	 * 题目描述 统计一个数字在排序数组中出现的次数。 <br/>
	 * 解题思路 数组是排序的，所以重复出现的数字是相邻排列的。 用二分查找算法，找到第一次出现的位置，和 最后一次出现的位置。
	 * 判断第一次出现的位置条件为：当前数字的前一个是否与之相等，若是则继续查找，否则该位置就是第一次出现的位置。
	 * 判断最后一次出现的位置条件为：当前数字的后一个是否与之相等，若是则继续查找，否则该位置就是最后一次出现的位置。 出现的次数= last -
	 * first +1
	 * 时间复杂度：O(logn)
	 * 
	 * @param array
	 * @param k
	 * @return
	 */
	public int GetNumberOfK(int[] array, int k) {
		int result = 0;
		if (array == null || array.length == 0) {
			return 0;
		}

		int start = 0, end = array.length - 1;

		int firstIndex = getFirstIndex(array, start, end, k);
		int lastIndex = getLastIndex(array, start, end, k);

		if (firstIndex > -1 && lastIndex > -1) {
			result = lastIndex - firstIndex + 1;
		}

		return result;
	}

	private int getLastIndex(int[] array, int start, int end, int k) {
		if (start > end) {
			return -1;
		}

		int midIndex = (start + end) / 2;
		int midData = array[midIndex];

		if (midData == k) {
			if (midIndex < array.length - 1 && array[midIndex + 1] != k
					|| midIndex == array.length - 1) {
				return midIndex;
			} else {
				start = midIndex + 1;
			}
		} else if (midData > k) {
			end = midIndex - 1;
		} else {
			start = midIndex + 1;
		}

		return getLastIndex(array, start, end, k);
	}

	private int getFirstIndex(int[] array, int start, int end, int k) {
		if (start > end) {
			return -1;
		}

		int midIndex = (start + end) / 2;
		int midData = array[midIndex];

		if (midData == k) {
			if (midIndex > 0 && array[midIndex - 1] != k || midIndex == 0) {
				return midIndex;
			} else {
				end = midIndex - 1;
			}
		} else if (midData > k) {
			end = midIndex - 1;
		} else {
			start = midIndex + 1;
		}

		return getFirstIndex(array, start, end, k);
	}

}
