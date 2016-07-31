package niuke.easy;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class PathOfTree {

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		public TreeNode() {
			super();
		}

		public TreeNode(int val) {
			this.val = val;

		}
	}

	/**
	 * 从数组中递归创建树
	 * 
	 * @param data
	 * @param i
	 *            数组中第i个元素
	 * @return 树的根节点
	 */
	private static TreeNode create(int[] data, int i) {
		if (data == null || i < 0 || i >= data.length) {
			return null;
		} else {
			TreeNode root = new TreeNode();
			root.val = data[i];
			// root 对应数组下标为0
			root.left = create(data, (i << 1) + 1);
			root.right = create(data, (i << 1) + 2);
			return root;
		}
	}

	/**
	 * 按层次遍历树
	 * 
	 * @param root
	 *            树的根节点
	 */
	private static void levelPrintTree(TreeNode root) {
		if (root == null) {
			return;
		}
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		// 把根节点入队
		queue.add(root);
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			System.out.print(node.val + "\t");

			// 把树的所有直接子节点入队,如果是棵任意树，需要遍历所有直接子节点
			if (node.left != null) {
				queue.add(node.left);
			}
			if (node.right != null) {
				queue.add(node.right);
			}
		}
		System.out.println();
	}

	/**
	 * 查找二叉树中和为某一值的路径
	 * 
	 * @param root
	 * @param expectSum
	 * @param stack
	 * @param currentSum
	 */
	public static void findPath(TreeNode root, int expectSum,
			Stack<Integer> stack, int currentSum) {
		if (root == null) {
			return;
		}
		// 把当前结点进栈
		stack.push(root.val);
		currentSum += root.val;
		// 如果是叶子结点，而且和为给定的值，则打印路径
		boolean isLeaf = root.left == null && root.right == null;
		if (isLeaf && currentSum == expectSum) {
			for (Integer e : stack) {
				System.out.print(e + "\t");
			}
			System.out.println();
		}

		// 如果不是叶子结点，则遍历它的子结点
		if (root.left != null) {
			findPath(root.left, expectSum, stack, currentSum);
		}
		if (root.right != null) {
			findPath(root.right, expectSum, stack, currentSum);
		}
		// 在返回到父结点之前，在路径上删除当前结点
		stack.pop();

	}

	public static void main(String[] args) {
		int[] data = { 10, 5, 12, 4, 7 };
		TreeNode root = create(data, 0);
		// levelPrintTree(root);

		Stack<Integer> stack = new Stack<Integer>();
		findPath(root, 22, stack, 0);

	}

	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
		ArrayList<ArrayList<Integer>> paths = new ArrayList<ArrayList<Integer>>();

		if (root == null)
			return null;

		// 当前结点入栈

		// 叶子结点
		// 和为给定的值，则打印路径

		// 如果不是叶子结点，则遍历它的子结点

		// 在返回到父结点之前，在路径上删除当前结点

		return null;
	}
}
