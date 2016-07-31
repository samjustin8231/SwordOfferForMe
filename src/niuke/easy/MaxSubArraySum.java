package niuke.easy;
/**
 * 题目描述： 输入一个整形数组，数组里有正数也有负数。数组中连续的一个或多个整数组成一个子数组，每个子数组都有一个和。
 * 求所有子数组的和的最大值。要求时间复杂度为O(n)。
 * 
 * @author dommo
 * 
 */
public class MaxSubArraySum {

	public static void main(String[] args) {
		int[] array = { 2, 8, 1, 5, 9 };
		// System.out.println("Max sum: "
		// + MaxSubArraySum.FindGreatestSumOfSubArray(array));

		int[] arr = { 1, -2, 3, 10, -4, 7, 2, -5 };
		System.out.println("MaxSum:" + findMaxSum(arr));
	}

	/**
	 * 求一个数组的最大子数组和，如此序列1, -2, 3, 10, -4, 7, 2,-5，<br/>
	 * 我想最最直观也是最野蛮的办法便是，三个for循环三层遍历，求出数组中每一个子数组的和，最终求出这些子数组的最大的一个值。
	 * 
	 * @param array
	 * @return
	 */
	public static int findMaxSum(int[] array) {
		int sum = 0;
		int maxSum = Integer.MIN_VALUE;

		if (array == null || array.length == 0)
			return 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {

				for (int k = i; k <= j; k++) {
					sum += array[k];
				}
				if (sum > maxSum) {
					maxSum = sum;
				}
				sum = 0;// 这里要记得清零，否则的话sum最终存放的是所有子数组的和。也就是编程之美上所说的bug。多谢苍狼。

			}
		}

		return maxSum;
	}

	/**
	 * 
	 * 
	 * @param array
	 * @return
	 */
	public static int findMaxSum1(int[] array) {

		// 空判断
		if (array == null || array.length == 0) {
			return 0;
		}

		//
		int maxSum = array[0];
		int rightArray = array[0];
		for (int i = 1; i < array.length; i++) {
			// 如果右侧数组>0,maxSum = 当前元素 + 右侧数组
			if (rightArray >= 0) {
				rightArray = array[i] + rightArray;
			} else {
				// 如果右侧数组<0,maxSum = 当前元素
				rightArray = array[i];
			}

			if (maxSum < rightArray) {
				maxSum = rightArray;
			}

		}

		return maxSum;
	}

	// 1, -2, 3, 10, -4, 7, 2, -5
	/**
	 * 不懂
	 * 
	 * @param array
	 * @return
	 */
	public static int findMaxSum2(int[] array) {
		int curSum = 0;
		int maxSum = 0;
		int len = array.length;

		if (array == null || len == 0) {
			return 0;
		}

		for (int i = 0; i < len; i++) {
			curSum += array[i];
			if (curSum < 0) {
				curSum = 0;
			}
			if (curSum > maxSum) {
				maxSum = curSum;
			}
		}

		// all data are negative
		if (maxSum == 0) {
			for (int i = 0; i < len; i++) {
				if (i == 0) {
					maxSum = array[i];
				}
				if (array[i] > maxSum) {
					maxSum = array[i];
				}
			}
		}
		return maxSum;
	}

}
