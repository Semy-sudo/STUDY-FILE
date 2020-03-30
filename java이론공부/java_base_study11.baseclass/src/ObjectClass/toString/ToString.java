package ObjectClass.toString;

//최상위 Object 클래스 > String toString 메서드:
//객체를 문자열로 표현하여 반환
//재정의하여 객체에 대한 설명이나 특정멤버 변수값 반환

public class ToString {

	public static void main(String[] args) {
		Book book1 = new Book(5,"피터팬");
		System.out.println(book1);
		System.out.println(book1.toString());//Object클래스이름 @해시코드값
	}

}
