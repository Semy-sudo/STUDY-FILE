package ObjectClass.hashcode;

public class EqualsTest {

	public static void main(String[] args) {
		Student Lee = new Student(1000,"이상우");
		Student Sang = new Student(1000,"이상우");
		
		System.out.println("Student Lee hashCode:"+Lee.hashCode());
		System.out.println("Student Sang hashCode:"+Sang.hashCode());
		System.out.println("studentLee의 실제 주소값:"+System.identityHashCode(Lee));
		System.out.println("studentSang의 실제 주소값:"+System.identityHashCode(Sang));

	}

}
