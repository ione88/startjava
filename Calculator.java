public class Calculator {	
	public static void main(String[] args) {
		int first = 5;
		int second = 6;
		char binaryOperator = '-';

		if (binaryOperator == '+') {
			System.out.println(first + second);
		} else if (binaryOperator == '-') {
			System.out.println(first - second);
		} else if (binaryOperator == '*') {
			System.out.println(first * second);
		} else if (binaryOperator == '/') {
			System.out.println(first / second);
		} else if (binaryOperator == '%') {
			System.out.println(first % second);
		} else if (binaryOperator == '^') {
			int result = 1;
			for (int power = 0; power < second; power++){
				result *= first;
			}
			System.out.println(result);
		} else {
			System.out.println("Unknown Operator: '" + binaryOperator + "'");
		}
	}
}
