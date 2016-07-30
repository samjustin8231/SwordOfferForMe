package niuke.easy;

public class MoreThanHalfNum_Solution {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 2, 2, 2, 5, 4, 2 };
		System.out.println(MoreThanHalfNum_Solution(a) + "");
	}

	/**
	 * �����㷨�����Ǳ�������ֵ��һ����value --- ��ǰ���ִ�������ֵ�� һ���� count ---value���ֵĴ�����</br>
	 * ���Ǳ����������飬���������valueֵ��ͬ��ֵ���Ͱ�count ��1�������1���������������ǰ��count��ֵ�Ѿ�Ϊ0��</br>
	 * �Ͱ��Ǹ���ͬ��ֵ���value�� count��ֵ��� 1. ���������Ǳ�֤�ܹ��ҳ����ִ�������һ������� value��
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

		// ����������ƻᱨ��
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
