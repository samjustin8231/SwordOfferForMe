package niuke.easy;
public class NumberOf1Between1AndN {

	public int NumberOf1Between1AndN_Solution(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			count += getNumOf1(i);
		}

		return count;
	}

	private int getNumOf1(int i) {
		int count = 0;
		while (i > 0) {
			if (i % 10 == 1) {
				count++;
			}
			i = i / 10;
		}

		return count;
	}
}
