package niuke.easy;

import java.util.ArrayList;
import java.util.Stack;

public class IsPopOrder {

	public static void main(String[] args) {
		int[] pushA = { 1, 2, 3, 4, 5 };
		int[] popA = { 4, 5, 3, 2, 1 };

		IsPopOrder s = new IsPopOrder();
		boolean res = s.IsPopOrder(pushA, popA);
		System.out.println(res);
	}

	/**
	 * �����һ�����������ָպ���ջ�����֣���ôֱ�ӵ����� �����һ�����������ֲ���ջ�������ǰ�ѹջ�����л�û����ջ������ѹ�븨��ջ��
	 * ֪������һ����Ҫ����������ѹ��ջ��Ϊֹ�� ������е����ֶ�ѹ��ջ����û���ҵ���һ�����������֣���ô�����в�������һ���������С�
	 * 
	 * 1,2,3,4,5��ĳջ��ѹ��˳������4��5,3,2,1
	 * 
	 * @param pushA
	 * @param popA
	 * @return
	 */
	public boolean IsPopOrder(int[] pushA, int[] popA) {
		if (pushA.length == 0 || popA.length == 0)
			return false;
		if (pushA.length != popA.length) {
			return false;
		}
		Stack<Integer> stack = new Stack<Integer>();
		int j = 0;
		for (int i = 0; i < pushA.length; i++) {
			stack.push(pushA[i]);
			while ((!stack.empty()) && (stack.peek() == popA[j])) {
				stack.pop();
				j++;
			}
		}
		if (stack.empty()) {
			return true;
		} else {
			return false;
		}
	}
}
