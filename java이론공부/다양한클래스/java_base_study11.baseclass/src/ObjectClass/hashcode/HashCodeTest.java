package ObjectClass.hashcode;
//�ؽ�(hash): ���������ϰų� �˻��Ҷ� ����ϴ� �ڷᱸ��
//��� ��������,��� ��������
//index(=������ġ) = hash(key(=��ü����))
public class HashCodeTest {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		//StringŬ������ hashCode()�Լ��� ->���ڿ��� ������ ���� �ؽ��ڵ� ��
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		//IntergerŬ������ hashCode()�Լ��� ->������ ��ȯ
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
	}

}
