package CollectionInterface.arraylist;
import java.util.ArrayList;
import CollectionInterface.Member;
//�����ڷᱸ��->�迭�� ������ Ŭ���� - ArrayList, Vector
//ArrayList Ŭ����: ��ü�迭�� ������ Ŭ����

//ArrayList�� Ȱ���� ȸ������ ���α׷�
public class MemberArrayList {
	private ArrayList<Member> arraylist;
	
	//������
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
			System.out.println("���̵� �������� �ʽ��ϴ�");
		}return false;
	}
	
	public void showAllMember() {
		for(Member member: arraylist) {
			System.out.println(member);
		}
		System.out.println();
	}
	
	

}
