package Exception;

public class AutoClose{

	public static void main(String[] args) {
		try (AutoCloseobj auto = new AutoCloseobj()){
			throw new Exception();//���� ���� �߻�
		} catch (Exception e) {
			System.out.println("���ܺκ��Դϴ�.");
		}
	}

	

}
