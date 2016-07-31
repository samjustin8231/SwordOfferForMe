package niuke.easy;
/**
 * ��Ŀ������ ����һ���������飬������������Ҳ�и�����������������һ�������������һ�������飬ÿ�������鶼��һ���͡�
 * ������������ĺ͵����ֵ��Ҫ��ʱ�临�Ӷ�ΪO(n)��
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
	 * ��һ����������������ͣ��������1, -2, 3, 10, -4, 7, 2,-5��<br/>
	 * ��������ֱ��Ҳ����Ұ���İ취���ǣ�����forѭ��������������������ÿһ��������ĺͣ����������Щ�����������һ��ֵ��
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
				sum = 0;// ����Ҫ�ǵ����㣬����Ļ�sum���մ�ŵ�������������ĺ͡�Ҳ���Ǳ��֮������˵��bug����л���ǡ�

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

		// ���ж�
		if (array == null || array.length == 0) {
			return 0;
		}

		//
		int maxSum = array[0];
		int rightArray = array[0];
		for (int i = 1; i < array.length; i++) {
			// ����Ҳ�����>0,maxSum = ��ǰԪ�� + �Ҳ�����
			if (rightArray >= 0) {
				rightArray = array[i] + rightArray;
			} else {
				// ����Ҳ�����<0,maxSum = ��ǰԪ��
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
	 * ����
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
