package niuke.easy;
import java.util.ArrayList;
import java.util.List;

public class ReOrderArray {

	public static void main(String[] args) {
		reOrderArray(new int[] { 1, 2, 3, 4, 5, 6, 7 });
	}

	public static void reOrderArray(int[] array) {
		List<Integer> jiList = new ArrayList<Integer>();
		List<Integer> ouList = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 1) {
				jiList.add(array[i]);
			} else {
				ouList.add(array[i]);
			}
		}
		
		for (int i = 0; i < jiList.size(); i++) {
			array[i] = jiList.get(i);
		}
		for (int i = 0; i < ouList.size(); i++) {
			array[jiList.size() + i] = ouList.get(i);
		}
		
	}
}
