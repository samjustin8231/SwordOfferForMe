package niuke.easy;

public class Sum_Solution {

	public static void main(String[] args) {

	}

	/**
	 * ����˼·�� 1.�������߼���Ķ�·����ʵ�ֵݹ���ֹ��
	 * 2.��n==0ʱ��(n>0)&&((sum+=Sum_Solution(n-1))>0)ִֻ��ǰ����жϣ�Ϊfalse��Ȼ��ֱ�ӷ���0��
	 * 3.��n>0ʱ��ִ��sum+=Sum_Solution(n-1)��ʵ�ֵݹ����Sum_Solution(n)��
	 * 
	 * @param n
	 * @return
	 */
	public int Sum_Solution(int n) {
		int sum = n;
		boolean ans = (n > 0) && ((sum += Sum_Solution(n - 1)) > 0);
		return sum;
	}
}
