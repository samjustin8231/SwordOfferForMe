package niuke.easy;

public class StrToInt {
	public static void main(String[] args) {
		System.out.println(StrToInt("234"));
	}

	public static int StrToInt(String str) {

		if (str.length() == 0)
			return 0;

		int sum = 0;
		// 2345
		for (int i = str.length() - 1; i >= 0; i++) {
			int temp = str.charAt(i);
			sum = sum + temp;
		}

		return sum;
	}
}
