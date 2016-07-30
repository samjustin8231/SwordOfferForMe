package niuke.easy;

import java.util.ArrayList;

/**
 * ʵ�ְ���min������ջ
 * 
 * @author DHC
 * @param <T>
 */
public class MinInStack<T> {

	public static void main(String[] args) {
		MinInStack<Integer> newStack = new MinInStack<Integer>();
		newStack.push(4);
		newStack.push(6);
		newStack.push(2);
		newStack.push(5);
		newStack.pop();
		newStack.pop();
		newStack.push(1);
		System.out.println(newStack.min());
	}

	public ArrayList<T> stack = new ArrayList<T>();

	public ArrayList<Integer> minStack = new ArrayList<Integer>();

	public T pop() {
		int size = stack.size();
		minStack.remove(size - 1);
		return stack.remove(size - 1);
	}

	public void push(T item) {
		int size = stack.size();

		if (size == 0) {
			minStack.add(0);
		} else {
			int minPosition = minStack.get(size - 1);
			T minData = stack.get(minPosition);

			if (compare(minData, item)) {
				minStack.add(stack.size());
			} else {
				minStack.add(minPosition);
			}
		}

		stack.add(item);
	}

	public T peek() {
		int size = stack.size();
		return stack.get(size - 1);
	}

	public T min() {
		int size = minStack.size();
		return stack.get(minStack.get(size - 1));
	}

	public boolean isEmpty() {
		return stack.isEmpty();
	}

	/**
	 * ����Ԫ�صıȽϷ���
	 * 
	 * @param minData
	 * @param item
	 * @return true ����ǰԪ��С��֮ǰ����СԪ��
	 */
	private boolean compare(T minData, T item) {
		// �����ͬ�ķ������Ϳ����ò�ͬ�ķ�ʽʵ��
		// ���д��ͨ�ô��뷺��֮��Ӧ����ô�Ƚϴ�С�أ��ǲ��ǿ����÷��Ͷ��̳�ĳһ�ӿ��أ�
		int a = (Integer) minData;
		int b = (Integer) item;
		if (a > b) {
			return true;
		} else {
			return false;
		}
	}
}
