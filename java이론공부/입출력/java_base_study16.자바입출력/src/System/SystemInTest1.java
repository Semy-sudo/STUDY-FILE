package System;

import java.io.IOException;

public class SystemInTest1 {

	public static void main(String[] args) throws IOException {
		System.out.println("���ĺ� �ϳ��� ����[Enter]�����ÿ�");
		int i;
		i = System.in.read();
		System.out.println(i);
		System.out.println((char)i);
	}

}
