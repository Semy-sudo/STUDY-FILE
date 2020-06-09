package Exception;

public class IDformatTest {
	private String userId;

	public String getUserId() {
		return userId;
	}
	//����� ���� ����
	//id�� null���̰ų� ���̰� 8�����۰ų� 20 ������ ���ܹ߻�
	public void setUserId(String userId) throws IDformatException {
		
		if(userId == null) {
			throw new IDformatException("���̵� �����ϴ�");//������ ���� �߻���Ŵ
		}else if(userId.length()<=8 || userId.length()>=20) {
			throw new IDformatException("���̵� ���̸� �ٽ� ���� �ּ���");//���� ����
		}
		this.userId = userId;
	}

	public static void main(String[] args) {
		IDformatTest test = new IDformatTest();
		
		String userId = null;
		
		try {
			test.setUserId(userId);//���ܹ߻�
		} catch (IDformatException e) {
			System.out.println(e.getMessage());
		}
		
		String userId1 = "1234";
		try {
			test.setUserId(userId1);//���ܹ߻�
		} catch (IDformatException e) {
			System.out.println(e.getMessage());
		}

	}

}
