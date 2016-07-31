package niuke.easy;
import java.util.HashMap;

public class FirstNotRepeatingChar {

	public static void main(String[] args) {
		String str = "sPeYjppjOPHoiYdzlTUufOOzlnSudHuHzbWXzZnyPWrnkFfmQX";
		int index = FirstNotRepeatingChar2(str);
		if (index != -1) {
			char firstShowOnlyOnceElement = str.charAt(index);// charAt() source
																// code:return
																// value[index +
																// offset];
			System.out.println(firstShowOnlyOnceElement);
		}
	}

	/**
	 * 在一个字符串中找到第一个只出现一次的字符。如输入abaccdeff，则输出b <br/>
	 * 如果没有找到返回 -1
	 * 注意：这种方式有问题，如果区分大小写，这样不好，得用下面这种方式，用HashMap.
	 * @param str
	 * @return
	 */ 
	public static int FirstNotRepeatingChar(String str) {
		if(str==null||str.length()==0){  
            return -1;  
        }  
        int len=str.length();  
        char[] letters=str.toCharArray();  
        //In java,'char' is 16 bits,so there are 2^16 characters.  
        //But we deal with only the 26 English letters in this case.  
        int[] count=new int[26];//the 'HashTable'  
        for(int i=0;i<len;i++){  
            char curChar=letters[i];  
            count[curChar-'a']++;  
        }  
        for(int i=0;i<len;i++){  
            char curChar=letters[i];//iterate the string,not the HashTable  
            if(count[curChar-'a']==1){  
                return i;  
            }  
        }  
        return -1;  
	}

	// 字符串中第一个仅出现一次的字符
	public static int FirstNotRepeatingChar2(String str) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		int index = -1;
		char[] chars = str.toCharArray();

		for (int i = 0; i < chars.length; i++) {
			if (map.containsKey(chars[i] + "")) {
				map.put(chars[i] + "", map.get(chars[i] + "") + 1);
			} else {
				map.put(chars[i] + "", 1);
			}
		}
		for (int i = 0; i < chars.length; i++) {
			if (map.get(chars[i] + "") == 1) {
				index = i;
				break;
			}
		}
		return index;
	}

}
