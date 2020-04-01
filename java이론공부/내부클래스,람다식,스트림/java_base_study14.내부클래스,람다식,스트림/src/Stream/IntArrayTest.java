package Stream;

import java.util.Arrays;

public class IntArrayTest {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		int sumVal = Arrays.stream(arr).sum();//배열 요소 총합
		int count = (int)Arrays.stream(arr).count();//배열 요소 개수 ㅏㄴ환
		
		System.out.println(sumVal);
		System.out.println(count);

	}

}
