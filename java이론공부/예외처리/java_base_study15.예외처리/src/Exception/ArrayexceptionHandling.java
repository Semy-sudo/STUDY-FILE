package Exception;

public class ArrayexceptionHandling {

	public static void main(String[] args) {
		//int�� �迭�� ũ��5�� �����Ҵ� �ϰ� ������ �Ҵ�����
		int[] a = new int[5];
		for(int i=0;i<=5;i++) {
			try {
			a[i] = i;
			System.out.println(a[i]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���ܰ� �߻��߽��ϴ�");
			
			}
		}

	}

}
