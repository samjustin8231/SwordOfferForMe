package niuke.easy;

import java.util.ArrayList;


public class ReplaceSpace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuffer tt = new StringBuffer("We Are Happy.");
		System.out.println(replaceSpace(tt));
	}

	public static String replaceSpace(StringBuffer str) {
		StringBuilder t = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {

			if (' ' == str.charAt(i)) {
				t.append("%20");
			} else {
				t.append(str.charAt(i));
			}
		}

		return t.toString();
	}

	public class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}

	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		
		return null;
	}
}
