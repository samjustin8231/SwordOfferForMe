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
	 * �������еݹ鴴����
	 * 
	 * @param data
	 * @param i
	 *            �����е�i��Ԫ��
	 * @return ���ĸ��ڵ�
	 */
	private static TreeNode create(int[] data, int i) {
		if (data == null || i < 0 || i >= data.length) {
			return null;
		} else {
			TreeNode root = new TreeNode();
			root.val = data[i];
			// root ��Ӧ�����±�Ϊ0
			root.left = create(data, (i << 1) + 1);
			root.right = create(data, (i << 1) + 2);
			return root;
		}
	}

	/**
	 * ����α�����
	 * 
	 * @param root
	 *            ���ĸ��ڵ�
	 */
	private static void levelPrintTree(TreeNode root) {
		if (root == null) {
			return;
		}
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		// �Ѹ��ڵ����
		queue.add(root);
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			System.out.print(node.val + "\t");

			// ����������ֱ���ӽڵ����,����ǿ�����������Ҫ��������ֱ���ӽڵ�
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
	 * ���Ҷ������к�Ϊĳһֵ��·��
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
		// �ѵ�ǰ����ջ
		stack.push(root.val);
		currentSum += root.val;
		// �����Ҷ�ӽ�㣬���Һ�Ϊ������ֵ�����ӡ·��
		boolean isLeaf = root.left == null && root.right == null;
		if (isLeaf && currentSum == expectSum) {
			for (Integer e : stack) {
				System.out.print(e + "\t");
			}
			System.out.println();
		}

		// �������Ҷ�ӽ�㣬����������ӽ��
		if (root.left != null) {
			findPath(root.left, expectSum, stack, currentSum);
		}
		if (root.right != null) {
			findPath(root.right, expectSum, stack, currentSum);
		}
		// �ڷ��ص������֮ǰ����·����ɾ����ǰ���
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

		// ��ǰ�����ջ

		// Ҷ�ӽ��
		// ��Ϊ������ֵ�����ӡ·��

		// �������Ҷ�ӽ�㣬����������ӽ��

		// �ڷ��ص������֮ǰ����·����ɾ����ǰ���

		return null;
	}
}
