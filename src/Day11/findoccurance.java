package Day11;

public class findoccurance {

	public static void main(String[] args) {
		String inputString = "Hello, World!";
		// Remove spaces and convert to lowercase if needed
		inputString = inputString.replaceAll("\\s+", "").toLowerCase();

		// Assuming ASCII characters (0-127)
		int[] charCount = new int[128];

		// Iterate through the characters in the string
		for (char c : inputString.toCharArray()) {
			// Increment the count for the character
			charCount[c]++;
			System.out.println(c);
		}

		// Display the character occurrences
		for (int i = 0; i < charCount.length; i++) {
			if (charCount[i] > 0) {
				System.out.println("'" + (char) i + "' occurs " + charCount[i] + " times.");
			}
		}
	}
}
