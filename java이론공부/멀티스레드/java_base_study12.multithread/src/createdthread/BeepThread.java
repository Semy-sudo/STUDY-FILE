package createdthread;

import java.awt.Toolkit;
//���� Ŭ������ ���ο� ThreadŬ���� �����
public class BeepThread extends Thread{
	@Override
	public void run() {
		//�������� 5�� �ݺ� �Ҹ����� �ϴ� �۾�
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++) {
			toolkit.beep();
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}
	

}
