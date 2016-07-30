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
	 * 如果下一个弹出的数字刚好是栈顶数字，那么直接弹出。 如果下一个弹出的数字不在栈顶，我们把压栈序列中还没有入栈的数字压入辅助栈，
	 * 知道把下一个需要弹出的数字压入栈顶为止。 如果所有的数字都压入栈了仍没有找到下一个弹出的数字，那么该序列不可能是一个弹出序列。
	 * 
	 * 1,2,3,4,5是某栈的压入顺序，序列4，5,3,2,1
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
