public class Calculator {	
	public static void main(String[] args) {
		int firstElement = 5;
		int secondElement = 2;
		char command = '^';
		int result = 1;

		if (command == '+') {
			result = firstElement + secondElement;
		} else if (command == '-') {
			result = firstElement - secondElement;
		} else if (command == '*') {
			result = firstElement * secondElement;
		} else if (command == '/') {
			result = firstElement / secondElement;
		} else if (command == '%') {
			result = firstElement % secondElement;
		} else if (command == '^') {
			for (int power = 0; power < secondElement; power++){
				result *= firstElement;
			}
		} else {
			System.out.println("ERROR: Unknown operator '" + command + "'");
			return;
		}
		
		System.out.println(firstElement + " " + command + " " + secondElement + " = " + result);					
	}
}
