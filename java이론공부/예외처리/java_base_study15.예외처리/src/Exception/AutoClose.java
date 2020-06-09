package Exception;

public class AutoClose{

	public static void main(String[] args) {
		try (AutoCloseobj auto = new AutoCloseobj()){
			throw new Exception();//강제 예외 발생
		} catch (Exception e) {
			System.out.println("예외부분입니다.");
		}
	}

	

}
