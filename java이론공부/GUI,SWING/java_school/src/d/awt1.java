package d;

import javax.swing.JFrame;

public class awt1 extends JFrame{
	
	//JFrame 생성자
	public awt1(String title){
		super("J프레임 테스트");
		setSize(350,300);//창 크기 지정
		setVisible(true);//창을 보이게 함
	}

	public static void main(String[] args) {	
		awt1 a = new awt1("테스트");
		//종료 이벤트
		a.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
