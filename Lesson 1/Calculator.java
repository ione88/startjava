public class Calculator {	
	public static void main(String[] args) {
		int first = 5;
		int second = 2;
		char binaryOperator = '^';

		int result = first;
		boolean isUnknownOperator = false;
		if (binaryOperator == '+') {
			result += second;
		} else if (binaryOperator == '-') {
			result -= second;
		} else if (binaryOperator == '*') {
			result *= second;
		} else if (binaryOperator == '/') {
			result /= second;
		} else if (binaryOperator == '%') {
			result %= second;
		} else if (binaryOperator == '^') {
			for (int power = 1; power < second; power++){
				result *= first;
			}
		} else {
			isUnknownOperator = true;
		}
		if (isUnknownOperator){
			System.out.println("ERROR: Unknown operator '" + binaryOperator + "'");
		} else{
			System.out.println(first + " " + binaryOperator + " " + second + " = " + result);					
		}
	}
}
