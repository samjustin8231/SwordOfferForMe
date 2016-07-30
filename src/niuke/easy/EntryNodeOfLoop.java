package niuke.easy;

import java.util.HashSet;
import java.util.Set;

import niuke.easy.ReverseList.ListNode;

public class EntryNodeOfLoop {

	public static void main(String[] args) {

	}

	public ListNode EntryNodeOfLoop(ListNode pHead) {
		if (pHead == null || pHead.next == null) {
			return null;
		}

		Set<ListNode> set = new HashSet<ListNode>();

		while (pHead != null) {
			if (!set.contains(pHead)) {
				set.add(pHead);
				pHead = pHead.next;
			} else {
				return pHead;
			}
		}

		return null;
	}
}
