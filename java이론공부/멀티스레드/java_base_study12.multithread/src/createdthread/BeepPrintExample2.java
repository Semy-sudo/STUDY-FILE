package createdthread;

import java.awt.Toolkit;

public class BeepPrintExample2 {

	public static void main(String[] args) {
		Runnable beeptask = new BeepTask();
		Thread thread = new Thread(beeptask);
		thread.start();
		
		/*//람다식으로 스레드 생성하는 방법
		Thread thread = new Thread( ()->{
			
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i=0;i<5;i++) {
				toolkit.beep();
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		thread.start();
		*/
		
		//띵 문자열 5번 출력하는 작업
				for(int i=0;i<5;i++) {
					System.out.println("띵");
					try {Thread.sleep(500);}catch(Exception e) {}
				}

	}

}
