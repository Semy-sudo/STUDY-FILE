package System;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);//자료 읽어들이는 기능
		
		System.out.println("이름?");
		String name = scanner.nextLine();//문자열을 읽습니다
		
		System.out.println("직업?");
		String job = scanner.nextLine();
		System.out.println("사번?");
		int num = scanner.nextInt();//정수형을 읽습니다
		
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(num);
	}

}
