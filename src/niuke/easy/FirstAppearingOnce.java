package niuke.easy;

import java.util.ArrayList;
import java.util.HashMap;

public class FirstAppearingOnce {
	HashMap<Character, Integer> map = new HashMap<Character, Integer>();// ����ַ�������ֵĴ���
	ArrayList<Character> list = new ArrayList<Character>();// ����ַ�

	public static void main(String[] args) {

	}

	// Insert one char from stringstream
	public void Insert(char ch) {
		if (map.containsKey(ch)) {
			map.put(ch, map.get(ch) + 1);
		} else {
			map.put(ch, 1);
		}
		list.add(ch);
	}

	// return the first appearence once char in current stringstream
	public char FirstAppearingOnce() {
		for (int i = 0; i < list.size(); i++) {
			if (map.get(list.get(i)) == 1) {
				return list.get(i);
			}
		}
		return '#';
	}
}
