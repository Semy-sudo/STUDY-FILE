package InnerClass;

class OutClass {
	private int num = 10;//외부 클래스 private 변수
	private static int sNum = 20;//외부클래스 static 변수
	
	private InClass inClass;//내부 클래스 자료형 변수를 먼저 선언
	
	//외부 클래스가 생성된후 내부 클래스 생성
	public OutClass() {
		inClass = new InClass();
	}
	
	//내부 클래스
	class InClass{
		int inNum = 100;
		
		void inTest() {
			System.out.println("OuterClass num ="+num+"외부 클래스 인스턴스");
			System.out.println("OuterClass sNum = "+sNum+"외부클래스 정적변수");
		}
		//내부 클래스에서 정적변수는 선언할수 없음
		//void static asTest()
	}
	public void usingClass() {
		inClass.inTest();
	}
}

public class InnerTest {

	public static void main(String[] args) {
		OutClass outClass = new OutClass();//외부 클래스 생성
		System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
		outClass.usingClass();//외부클래스 객체에서 내부 클래스 기능 호출
	}

}
