package CollectionInterface.arraylist;
import CollectionInterface.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberarraylist = new MemberArrayList();
		Member memberLee = new Member(1001,"ÀÌÁö¿ø");
		
		memberarraylist.addMember(memberLee);
		memberarraylist.showAllMember();
		

	}

}
