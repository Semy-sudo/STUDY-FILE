package 직렬화;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream; //파일에 바이트 값으로 저장하는 스트림
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
//Person 인스턴스 2개 생성한후 
//serial out파일에 저장하고 읽기
class Person implements Serializable{
	private static final long serialVersionUID = -1503482727281L;
	String name;
	String job;
	
	public Person() {}
	
	public Person(String name,String job) {
		this.name = name;
		this.job = job;
	}
	
	@Override
	public String toString() {
		return name+ ", " +job;
	}
	
}



public class SerializationTest{
	public static void main(String[] args) throws ClassNotFoundException {
		Person person1 = new Person("안재용","대표이사");
		Person person2 = new Person("김철수","상무이사");
		//serial.out 라는 파일 만들어 인스턴스2개 저장
		try(FileOutputStream fos = new FileOutputStream("serial.out")) {
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(person1);
			oos.writeObject(person2);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		//serial.out 파일에 저장된 두 인스턴스 불러오기
		try(FileInputStream fis = new FileInputStream("serial.out")){
			ObjectInputStream ois = new ObjectInputStream(fis);
			Person p1 = (Person)ois.readObject();
			Person p2 = (Person)ois.readObject();
			
			System.out.println(p1);
			System.out.println(p2);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
