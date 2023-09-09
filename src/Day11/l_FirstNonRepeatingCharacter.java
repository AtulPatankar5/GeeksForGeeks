package Day11;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class l_FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		String str = "aabbdef";
		char[] arr = str.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			} else {
				int count = map.get(arr[i]);
				map.put(arr[i], count + 1);
			}

		}
		for (int i = 0; i < arr.length; i++) {
			int val = map.get(arr[i]);
			if (val == 1) {
				System.out.println(arr[i]);
				break;
			}
		}
	}
}
