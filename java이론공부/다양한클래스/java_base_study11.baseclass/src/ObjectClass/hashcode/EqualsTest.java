package ObjectClass.hashcode;

public class EqualsTest {

	public static void main(String[] args) {
		Student Lee = new Student(1000,"�̻��");
		Student Sang = new Student(1000,"�̻��");
		
		System.out.println("Student Lee hashCode:"+Lee.hashCode());
		System.out.println("Student Sang hashCode:"+Sang.hashCode());
		System.out.println("studentLee�� ���� �ּҰ�:"+System.identityHashCode(Lee));
		System.out.println("studentSang�� ���� �ּҰ�:"+System.identityHashCode(Sang));

	}

}
