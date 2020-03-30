package createdthread;

import java.awt.Toolkit;

public class BeepPrintExample1 {
	//JVM이 실행
	public static void main(String[] args) {
		//두개의 스레드 따로 실행
		
		//비프음을 5번 반복 소리나게 하는 작업
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++) {
			toolkit.beep();
			try {Thread.sleep(500);}catch(Exception e) {}
		}
		
		//띵 문자열 5번 출력하는 작업
		for(int i=0;i<5;i++) {
			System.out.println("띵");
			try {Thread.sleep(500);}catch(Exception e) {}
		}

	}

}
