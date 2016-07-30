package niuke.easy;

import niuke.easy.ReverseList.ListNode;

public class FindFirstCommonNode {

	public static void main(String[] args) {

	}

	/**
	 * 两个链表比较长度，计算出长度差d，让长的先走d这么长
	 * 
	 * @param pHead1
	 * @param pHead2
	 * @return
	 */
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {

		int length1 = getLength(pHead1);
		int length2 = getLength(pHead2);
		if (length1 == 0 || length2 == 0) {
			return null;
		}

		ListNode pointLongListNode = null;
		ListNode pointShortListNode = null;
		int dif = 0;
		if (length1 > length2) {
			pointLongListNode = pHead1;
			pointShortListNode = pHead2;

		} else {
			pointLongListNode = pHead2;
			pointShortListNode = pHead1;
		}
		dif = Math.abs(length1 - length2);

		for (int i = 0; i < dif; i++) {
			pointLongListNode = pointLongListNode.next;
		}
		while (pointLongListNode != null && pointShortListNode != null
				&& pointLongListNode != pointShortListNode) {
			pointLongListNode = pointLongListNode.next;
			pointShortListNode = pointShortListNode.next;
		}

		return pointLongListNode;
	}

	private int getLength(ListNode pHead1) {
		if (pHead1 == null) {
			return 0;
		}
		ListNode head = pHead1;
		int len = 0;

		while (head.next != null) {
			head = head.next;
			len++;
		}

		return len;
	}
}
