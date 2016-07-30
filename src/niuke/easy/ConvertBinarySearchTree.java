package niuke.easy;

public class ConvertBinarySearchTree {

	public class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;

		}

	}

	public static void main(String[] args) {

	}

	/**
	 * 题目:输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的方向。</br>
	 * 思路：在二叉搜索树中，左子结点的值总是小于父子结点的值，右子结点的值总是大于父结点的值。因此在转换成排序的双向链表时， 原先指向左子节点的值调整为
	 * 链表中指向前一个结点的指针，原先指向右子结点的指针调整为链表中指向后一个结点的指针。</br>
	 * 根结点，左子树和右子树。在把左，右子树都转换成排序的双向链表之后再和根结点连接起来，整棵二叉搜索树也就转换成了排序的双向链表。
	 * 
	 * 
	 * @param pRootOfTree
	 * @return
	 */
	public static TreeNode convert(TreeNode root) {
		TreeNode lastNodeInList = null;
		lastNodeInList = convertNode(root, lastNodeInList);

		TreeNode headOfList = lastNodeInList;
		while (headOfList != null && headOfList.left != null) {
			headOfList = headOfList.left;
		}
		return headOfList;
	}

	public static TreeNode convertNode(TreeNode node, TreeNode lastNodeInList) {
		if (node == null)
			return null;
		TreeNode current = node;
		if (current.left != null)
			lastNodeInList = convertNode(current.left, lastNodeInList);
		current.left = lastNodeInList;
		if (lastNodeInList != null)
			lastNodeInList.right = current;
		lastNodeInList = current;
		if (current.right != null)
			lastNodeInList = convertNode(current.right, lastNodeInList);
		return lastNodeInList;
	}
}
