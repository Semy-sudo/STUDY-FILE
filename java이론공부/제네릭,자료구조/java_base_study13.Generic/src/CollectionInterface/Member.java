package CollectionInterface;
//Collection �������̽��� �ϳ��� �� �����Ҷ� ����
//�����������̽�-List,Set
//List: ������ �ִ� �ڷ����, �ߺ���� ex)ArrayList, Vectior, LinkedList,Stack, Queue
//Set: ��������, �ߺ��ȵ� ex)HashSet,TressSet

//�������� ����� ȸ��
public class Member {
	private int memberId;
	private String memberName;
	
	public Member(int memberId,String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public String toString() {
		return memberName + "ȸ������ ���̵��: "+memberId;
	}
}
