package System;

import java.io.Console;

public class ConsoleTest {

	public static void main(String[] args) {
		Console console = System.console();
		
		System.out.println("이름:");
		String name = console.readLine();//문자열을 읽습니다
		System.out.println("직업:");
		String job = console.readLine();//문자열을 읽습니다
		
		System.out.println(name);
		System.out.println(job);
	}

}
