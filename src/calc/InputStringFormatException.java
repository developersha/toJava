package calc;

//Custom Exception to be thrown when input string has not expected format
public class InputStringFormatException extends Exception {
	
	private static final long serialVersionUID = 1L;

	// Parameterless Constructor
	public InputStringFormatException() {
	}

	// Constructor that accepts a message
	public InputStringFormatException(String message) {
		super(message);
	}
}
