package niuke.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PrintFromTopToBottom {

	public static void main(String[] args) {

	}

	public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {

		if (root == null)
			return null;

		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		ArrayList<Integer> list = new ArrayList<Integer>();

		queue.add(root);
		list.add(root.val);

		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();

			if (node.left != null) {
				queue.add(node.left);
				list.add(node.left.val);
			}
			if (node.right != null) {
				queue.add(node.right);
				list.add(node.right.val);
			}
		}

		return list;
	}
}
