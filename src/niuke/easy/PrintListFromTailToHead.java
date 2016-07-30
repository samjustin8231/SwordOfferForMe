package niuke.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PrintListFromTailToHead {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {

	}

	/**
	 *  π”√stack
	 * 
	 * @param listNode
	 * @return
	 */
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

		Stack<Integer> stack = new Stack<Integer>();
		ListNode aa = new ListNode(0);
		while (listNode != null) {
			stack.push(listNode.val);
			listNode = listNode.next;
		}

		ArrayList<Integer> list = new ArrayList<Integer>();
		while (!stack.isEmpty()) {
			list.add(stack.pop());
		}
		return list;
	}

	public ArrayList<Integer> printListFromTailToHead1(ListNode listNode) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (listNode != null) {
			list.add(listNode.val);
			listNode = listNode.next;
		}

		int temp = 0;
		for (int i = 0; i < list.size() / 2; i++) {
			temp = list.get(i);
			list.set(i, list.get(list.size() - i - 1));
			list.set(list.size() - i - 1, temp);
		}

		return list;
	}
}
