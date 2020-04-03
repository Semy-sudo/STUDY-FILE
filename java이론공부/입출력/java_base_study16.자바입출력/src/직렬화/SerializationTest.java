package ����ȭ;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream; //���Ͽ� ����Ʈ ������ �����ϴ� ��Ʈ��
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
//Person �ν��Ͻ� 2�� �������� 
//serial out���Ͽ� �����ϰ� �б�
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
		Person person1 = new Person("�����","��ǥ�̻�");
		Person person2 = new Person("��ö��","���̻�");
		//serial.out ��� ���� ����� �ν��Ͻ�2�� ����
		try(FileOutputStream fos = new FileOutputStream("serial.out")) {
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(person1);
			oos.writeObject(person2);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		//serial.out ���Ͽ� ����� �� �ν��Ͻ� �ҷ�����
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
