package niuke.easy;

import java.util.Arrays;

public class PrintMinNumber {

	// 方法一：用comparable接口实现
	public String PrintMinNumber(int[] numbers) {
		String res = "";
		if (numbers == null || numbers.length == 0) {
			return res;
		}
		MString m[] = new MString[numbers.length];
		String st[] = Int2String(numbers);
		int k = 0;
		for (String i : st) {
			m[k] = new MString();// ！必须先赋值才能对它的成员变量进行访问
			m[k++].s = i;
		}
		Arrays.sort(m);
		for (int i = 0; i < m.length; i++) {
			res += m[i].s;
		}
		return res;
	}

	// 方法一 ：必须要对进行比较的类T内部进行改造。首先实现接口
	// Comparable<T>，（必须是T因为后面比较内部都是对对象进行的，否则出现类型转换错误）
	// 然后重写方法 compare(T t)即可。然后Arrays.sort(T[])自动回调用这个比较器
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
