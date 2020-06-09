package System;

import java.io.IOException;

public class SystemInTest1 {

	public static void main(String[] args) throws IOException {
		System.out.println("알파벳 하나를 쓰고[Enter]누르시오");
		int i;
		i = System.in.read();
		System.out.println(i);
		System.out.println((char)i);
	}

}
