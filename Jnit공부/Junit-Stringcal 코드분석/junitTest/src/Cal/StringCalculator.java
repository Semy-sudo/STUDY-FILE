package Cal;

public class StringCalculator {
	static char separator = ',';
	static char customSep = ';';
	
	public int add(String s) throws Exception {
		
		int res = 0;
		int start = 0, finish = s.length();
		boolean custom = false;
		String tmp = "";
		
		if(s==null || s.isEmpty()) return 0;
		
		//ù��° ���ڰ� /�ν����ϸ� custom�� true
		if(s.charAt(0)=='/') {
			customSep = s.charAt(2);
			start = 4;
			custom = true;
		}
		if(!s.contains(separator+"") && !s.contains(customSep+"")) {
			return Integer.parseInt(s);
		}
		
		// 1;2;3 ���� �����ϰ� ����
		for(int i=start; i<finish; i++) {
			if(isNumber(s.charAt(i))) {
				//�������¸� ��Ƽ� �� �����ֱ�
				tmp = tmp + s.charAt(i);
			} else {
				//�������°� �ƴ� ; / ' , ���� ���Ë�
				if(isSeparator(s.charAt(i), custom)) {
					// ;�̸� �ǳʶٱ�
					res += Integer.parseInt(tmp);
					tmp = "";
				} else {
					// ;�� ���ڿܿ� ������ ���� ���� ���ܹ߻�!!
					if(s.charAt(i)=='-') System.out.println("Runtime Exception");
					else System.out.println("Separator ERROR");
				}
			}
		}
		res += Integer.parseInt(tmp);
		
		return res;
	}
	
	//c�� ��������(0~9)�̸� true �ƴϸ� false
	boolean isNumber(char c) {
		return '0'<=c && c<='9';
	}
	//���ڿ��� /�ν����ؼ� custom �� true�ΰ��  ;�� ���ð�츸 true ���� 
	// 
	boolean isSeparator(char c, boolean custom) {
		if(custom) return c==customSep;
		else return (c==separator || c== customSep);
	}
}
