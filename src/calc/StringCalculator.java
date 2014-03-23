package calc;

public class StringCalculator {

	// Calculate sum of digits within the string numbers
	// Numbers format: "1,5,7"
	public int Add(String numbers) throws InputStringFormatException {
		int result = 0;

		if (numbers.isEmpty())
			return 0;

		// last char can't be a delimiter
		String lastChar = numbers.substring(numbers.length() - 1,
				numbers.length());
		if (lastChar.equalsIgnoreCase(","))
			throw new InputStringFormatException(
					"Input string has incorrect format: can't end with ','");

		String[] inputStringArray = numbers.split(",");
		int[] inputArray = new int[inputStringArray.length];

		for (int i = 0; i < inputStringArray.length; i++) {
			try {
				inputArray[i] = Integer.parseInt(inputStringArray[i]);
			} catch (NumberFormatException nfe) {
				// Not an integer, log exception
			}
		}

		result = Sum(inputArray);

		// throw new InputStringFormatException();
		return result;
	}

	// Calculate sum for array of integers
	private int Sum(int[] array) {
		int result = 0;
		for (int n : array) {
			result += n;
		}

		return result;
	}

}
