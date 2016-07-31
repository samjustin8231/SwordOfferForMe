package niuke.easy;

import java.util.Arrays;

public class PrintMinNumber {

	// ����һ����comparable�ӿ�ʵ��
	public String PrintMinNumber(int[] numbers) {
		String res = "";
		if (numbers == null || numbers.length == 0) {
			return res;
		}
		MString m[] = new MString[numbers.length];
		String st[] = Int2String(numbers);
		int k = 0;
		for (String i : st) {
			m[k] = new MString();// �������ȸ�ֵ���ܶ����ĳ�Ա�������з���
			m[k++].s = i;
		}
		Arrays.sort(m);
		for (int i = 0; i < m.length; i++) {
			res += m[i].s;
		}
		return res;
	}

	// ����һ ������Ҫ�Խ��бȽϵ���T�ڲ����и��졣����ʵ�ֽӿ�
	// Comparable<T>����������T��Ϊ����Ƚ��ڲ����ǶԶ�����еģ������������ת������
	// Ȼ����д���� compare(T t)���ɡ�Ȼ��Arrays.sort(T[])�Զ��ص�������Ƚ���
	class MString implements Comparable<MString> {
		public String s;

		@Override
		public int compareTo(MString o) {
			String s1 = s + o.s;
			String s2 = o.s + s;
			if (s1.compareTo(s2) > 0) {
				return 1;
			} else if (s1.compareTo(s2) < 0)
				return -1;
			else
				return 0;
		}

		public String toString() {
			return s;// "MString [s=" + s + "]";
		}
	}

	public String[] Int2String(int[] a) {
		String b[] = new String[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = String.valueOf(a[i]);
		}
		// System.out.println(Arrays.toString(b));
		return b;
	}
}
