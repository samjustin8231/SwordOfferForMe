package niuke.easy;

public class CloneComplexLinkedList {
	public class RandomListNode {
		int label;
		RandomListNode next = null;
		RandomListNode random = null;

		RandomListNode(int label) {
			this.label = label;
		}
	}

	public static void main(String[] args) {

	}

	public RandomListNode Clone(RandomListNode pHead) {

		CloneList(pHead);
		ConstructSibling(pHead);

		return Split(pHead);
	}

	private RandomListNode Split(RandomListNode pHead) {
		RandomListNode orign, cloneHead = null, clone = null;
		orign = pHead;
		if (orign != null) {
			cloneHead = orign.next;
			orign.next = cloneHead.next; 
			orign = cloneHead.next;
			clone = cloneHead;
		}

		while (orign != null) {
			RandomListNode temp = orign.next;
			orign.next = temp.next;
			orign = orign.next;
			clone.next = temp;
			clone = temp;
		}

		return cloneHead;
	}

	/**
	 * 
	 * @param pHead
	 */
	private void ConstructSibling(RandomListNode pHead) {
		RandomListNode pre = pHead;
		RandomListNode clone;
		while (pre != null) {
			clone = pre.next;
			if (pre.random != null) {
				clone.random = pre.random.next;
			}
			pre = clone.next;
		}
	}

	/**
	 * 复制一份链表.<br>
	 * 将链表中的每一个节点在自己的后面复制一个<br>
	 * 原链表：1234 复制之后：11223344
	 * 
	 * @param pHead
	 */
	private void CloneList(RandomListNode pHead) {
		RandomListNode current = pHead;
		while (current != null) {
			RandomListNode temp = new RandomListNode(current.label);
			temp.next = current.next;
			temp.random = null;
			current.next = temp;
			current = temp.next;
		}
	}
}
