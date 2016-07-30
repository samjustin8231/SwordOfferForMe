package niuke.easy;

public class HasSubtree {

	public static void main(String[] args) {

	}

	public boolean HasSubtree(TreeNode root1, TreeNode root2) {
		boolean result = false;
		if (root1 != null && root2 != null) {
			if (root1.val == root2.val) {
				result = DoesTreeAHaveTreeB(root1, root2);
			}
			if (result == false) {
				result = HasSubtree(root1.left, root2);
			}
			if (result == false) {
				result = HasSubtree(root1.right, root2);
			}
		}
		return result;
	}

	public boolean DoesTreeAHaveTreeB(TreeNode root1, TreeNode root2) {
		if (root2 == null)
			return true;
		if (root1 == null)
			return false;
		if (root1.val != root2.val)
			return false;
		return DoesTreeAHaveTreeB(root1.left, root2.left)
				&& DoesTreeAHaveTreeB(root1.right, root2.right);
	}
}
