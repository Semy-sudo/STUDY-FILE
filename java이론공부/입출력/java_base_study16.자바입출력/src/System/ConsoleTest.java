package System;

import java.io.Console;

public class ConsoleTest {

	public static void main(String[] args) {
		Console console = System.console();
		
		System.out.println("�̸�:");
		String name = console.readLine();//���ڿ��� �н��ϴ�
		System.out.println("����:");
		String job = console.readLine();//���ڿ��� �н��ϴ�
		
		System.out.println(name);
		System.out.println(job);
	}

}
