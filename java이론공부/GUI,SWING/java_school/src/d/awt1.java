package d;

import javax.swing.JFrame;

public class awt1 extends JFrame{
	
	//JFrame ������
	public awt1(String title){
		super("J������ �׽�Ʈ");
		setSize(350,300);//â ũ�� ����
		setVisible(true);//â�� ���̰� ��
	}

	public static void main(String[] args) {	
		awt1 a = new awt1("�׽�Ʈ");
		//���� �̺�Ʈ
		a.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
