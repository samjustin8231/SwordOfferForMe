package niuke.easy;

public class Multiply {

	public static void main(String[] args) {

	}

	public int[] multiply(int[] A) {

		if (A == null || A.length == 0)
			return null;
		int[] B = new int[A.length];
		int[] D = new int[A.length];
		int[] C = new int[A.length];

		D[0] = 1;
		C[A.length - 1] = 1;

		// º∆À„D
		for (int i = 1; i < A.length; i++) {
			D[i] = D[i - 1] * A[i - 1];
		}

		// º∆À„C
		for (int i = A.length - 1; i > 0; i--) {
			C[i - 1] = C[i] * A[i];
		}

		for (int i = 0; i < A.length; i++) {
			B[i] = D[i] * C[i];
		}

		return B;
	}
}
