package niuke.easy;

public class IsSymmetrical {

	public static void main(String[] args) {

	}

	/**
	 * 题目要求判断已知的一个二叉树是否是对称的。
	 * 
	 * 算法思想是：首先判断这棵树是否为空树，如果空树则直接返回true
	 * 
	 * 如果不为空，则在进行分类：case1：节点的左右子树为空，则直接返回true
	 * 
	 * case2：节点的左右子树有一个为空，则直接返回false
	 * 
	 * case3：节点的左右子树均不为空，
	 * 则判断节点的左右子节点的值是否相等并且判断左节点的子左节点和右节点的右子节点是否对称还有左节点的右子节点和右节点的左子节点是否对称
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
