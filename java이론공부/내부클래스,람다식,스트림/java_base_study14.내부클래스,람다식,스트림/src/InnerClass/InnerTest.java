package InnerClass;

class OutClass {
	private int num = 10;//�ܺ� Ŭ���� private ����
	private static int sNum = 20;//�ܺ�Ŭ���� static ����
	
	private InClass inClass;//���� Ŭ���� �ڷ��� ������ ���� ����
	
	//�ܺ� Ŭ������ �������� ���� Ŭ���� ����
	public OutClass() {
		inClass = new InClass();
	}
	
	//���� Ŭ����
	class InClass{
		int inNum = 100;
		
		void inTest() {
			System.out.println("OuterClass num ="+num+"�ܺ� Ŭ���� �ν��Ͻ�");
			System.out.println("OuterClass sNum = "+sNum+"�ܺ�Ŭ���� ��������");
		}
		//���� Ŭ�������� ���������� �����Ҽ� ����
		//void static asTest()
	}
	public void usingClass() {
		inClass.inTest();
	}
}

public class InnerTest {

	public static void main(String[] args) {
		OutClass outClass = new OutClass();//�ܺ� Ŭ���� ����
		System.out.println("�ܺ� Ŭ���� �̿��Ͽ� ���� Ŭ���� ��� ȣ��");
		outClass.usingClass();//�ܺ�Ŭ���� ��ü���� ���� Ŭ���� ��� ȣ��
	}

}
