package Exception;

public class IDformatTest {
	private String userId;

	public String getUserId() {
		return userId;
	}
	//사용자 예외 정의
	//id가 null값이거나 길이가 8보다작거나 20 넘으면 예외발생
	public void setUserId(String userId) throws IDformatException {
		
		if(userId == null) {
			throw new IDformatException("아이디가 없습니다");//강제로 예외 발생시킴
		}else if(userId.length()<=8 || userId.length()>=20) {
			throw new IDformatException("아이디 길이를 다시 정해 주세요");//강제 예외
		}
		this.userId = userId;
	}

	public static void main(String[] args) {
		IDformatTest test = new IDformatTest();
		
		String userId = null;
		
		try {
			test.setUserId(userId);//예외발생
		} catch (IDformatException e) {
			System.out.println(e.getMessage());
		}
		
		String userId1 = "1234";
		try {
			test.setUserId(userId1);//예외발생
		} catch (IDformatException e) {
			System.out.println(e.getMessage());
		}

	}

}
