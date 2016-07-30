package niuke.easy;

import java.util.ArrayList;
import java.util.LinkedList;

public class PrintBinaryTree {

	public static void main(String[] args) {

	}

	/**
	 * 利用层次遍历的算法，设置变量last指向当前层的最后一个节点，设置变量count记录当前层已经访问的节点的个数，当count等于last时，
	 * 表示该层访问结束。 层次遍历在求树的宽度、输出某一层节点，某一层节点个数，每一层节点个数都可以采取类似的算法。
	 * 树的宽度：在树的深度算法基础上，加一个记录访问过的层节点个数最多的变量max
	 * ,在访问每层前max与last比较，如果max比较大，max不变，如果max小于last，把last赋值给max;
	 * 
	 * @param pRoot
	 * @return
	 */
	public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

		if (pRoot == null) {
			return list;
		}

		int count = 0;
		int last = 0;
		TreeNode current = pRoot;
		LinkedList<TreeNode> queue = new LinkedList<TreeNode>();

		queue.offer(current);

		while (!queue.isEmpty()) {
			count = 0;
			last = queue.size();
			ArrayList<Integer> tempList = new ArrayList<Integer>();

			// 打印一层
			while (count < last) {
				current = queue.pop();
				tempList.add(current.val);

				count++;
				if (current.left != null) {
					queue.offer(current.left);
				}
				if (current.right != null) {
					queue.offer(current.right);
				}
			}
			list.add(tempList);
		}

		return list;
	}
}
