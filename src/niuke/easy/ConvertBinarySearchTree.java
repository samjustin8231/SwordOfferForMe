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
	 * ��Ŀ:����һ�ö��������������ö���������ת����һ�������˫������Ҫ���ܴ����κ��µĽ�㣬ֻ�ܵ������н��ָ��ķ���</br>
	 * ˼·���ڶ����������У����ӽ���ֵ����С�ڸ��ӽ���ֵ�����ӽ���ֵ���Ǵ��ڸ�����ֵ�������ת���������˫������ʱ�� ԭ��ָ�����ӽڵ��ֵ����Ϊ
	 * ������ָ��ǰһ������ָ�룬ԭ��ָ�����ӽ���ָ�����Ϊ������ָ���һ������ָ�롣</br>
	 * ����㣬�����������������ڰ�����������ת���������˫������֮���ٺ͸�����������������ö���������Ҳ��ת�����������˫������
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
