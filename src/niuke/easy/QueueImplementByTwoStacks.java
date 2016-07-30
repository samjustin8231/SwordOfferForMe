package niuke.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class QueueImplementByTwoStacks {

	private Stack<Integer> stack1;
	private Stack<Integer> stack2;

	QueueImplementByTwoStacks() {
		stack1 = new Stack<Integer>();
		stack2 = new Stack<Integer>();
	}

	/**
	 * 出栈
	 * @return
	 */
	public int pop() {
		Integer re = null;
		if (!stack2.empty()) {
			re = stack2.pop();
		} else {
			while (!stack1.empty()) {// move to stack2 to make stack1 have only
										// one element.Then pop this element.
				re = stack1.pop();
				stack2.push(re);
			}
			if (!stack2.empty()) {
				re = stack2.pop();
			}
		}
		return re;
	}

	/**
	 * 入栈直接放入stack1中
	 * @param node
	 */
	public void push(int node) {
		stack1.push(node);
	}

	public static void main(String[] args) {
		QueueImplementByTwoStacks queue = new QueueImplementByTwoStacks();
		List<Integer> re = new ArrayList<Integer>();
		queue.push(1);
		queue.push(2);
		queue.push(3);
		re.add(queue.pop());
		queue.push(4);
		re.add(queue.pop());
		queue.push(5);
		re.add(queue.pop());
		re.add(queue.pop());
		re.add(queue.pop());
		System.out.println(re.toString());
	}

}
