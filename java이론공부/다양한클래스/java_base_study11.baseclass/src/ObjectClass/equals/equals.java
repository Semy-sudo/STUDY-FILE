package ObjectClass.equals;

public class equals {

	public static void main(String[] args) {
		Student st1 = new Student("syi9595","�ۿ���");
		Student st2 = st1;
		Student st3 = new Student("syi9595","�ۿ���");
		//<st1�� st2��>
		//�ּҰ� ������
		if(st1 == st2) {
			System.out.println("st1 == st2");
		}else {
			System.out.println("st1 =/ st2");
		}
		//��������
		if(st1.equals(st2)) {
			System.out.println("st1 == st2");
		}else {
			System.out.println("st1 =/ st2");
		}
		//<st1�� st3��>
		//�ּҰ� ������
		if(st1 == st3) {
			System.out.println("st1 == st3");
		}else {
			System.out.println("st1 =/ st3");
		}
		//��������
		if(st1.equals(st3)) {
			System.out.println("st1 == st3");
		}else {
			System.out.println("st1 =/ st3");
		}
		//�ּҰ� ������ ���Ҷ� equals �޼ҵ� ����!

	}

}
