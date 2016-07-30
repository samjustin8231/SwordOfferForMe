package niuke.easy;

public class GetNumberOfK {

	public static void main(String[] args) {

	}

	/**
	 * ��Ŀ���� ͳ��һ�����������������г��ֵĴ����� <br/>
	 * ����˼· ����������ģ������ظ����ֵ��������������еġ� �ö��ֲ����㷨���ҵ���һ�γ��ֵ�λ�ã��� ���һ�γ��ֵ�λ�á�
	 * �жϵ�һ�γ��ֵ�λ������Ϊ����ǰ���ֵ�ǰһ���Ƿ���֮��ȣ�������������ң������λ�þ��ǵ�һ�γ��ֵ�λ�á�
	 * �ж����һ�γ��ֵ�λ������Ϊ����ǰ���ֵĺ�һ���Ƿ���֮��ȣ�������������ң������λ�þ������һ�γ��ֵ�λ�á� ���ֵĴ���= last -
	 * first +1
	 * ʱ�临�Ӷȣ�O(logn)
	 * 
	 * @param array
	 * @param k
	 * @return
	 */
	public int GetNumberOfK(int[] array, int k) {
		int result = 0;
		if (array == null || array.length == 0) {
			return 0;
		}

		int start = 0, end = array.length - 1;

		int firstIndex = getFirstIndex(array, start, end, k);
		int lastIndex = getLastIndex(array, start, end, k);

		if (firstIndex > -1 && lastIndex > -1) {
			result = lastIndex - firstIndex + 1;
		}

		return result;
	}

	private int getLastIndex(int[] array, int start, int end, int k) {
		if (start > end) {
			return -1;
		}

		int midIndex = (start + end) / 2;
		int midData = array[midIndex];

		if (midData == k) {
			if (midIndex < array.length - 1 && array[midIndex + 1] != k
					|| midIndex == array.length - 1) {
				return midIndex;
			} else {
				start = midIndex + 1;
			}
		} else if (midData > k) {
			end = midIndex - 1;
		} else {
			start = midIndex + 1;
		}

		return getLastIndex(array, start, end, k);
	}

	private int getFirstIndex(int[] array, int start, int end, int k) {
		if (start > end) {
			return -1;
		}

		int midIndex = (start + end) / 2;
		int midData = array[midIndex];

		if (midData == k) {
			if (midIndex > 0 && array[midIndex - 1] != k || midIndex == 0) {
				return midIndex;
			} else {
				end = midIndex - 1;
			}
		} else if (midData > k) {
			end = midIndex - 1;
		} else {
			start = midIndex + 1;
		}

		return getFirstIndex(array, start, end, k);
	}

}
