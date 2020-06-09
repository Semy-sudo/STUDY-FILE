package CollectionInterface.arraylist;
import java.util.ArrayList;
import CollectionInterface.Member;
//순차자료구조->배열을 구현한 클래스 - ArrayList, Vector
//ArrayList 클래스: 객체배열을 구현한 클래스

//ArrayList를 활용해 회원관리 프로그램
public class MemberArrayList {
	private ArrayList<Member> arraylist;
	
	//생성자
	public MemberArrayList() {
		arraylist = new ArrayList<Member>();
	}
	public void addMember(Member member) {
		arraylist.add(member);
	}
	public boolean removeMember(int memberId) {
		for(int i=0;i<arraylist.size();i++) {
			Member member = arraylist.get(i);
			int tempId = member.getMemberId();
			if(memberId == tempId) {
				arraylist.remove(i);
				return true;
			}
			System.out.println("아이디가 존재하지 않습니다");
		}return false;
	}
	
	public void showAllMember() {
		for(Member member: arraylist) {
			System.out.println(member);
		}
		System.out.println();
	}
	
	

}
