package niuke.easy;

public class GetMaxDepth {

	public static void main(String[] args) {

	}

	public int TreeDepth(TreeNode pRoot) {

		if (pRoot == null)
			return 0;
		int leftDepth = TreeDepth(pRoot.left);
		int rightDepth = TreeDepth(pRoot.right);

		return leftDepth > rightDepth ? leftDepth + 1 : rightDepth + 1;
	}
}
