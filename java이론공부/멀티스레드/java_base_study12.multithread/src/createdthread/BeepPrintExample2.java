package createdthread;

import java.awt.Toolkit;

public class BeepPrintExample2 {

	public static void main(String[] args) {
		Runnable beeptask = new BeepTask();
		Thread thread = new Thread(beeptask);
		thread.start();
		
		/*//���ٽ����� ������ �����ϴ� ���
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
		
		//�� ���ڿ� 5�� ����ϴ� �۾�
				for(int i=0;i<5;i++) {
					System.out.println("��");
					try {Thread.sleep(500);}catch(Exception e) {}
				}

	}

}
