package System;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);//�ڷ� �о���̴� ���
		
		System.out.println("�̸�?");
		String name = scanner.nextLine();//���ڿ��� �н��ϴ�
		
		System.out.println("����?");
		String job = scanner.nextLine();
		System.out.println("���?");
		int num = scanner.nextInt();//�������� �н��ϴ�
		
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(num);
	}

}
