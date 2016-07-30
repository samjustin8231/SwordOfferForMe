package niuke.easy;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println(Fibonacci(0));
	}

	/**
	 * µÝ¹é·½Ê½
	 * 
	 * @param n
	 * @return
	 */
	public static int Fibonacci(int n) {
		if (n <= 0)
			return 0;
		if (n == 1 || n == 2) {
			return 1;
		}
		return Fibonacci(n - 1) + Fibonacci(n - 2);
	}

	/**
	 * ·ÇµÝ¹é
	 * 
	 * @param n
	 * @return
	 */
	public int Fibonacci1(int n) {
		if (n <= 0)
			return 0;
		if (n <= 2) {
			return 1;
		}
		int n1 = 1, n2 = 1, sn = 0;
		for (int i = 0; i < n - 2; i++) {
			sn = n1 + n2;
			n1 = n2;
			n2 = sn;
		}
		return sn;
	}
}
