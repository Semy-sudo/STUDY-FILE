package Test;

public class MusicRunnable extends Thread{
	@Override
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println("������ ����մϴ�");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
