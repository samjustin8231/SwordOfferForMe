package niuke.easy;

public class ReConstructBinaryTree {

	public static void main(String[] args) {

	}

	public TreeNode reConstructBinaryTree(int[] pre, int[] in) {

		return null;
	}

	/**
	 * ����ǰ���������������ؽ�����������
	 * 
	 * @param preOrder
	 *            ǰ���������
	 * @param start
	 *            ������ʼλ��
	 * @param inOrder
	 *            �����������
	 * @param end
	 *            �����������λ��
	 * @param length
	 *            �����ڵ���
	 * @return �����ĸ��ڵ�
	 */
	public static TreeNode reConstructBinaryTree(char[] preOrder, int start,
			char[] inOrder, int end, int length) {
		// ������֤
		if (preOrder == null || preOrder.length == 0 || inOrder == null
				|| inOrder.length == 0 || length <= 0) {
			return null;
		}

		// �����������ڵ�
		int value = preOrder[start];

		TreeNode root = null;
		root = new TreeNode(value);

		// �ݹ���ֹ����������ֻ��һ���ڵ�
		if (length == 1)
			return root;

		// �ֲ���������������������
		int i = 0;
		while (i < length) {
			if (value == inOrder[end - i]) {
				break;
			}
			i++;
		}

		// ����������������
		root.left = reConstructBinaryTree(preOrder, start + 1, inOrder, end - i
				- 1, length - 1 - i);
		// ����������������
		root.right = reConstructBinaryTree(preOrder, start + length - i,
				inOrder, end, i);

		return root;
	}
}
