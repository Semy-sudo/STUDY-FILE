package createdthread;

import java.awt.Toolkit;
//하위 클래스로 새로운 Thread클래스 만들기
public class BeepThread extends Thread{
	@Override
	public void run() {
		//비프음을 5번 반복 소리나게 하는 작업
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++) {
			toolkit.beep();
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}
	

}
