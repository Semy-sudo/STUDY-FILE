package ObjectClass.equals;

public class Student {
	String studentID;
	String studentName;
	
	public Student(String studentID,String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}
	
	//studentID �� ������ ���� �л�����  
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(this.studentID == std.studentID) return true;
			else return false;
		}
		return false;
	}

}
