package niuke.easy;

public class IsBalanced_Solution {

	public static void main(String[] args) {

	}

	/**
	 * 题目： 输入一课二叉树的根结点，判断该树是不是平衡二叉树。如果二叉树中任意结点的左右子树的深度相差不超过1，那么它就是一棵平衡二叉树。
	 * 1、重复遍历结点
	 * 
	 * 参考上一题求二叉树的深度，先求出根结点的左右子树的深度，然后判断它们的深度相差不超过1，如果否，则不是一棵二叉树；如果是，
	 * 再用同样的方法分别判断左子树和右子树是否为平衡二叉树，如果都是，则这就是一棵平衡二叉树。
	 * 
	 * 但上面的方法在判断子树是否为平衡二叉树时，会重复遍历树的结点，不断地求子树的深度，所以效率不高。
	 * 
	 * 2、遍历一遍结点
	 * 
	 * 我们在遍历结点的同时记录下该结点的深度，这样就可以避免了重复访问。
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
	 * 后续遍历时，遍历到一个节点，其左右子树已经遍历 依次自底向上判断，每个节点只需要遍历一次
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
