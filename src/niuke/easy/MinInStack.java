package niuke.easy;

import java.util.ArrayList;

/**
 * 实现包含min函数的栈
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
	 * 泛型元素的比较方法
	 * 
	 * @param minData
	 * @param item
	 * @return true 代表当前元素小于之前的最小元素
	 */
	private boolean compare(T minData, T item) {
		// 这儿不同的泛型类型可以用不同的方式实现
		// 如果写成通用代码泛型之间应该肿么比较大小呢？是不是可以让泛型都继承某一接口呢？
		int a = (Integer) minData;
		int b = (Integer) item;
		if (a > b) {
			return true;
		} else {
			return false;
		}
	}
}
