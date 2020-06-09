package CollectionInterface;
//Collection 인터페이스는 하나의 값 저장할때 쓰임
//하위인터페이스-List,Set
//List: 순서가 있는 자료관리, 중복허용 ex)ArrayList, Vectior, LinkedList,Stack, Queue
//Set: 순서없음, 중복안됨 ex)HashSet,TressSet

//공통으로 사용할 회원
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
		return memberName + "회원님의 아이디는: "+memberId;
	}
}
