package niuke.easy;

public class IsBalanced_Solution {

	public static void main(String[] args) {

	}

	/**
	 * ��Ŀ�� ����һ�ζ������ĸ���㣬�жϸ����ǲ���ƽ����������������������������������������������1����ô������һ��ƽ���������
	 * 1���ظ��������
	 * 
	 * �ο���һ�������������ȣ������������������������ȣ�Ȼ���ж����ǵ����������1�����������һ�ö�����������ǣ�
	 * ����ͬ���ķ����ֱ��ж����������������Ƿ�Ϊƽ���������������ǣ��������һ��ƽ���������
	 * 
	 * ������ķ������ж������Ƿ�Ϊƽ�������ʱ�����ظ��������Ľ�㣬���ϵ�����������ȣ�����Ч�ʲ��ߡ�
	 * 
	 * 2������һ����
	 * 
	 * �����ڱ�������ͬʱ��¼�¸ý�����ȣ������Ϳ��Ա������ظ����ʡ�
	 * 
	 * @param root
	 * @return
	 */
	public boolean IsBalanced_Solution(TreeNode root) {

		if (root == null) {
			return true;
		}

		int leftDepth = TreeDepth(root.left);
		int rightDepth = TreeDepth(root.right);

		int diff = leftDepth - rightDepth;
		if (diff > 1 || diff < -1)
			return false;

		return IsBalanced_Solution(root.left)
				&& IsBalanced_Solution(root.right);
	}

	private int TreeDepth(TreeNode root) {

		if (root == null) {
			return 0;
		}

		int leftDepth = TreeDepth(root.left);
		int rightDepth = TreeDepth(root.right);

		return leftDepth > rightDepth ? (leftDepth + 1) : (rightDepth + 1);
	}

	private boolean isBalanced = true;

	/**
	 * ��������ʱ��������һ���ڵ㣬�����������Ѿ����� �����Ե������жϣ�ÿ���ڵ�ֻ��Ҫ����һ��
	 * 
	 * @param root
	 * @return
	 */
	public boolean IsBalanced_Solution1(TreeNode root) {

		getDepth(root);
		return isBalanced;
	}

	public int getDepth(TreeNode root) {
		if (root == null)
			return 0;
		int left = getDepth(root.left);
		int right = getDepth(root.right);

		if (Math.abs(left - right) > 1) {
			isBalanced = false;
		}
		return right > left ? right + 1 : left + 1;

	}
}
