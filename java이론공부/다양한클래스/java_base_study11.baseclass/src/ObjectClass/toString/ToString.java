package ObjectClass.toString;

//�ֻ��� Object Ŭ���� > String toString �޼���:
//��ü�� ���ڿ��� ǥ���Ͽ� ��ȯ
//�������Ͽ� ��ü�� ���� �����̳� Ư����� ������ ��ȯ

public class ToString {

	public static void main(String[] args) {
		Book book1 = new Book(5,"������");
		System.out.println(book1);
		System.out.println(book1.toString());//ObjectŬ�����̸� @�ؽ��ڵ尪
	}

}
