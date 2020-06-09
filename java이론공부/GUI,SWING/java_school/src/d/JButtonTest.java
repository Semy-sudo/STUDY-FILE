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
		super("버튼테스트");
		JPanel buttonPanel = new JPanel();//패널생성
		JButton btn = new JButton("Button");//버튼 생성
		buttonPanel.add(btn);//패널에 버튼넣기
		
	
		//취미 레이블
		JLabel lblHobby = new JLabel("취미");
		//체크박스
		JCheckBox check1 = new JCheckBox("운동");
		JCheckBox check2 = new JCheckBox("독서");
		JCheckBox check3 = new JCheckBox("줄넘기");
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
