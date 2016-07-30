package niuke.easy;

import java.util.ArrayList;

public class SelectSortK {

	public static void main(String[] args) {
		ArrayList<Integer> arr = GetLeastNumbers_Solution(new int[] { 1, 2, 7,
				3, 5, 0 }, 10);
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}

	}

	public static ArrayList<Integer> GetLeastNumbers_Solution(int[] arr, int k) {
		ArrayList<Integer> listValue = new ArrayList<Integer>();// ��¼ÿ����������±�
		ArrayList<Integer> list = new ArrayList<Integer>();// ��¼ÿ����������±�

		if (arr == null || arr.length == 0) {
			return listValue;
		}

		if (arr.length < k) {
			return listValue;
		}

		for (int i = 0; i < k; i++) {
			int minValue = Integer.MAX_VALUE; // ���ֵ
			int minIndex = i;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] < minValue && !list.contains(j)) {
					minValue = arr[j];
					minIndex = j;
				}
			}
			if (!list.contains(minIndex)) {// ��������ڣ��ͼ���
				list.add(minIndex);
				listValue.add(minValue);
			}
		}
		return listValue;
	}

}
