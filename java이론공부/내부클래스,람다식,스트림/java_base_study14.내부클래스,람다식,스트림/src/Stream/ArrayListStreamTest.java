package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		//List는 인터페이스 ArrayList는 List에 상속된  클래스
		List<String> sList = new ArrayList<String>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("jack");
		
		Stream<String> stream = sList.stream();
		stream.forEach(s->System.out.println(s+" "));
		System.out.println();
		//스트림 생성 // 정렬 // 요소하나씩 꺼내 출력
		sList.stream().sorted().forEach(s->System.out.println(s));
	}

}
