package Day11;

import java.util.HashMap;
import java.util.Map;

public class a_FIndOccurenceOfwords {

	public static Map<Character, Integer> countWords(String str) {
		char[] arr = str.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				int count = map.get(arr[i]);
				map.put(arr[i], count + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		return map;
	}
	
	public static void main(String[] args) {
		String str = "ALLAHABAD";
		Map<Character, Integer> result = countWords(str);
		System.out.println(result);
	}

}
