package niuke.easy;

import niuke.easy.ReplaceSpace.ListNode;

public class ReverseList {
	public class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}

	public static void main(String[] args) {

	}

	public ListNode ReverseList(ListNode head) {
		if (null == head || null == head.next) {
			return head;
		}
		ListNode reversedHead = ReverseList(head.next);
		head.next.next = head;
		head.next = null;
		return reversedHead;
	}

	/**
	 * ����������ǰ�ڵ����һ���ڵ㻺�����ĵ�ǰ�ڵ�ָ��
	 * 
	 * @param head
	 * @return
	 */
	public ListNode ReverseList1(ListNode head) {
		if (head == null) {
			return null;
		}
		ListNode pre = head;
		ListNode cur = head.next;
		ListNode next;
		while (cur != null) {
			next = cur.next;
			cur.next = pre;
			pre = cur;
			cur = next;
		}
		head.next = null;
		head = pre;

		return head;
	}
}
