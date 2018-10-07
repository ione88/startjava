public class MyFirstGame {	
	public static void main(String[] args) {
        int left = 0;
        int right = 100;

        int secretNumber = 51;

		int userAttempt = (right + left) / 2;
        while (userAttempt != secretNumber) {
            System.out.println(">>" + userAttempt);               
            if (userAttempt > secretNumber) {
                System.out.println("<< ��������� ���� ����� ������ ����, ��� ������� ���������");   
                right = userAttempt;
                userAttempt = (left + userAttempt) / 2;
            } else {
                System.out.println("<< ��������� ���� ����� ������ ����, ��� ������� ���������");  
                left = userAttempt;
                userAttempt = (userAttempt + right) / 2;
            }
        }
        System.out.println(">>" + userAttempt);   
        System.out.println("<< �� �������!");  
	}
}
