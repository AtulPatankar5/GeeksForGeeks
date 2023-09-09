package Day11;

import java.util.LinkedHashMap;
import java.util.Map;

public class c_LongestSubstring {
	public static void longest(String str) {
		char[] arr = str.toCharArray();
		int lengthofSUbString = 0;
		String substring = "";
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], i);
			} else {
				i = map.get(arr[i]);
				map.clear();
			}
			if (map.size() > lengthofSUbString) {
				lengthofSUbString = map.size();
				substring = map.keySet().toString();
			}
		}
		System.out.println(substring);
		System.out.println("Size=" + lengthofSUbString);
	}

	public static void main(String[] args) {
		String str = "JAVA CODE";
		longest(str);
	}
}
