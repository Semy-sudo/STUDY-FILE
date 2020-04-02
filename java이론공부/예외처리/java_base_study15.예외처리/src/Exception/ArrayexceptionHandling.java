package Exception;

public class ArrayexceptionHandling {

	public static void main(String[] args) {
		//int형 배열을 크기5로 동적할당 하고 더많게 할당해줌
		int[] a = new int[5];
		for(int i=0;i<=5;i++) {
			try {
			a[i] = i;
			System.out.println(a[i]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외가 발생했습니다");
			
			}
		}

	}

}
