public class Calculator {	
	public static void main(String[] args) {
		int firstElement = 5;
		int secondElement = 2;
		char mathOperation = '^';
		int result = 1;

		if (mathOperation == '+') {
			result = firstElement + secondElement;
		} else if (mathOperation == '-') {
			result = firstElement - secondElement;
		} else if (mathOperation == '*') {
			result = firstElement * secondElement;
		} else if (mathOperation == '/') {
			result = firstElement / secondElement;
		} else if (mathOperation == '%') {
			result = firstElement % secondElement;
		} else if (mathOperation == '^') {
			for (int power = 0; power < secondElement; power++){
				result *= firstElement;
			}
		} else {
			System.out.println("ERROR: Unknown operator '" + mathOperation + "'");
			return;
		}
		
		System.out.println(firstElement + " " + mathOperation + " " + secondElement + " = " + result);					
	}
}
