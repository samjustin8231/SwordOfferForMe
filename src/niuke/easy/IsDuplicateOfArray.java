package niuke.easy;

public class IsDuplicateOfArray {

	public static void main(String[] args) {

	}

	public boolean duplicate(int numbers[], int length, int[] duplication) {
		duplication[0] = -1;

		if (length <= 1) {
			return false;
		}
		int[] flag = new int[length + 1];

		for (int i = 0; i < length; i++) {
			flag[numbers[i]]++;
			if (flag[numbers[i]] > 1) {
				duplication[0] = numbers[i];
				return true;
			}
		}

		return false;
	}
}
