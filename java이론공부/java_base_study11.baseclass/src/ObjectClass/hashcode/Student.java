package ObjectClass.hashcode;

public class Student {
	int studentId;
	String studentName;
	
	public Student(int studentId,String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	@Override
	public int hashCode() {
		return studentId;
	}

}
