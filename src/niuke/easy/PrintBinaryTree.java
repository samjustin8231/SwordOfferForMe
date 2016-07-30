package niuke.easy;

import java.util.ArrayList;
import java.util.LinkedList;

public class PrintBinaryTree {

	public static void main(String[] args) {

	}

	/**
	 * ���ò�α������㷨�����ñ���lastָ��ǰ������һ���ڵ㣬���ñ���count��¼��ǰ���Ѿ����ʵĽڵ�ĸ�������count����lastʱ��
	 * ��ʾ�ò���ʽ����� ��α����������Ŀ�ȡ����ĳһ��ڵ㣬ĳһ��ڵ������ÿһ��ڵ���������Բ�ȡ���Ƶ��㷨��
	 * ���Ŀ�ȣ�����������㷨�����ϣ���һ����¼���ʹ��Ĳ�ڵ�������ı���max
	 * ,�ڷ���ÿ��ǰmax��last�Ƚϣ����max�Ƚϴ�max���䣬���maxС��last����last��ֵ��max;
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

			// ��ӡһ��
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
