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
	 * ������ĵ�����k�����
	 * ��������ָ�룬��һ��ָ����ǰk-1�������ߣ��ڶ���ָ�������ŵ�һ��ָ��һֱ�ߡ�֪����һ��ָ��ָ��ĩβ���ڶ���ָ���Ԫ�ص�ֵ������������Ҫ��õ�ֵ��
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
