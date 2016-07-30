package niuke.easy;

import niuke.easy.PrintListFromTailToHead.ListNode;

public class FindKthToTail {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/*
	 * 求链表的倒数第k个结点
	 * 采用两个指针，第一个指针提前k-1步向下走，第二个指针再随着第一个指针一直走。知道第一个指针指向末尾，第二个指针的元素的值，便是我们所要求得的值。
	 */
	public static ListNode findKthToTail(ListNode head, int k) {
		if (head == null || k == 0)
			return null;
		ListNode first = head;
		ListNode behind = head;
		for (int i = 0; i < k - 1; i++) {
			if (first.next != null)
				first = first.next;
			else {
				return null;
			}
		}
		while (first.next != null) {
			first = first.next;
			behind = behind.next;
		}
		return behind;
	}
}
