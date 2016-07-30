package niuke.easy;

public class IsSymmetrical {

	public static void main(String[] args) {

	}

	/**
	 * ��ĿҪ���ж���֪��һ���������Ƿ��ǶԳƵġ�
	 * 
	 * �㷨˼���ǣ������ж�������Ƿ�Ϊ���������������ֱ�ӷ���true
	 * 
	 * �����Ϊ�գ����ڽ��з��ࣺcase1���ڵ����������Ϊ�գ���ֱ�ӷ���true
	 * 
	 * case2���ڵ������������һ��Ϊ�գ���ֱ�ӷ���false
	 * 
	 * case3���ڵ��������������Ϊ�գ�
	 * ���жϽڵ�������ӽڵ��ֵ�Ƿ���Ȳ����ж���ڵ������ڵ���ҽڵ�����ӽڵ��Ƿ�Գƻ�����ڵ�����ӽڵ���ҽڵ�����ӽڵ��Ƿ�Գ�
	 * 
	 * @param pRoot
	 * @return
	 */
	boolean isSymmetrical(TreeNode pRoot) {

		if (pRoot == null)
			return true;

		return isSymmetric(pRoot.left, pRoot.right);
	}

	private boolean isSymmetric(TreeNode left, TreeNode right) {

		if (left == null && right == null)
			return true;
		else if (left == null || right == null) {
			return false;
		}

		return left.val == right.val && isSymmetric(left.left, right.right)
				&& isSymmetric(left.right, right.left);
	}
}
