package d;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class JButtonTest extends JFrame{
	public JButtonTest() {
		super("��ư�׽�Ʈ");
		JPanel buttonPanel = new JPanel();//�гλ���
		JButton btn = new JButton("Button");//��ư ����
		buttonPanel.add(btn);//�гο� ��ư�ֱ�
		
	
		//��� ���̺�
		JLabel lblHobby = new JLabel("���");
		//üũ�ڽ�
		JCheckBox check1 = new JCheckBox("�");
		JCheckBox check2 = new JCheckBox("����");
		JCheckBox check3 = new JCheckBox("�ٳѱ�");
		buttonPanel.add(lblHobby);
		buttonPanel.add(check1);
		buttonPanel.add(check2);
		buttonPanel.add(check3);
		
		
		add(buttonPanel);
		setLocation(150,200);
		setSize(242,150);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		new JButtonTest();

	}

}
