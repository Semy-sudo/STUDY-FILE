package createdthread;

import java.awt.Toolkit;

public class BeepPrintExample1 {
	//JVM�� ����
	public static void main(String[] args) {
		//�ΰ��� ������ ���� ����
		
		//�������� 5�� �ݺ� �Ҹ����� �ϴ� �۾�
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++) {
			toolkit.beep();
			try {Thread.sleep(500);}catch(Exception e) {}
		}
		
		//�� ���ڿ� 5�� ����ϴ� �۾�
		for(int i=0;i<5;i++) {
			System.out.println("��");
			try {Thread.sleep(500);}catch(Exception e) {}
		}

	}

}
