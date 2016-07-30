package niuke.difficult;

public class Add {

	public static void main(String[] args) {
		System.out.println(func1(6, 7));
	}

	public static int func2(int a, int b) {
		int sum;
		int carry;
		int num1 = a;
		int num2 = b;
		do {
			sum = num1 ^ num2;
			carry = (num1 & num2) << 1;
			num1 = sum;
			num2 = carry;
		} while (carry != 0);
		return sum;
	}

	public static int func1(int a, int b) {
		int sum;
		int carry;
		do {
			sum = a ^ b;
			carry = (a & b) << 1;
			a = sum;
			b = carry;
		} while (carry != 0);
		return sum;
	}
}
