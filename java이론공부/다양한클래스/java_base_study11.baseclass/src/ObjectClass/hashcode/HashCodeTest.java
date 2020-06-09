package ObjectClass.hashcode;
//해시(hash): 정보저장하거나 검색할때 사용하는 자료구조
//어디에 저장할지,어디서 가져올지
//index(=저장위치) = hash(key(=객체정보))
public class HashCodeTest {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		//String클래스의 hashCode()함수는 ->문자열이 같으면 같은 해시코드 값
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		//Interger클래스의 hashCode()함수는 ->정수값 반환
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
	}

}
