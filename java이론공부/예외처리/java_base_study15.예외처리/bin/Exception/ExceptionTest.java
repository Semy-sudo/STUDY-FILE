package school.java.day1;

class NewException extends Exception {} //exception�� ����ϴ� NewException

public class ExceptionTest {
	static void methodA() throws NewException {
		System.out.println("���ܸ� �����ϴ�.");
		throw new NewException();
	}
	public static void main(String[] args) {
		NewException ne = new NewException();
		try {
			System.out.println("methodA()�� �����մϴ�.");
			methodA();
			System.out.println("�� ������ �򰡵ɱ��");
		}catch(NewException e) {
			System.out.println("NewException �� ���ܸ� �޾ҽ��ϴ�.");
		}
		System.out.println("try-catch ���� ����߽��ϴ�.");
	}

}
