package niuke.easy;

public class ContinuousPoker {

	public static void main(String[] args) {

	}

	private static final int MAX = 5;
	private static final int MAX_VAL = 13;

	/**
	 * 1）确认5张牌中除了0，其余数字没有重复的（可以用表统计的方法）;</br>
	 * 2)满足这样的逻辑：（max，min分别代表5张牌中的除0以外的最大值最小值） 如果没有0，则max-min=4，则为顺子，否则不是
	 * 如果有一个0，则max-min=4或者3，则为顺子，否则不是 如果有两个0，则max-min=4或者3或者2，则为顺子，否则不是
	 * 最大值和最小值在第1步中就可以获得
	 * 
	 * @param numbers
	 * @return
	 */
	public boolean isContinuous(int[] numbers) {
		if (numbers == null || numbers.length == 0) {
			return false;
		}

		int[] existTimes = new int[MAX_VAL + 1];
		boolean result = false;
		int len = numbers.length;
		int max = numbers[0], min = numbers[0];
		int zeroCount = 0;
		for (int i = 0; i < len; i++) {
			existTimes[numbers[i]]++;// record the number of occurrences
			if (numbers[i] == 0) {
				zeroCount++;
			} else {
				if (numbers[i] > max || max == 0)
					max = numbers[i];
				if (numbers[i] < min || min == 0)
					min = numbers[i];
			}
		}
		for (int i = 1; i < MAX_VAL; i++) {// i starts from 1,exclude '0'
			if (existTimes[i] > 1) {// duplicate non-zero element
				return false;
			}
		}
		if (zeroCount == 0) {
			if (max - min == MAX - 1)
				result = true;
		} else if (zeroCount == 1) {
			if (max - min == MAX - 1 || max - min == MAX - 2)
				result = true;
		} else if (zeroCount == 2) {
			if (max - min == MAX - 1 || max - min == MAX - 2
					|| max - min == MAX - 3)
				result = true;
		} else if (zeroCount == 3) {
			if (max - min == MAX - 1 || max - min == MAX - 2
					|| max - min == MAX - 3 || max - min == MAX - 4)
				result = true;
		} else if (zeroCount == 4) {
			result = true;
		}

		return result;
	}
}
