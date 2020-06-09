package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		//List�� �������̽� ArrayList�� List�� ��ӵ�  Ŭ����
		List<String> sList = new ArrayList<String>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("jack");
		
		Stream<String> stream = sList.stream();
		stream.forEach(s->System.out.println(s+" "));
		System.out.println();
		//��Ʈ�� ���� // ���� // ����ϳ��� ���� ���
		sList.stream().sorted().forEach(s->System.out.println(s));
	}

}
