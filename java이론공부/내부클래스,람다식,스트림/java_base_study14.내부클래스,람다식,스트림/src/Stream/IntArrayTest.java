package Stream;

import java.util.Arrays;

public class IntArrayTest {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		int sumVal = Arrays.stream(arr).sum();//�迭 ��� ����
		int count = (int)Arrays.stream(arr).count();//�迭 ��� ���� ����ȯ
		
		System.out.println(sumVal);
		System.out.println(count);

	}

}
