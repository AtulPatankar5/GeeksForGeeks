package Day11;

import java.util.HashMap;
import java.util.Map;

public class f_AnagramString {
//String 1= aab   
//	String2=baa   
//	two strings are anagram since it contains same count----> Order does not matter

	public static Map<Character, Integer> FillMap(char[] array) {
		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < array.length; i++) {
			if (!map.containsKey(array[i])) {
				map.put(array[i], 1);
			} else {
				int count = map.get(array[i]);
				map.put(array[i], count + 1);
			}
		}
		return map;
	}

	public static boolean isAnagram(String str1, String str2) {

		char[] array1 = str1.toCharArray();
		char[] array2 = str2.toCharArray();

		Map<Character, Integer> Map1 = FillMap(array1);
		Map<Character, Integer> Map2 = FillMap(array2);
		boolean flag = false;
		for (int i = 0; i < array1.length; i++) {
			int val1 = Map1.get(array1[i]);
			int val2 = 0;
			flag = Map2.containsKey(array1[i]);
			if (flag) {
				val2 = Map2.get(array1[i]);
				if (val1 == val2)
					flag = true;
				else
					flag = false;
			}
		}
		return flag;
	}

	Map<Character, Integer> map = new HashMap<Character, Integer>();

	public static void main(String[] args) {
		String str1 = "aabzzz";
		String str2 = "bazzza";
		boolean result = isAnagram(str1, str2);
		System.out.println(result);
	}

}
