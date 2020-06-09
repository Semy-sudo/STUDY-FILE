package ObjectClass.equals;

public class equals {

	public static void main(String[] args) {
		Student st1 = new Student("syi9595","송예인");
		Student st2 = st1;
		Student st3 = new Student("syi9595","송예인");
		//<st1과 st2비교>
		//주소가 같은지
		if(st1 == st2) {
			System.out.println("st1 == st2");
		}else {
			System.out.println("st1 =/ st2");
		}
		//동일한지
		if(st1.equals(st2)) {
			System.out.println("st1 == st2");
		}else {
			System.out.println("st1 =/ st2");
		}
		//<st1과 st3비교>
		//주소가 같은지
		if(st1 == st3) {
			System.out.println("st1 == st3");
		}else {
			System.out.println("st1 =/ st3");
		}
		//동일한지
		if(st1.equals(st3)) {
			System.out.println("st1 == st3");
		}else {
			System.out.println("st1 =/ st3");
		}
		//주소가 같은지 비교할때 equals 메소드 쓴다!

	}

}
