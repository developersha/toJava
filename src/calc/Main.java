package calc;

public class Main {

	public static void main(String args[]) {

		StringCalculator calc = new StringCalculator();
		int result = 0;
		try {
			result = calc.Add("1,2,3");
		} catch (InputStringFormatException e) {
			e.printStackTrace();
		}
		System.out.println(result);		
	}

}
