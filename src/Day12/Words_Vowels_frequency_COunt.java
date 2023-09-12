package Day12;

import java.util.HashMap;
import java.util.Map;

public class Words_Vowels_frequency_COunt {
//Learn From Krishna Sandeep
//			words=4
//			vowelcount=8
//			uppercasecount=4
//			charFrequencyCount= a:3
	public static void calcaluteAll(String str) {
		char[] arr = str.toCharArray();
		int wordCount = 0;
		int vowelCount = 0;
		int uppercase = 0;
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ' ' || arr[i] == '.' || i == arr.length - 1)
				wordCount++;
			if (arr[i] == 'a' || arr[i] == 'A' || arr[i] == 'e' || arr[i] == 'E' || arr[i] == 'i' || arr[i] == 'I'
					|| arr[i] == 'o' || arr[i] == 'O' || arr[i] == 'u')
				vowelCount++;
			int unicode = arr[i];
			if (unicode >= 65 && unicode <= 90)
				uppercase++;
			if(arr[i]==' ')
				continue;
			if (!map.containsKey(arr[i]))
				map.put(arr[i], 1);
			else {
				Integer value = map.get(arr[i]);
				map.put(arr[i], value + 1);
			}

		}
		System.out.println("WordCount="+ wordCount);
		System.out.println("VowelCount="+ vowelCount);
		System.out.println("UpperCase="+ uppercase);
		System.out.println(map);
	}

	public static void main(String[] args) {
		String str = "Learn From Krishna Sandeep";
		calcaluteAll(str);
	}

}
