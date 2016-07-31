package niuke.easy;
public class VerifySequenceOfBST {

	public static void main(String[] args) {
		int[] seq = { 5, 7, 6, 9, 11, 10, 8 };
		int[] seq2 = { 7, 4, 6, 5 };
		System.out.println(VerifySquenceOfBST(seq2));
	}

	private static boolean VerifySquenceOfBST(int[] sequence) {
		if (sequence == null || sequence.length == 0)
			return false;

		return verifySequenceOfBST(sequence, 0, sequence.length - 1);
	}

	private static boolean verifySequenceOfBST(int[] seq, int start, int end) {
		if (start > end)
			return true;
		int i = start;
		// root
		int root = seq[end];

		// ×ó×ÓÊ÷
		while (i < end) {
			if (seq[i] > root)
				break;
			i++;
		}

		int j = i;
		// ÓÒ×ÓÊ÷
		while (j < end) {
			if (seq[j] < root)
				return false;
			j++;
		}

		boolean flag_left = verifySequenceOfBST(seq, start, i - 1);
		boolean flag_right = verifySequenceOfBST(seq, i, end - 1);

		return flag_left & flag_right;
	}
}
