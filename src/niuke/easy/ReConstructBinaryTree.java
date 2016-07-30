package niuke.easy;

public class ReConstructBinaryTree {

	public static void main(String[] args) {

	}

	public TreeNode reConstructBinaryTree(int[] pre, int[] in) {

		return null;
	}

	/**
	 * 根据前序遍历和中序遍历重建二叉树子树
	 * 
	 * @param preOrder
	 *            前序遍历数组
	 * @param start
	 *            子树起始位置
	 * @param inOrder
	 *            中序遍历数组
	 * @param end
	 *            中序遍历结束位置
	 * @param length
	 *            子树节点树
	 * @return 子树的根节点
	 */
	public static TreeNode reConstructBinaryTree(char[] preOrder, int start,
			char[] inOrder, int end, int length) {
		// 参数验证
		if (preOrder == null || preOrder.length == 0 || inOrder == null
				|| inOrder.length == 0 || length <= 0) {
			return null;
		}

		// 建立子树根节点
		int value = preOrder[start];

		TreeNode root = null;
		root = new TreeNode(value);

		// 递归终止条件：子树只有一个节点
		if (length == 1)
			return root;

		// 分拆子树的左子树和右子树
		int i = 0;
		while (i < length) {
			if (value == inOrder[end - i]) {
				break;
			}
			i++;
		}

		// 建立子树的左子树
		root.left = reConstructBinaryTree(preOrder, start + 1, inOrder, end - i
				- 1, length - 1 - i);
		// 建立子树的右子树
		root.right = reConstructBinaryTree(preOrder, start + length - i,
				inOrder, end, i);

		return root;
	}
}
