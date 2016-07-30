package niuke.easy;

public class MoreThanHalfNum_Solution {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 2, 2, 2, 5, 4, 2 };
		System.out.println(MoreThanHalfNum_Solution(a) + "");
	}

	/**
	 * 本文算法：我们保存两个值，一个是value --- 当前出现次数最大的值， 一个是 count ---value出现的次数。</br>
	 * 我们遍历整个数组，如果遇到与value值相同的值，就把count 加1，否则减1。如果在做减法以前，count的值已经为0，</br>
	 * 就把那个不同的值设成value， count的值设成 1. 这样，我们保证能够找出出现次数超过一半的数字 value。
	 * 
	 * @param array
	 * @return
	 */
	public static int MoreThanHalfNum_Solution(int[] array) {
		int result = 0;
		int count = 1;
		if (array.length == 0)
			return 0;
		result = array[0];
		for (int i = 1; i < array.length; i++) {
			if (result == array[i])
				count++;
			else {
				if (count == 0) {
					result = array[i];
					count = 1;
				} else {
					count--;
				}
			}

		}

		// 不加这个限制会报错。
		int total = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == result)
				total++;
		}

		if (total * 2 <= array.length) {
			return 0;
		}
		return result;
	}
}
