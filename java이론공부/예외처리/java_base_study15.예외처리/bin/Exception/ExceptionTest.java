package school.java.day1;

class NewException extends Exception {} //exception을 상속하는 NewException

public class ExceptionTest {
	static void methodA() throws NewException {
		System.out.println("예외를 던집니다.");
		throw new NewException();
	}
	public static void main(String[] args) {
		NewException ne = new NewException();
		try {
			System.out.println("methodA()를 실행합니다.");
			methodA();
			System.out.println("이 문장이 평가될까요");
		}catch(NewException e) {
			System.out.println("NewException 이 예외를 받았습니다.");
		}
		System.out.println("try-catch 문을 통과했습니다.");
	}

}
