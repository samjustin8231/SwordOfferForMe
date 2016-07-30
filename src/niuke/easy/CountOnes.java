package niuke.easy;

public class CountOnes {
	/**
	 * ���ټ������������1�ĸ���(Fast Bit Counting) ���㷨��˼�����£� ÿ�ν������������һ�����ֵ���룬�Ӷ������ұߵ�һλ1����
	 * ֱ������Ϊ0 �м�ѭ���Ĵ�����Ϊ����1�ĸ��� �������"10100������һ��Ϊ��10011",����Ϊ"10000",�������������ұߵ�1
	 * Sparse Ones and Dense Ones were first described by Peter Wegner in ��A
	 * Technique for Counting Ones in a Binary Computer��, Communications of the
	 * ACM, Volume 3 (1960) Number 5, page 322
	 */
	public static void main(String[] args) {
		int i = 7;
		CountOnes count = new CountOnes();
		System.out.println("There are " + count.getCount(i) + " ones in i");
	}

	/**
	 * @author
	 * @param i
	 *            ��������
	 * @return �����Ʊ�ʾ��1�ĸ���
	 */
	public int getCount(int i) {
		int n;
		for (n = 0; i > 0; n++) {
			i &= (i - 1);
		}
		return n;
	}
}
