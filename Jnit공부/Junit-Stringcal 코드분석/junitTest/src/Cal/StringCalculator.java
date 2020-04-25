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
		
		//첫번째 문자가 /로시작하면 custom은 true
		if(s.charAt(0)=='/') {
			customSep = s.charAt(2);
			start = 4;
			custom = true;
		}
		if(!s.contains(separator+"") && !s.contains(customSep+"")) {
			return Integer.parseInt(s);
		}
		
		// 1;2;3 부터 시작하게 설정
		for(int i=start; i<finish; i++) {
			if(isNumber(s.charAt(i))) {
				//숫자형태만 모아서 싹 더해주기
				tmp = tmp + s.charAt(i);
			} else {
				//숫자형태가 아닌 ; / ' , 등이 나올떄
				if(isSeparator(s.charAt(i), custom)) {
					// ;이면 건너뛰기
					res += Integer.parseInt(tmp);
					tmp = "";
				} else {
					// ;나 숫자외에 음수가 들어온 경우는 예외발생!!
					if(s.charAt(i)=='-') System.out.println("Runtime Exception");
					else System.out.println("Separator ERROR");
				}
			}
		}
		res += Integer.parseInt(tmp);
		
		return res;
	}
	
	//c가 숫자형태(0~9)이면 true 아니면 false
	boolean isNumber(char c) {
		return '0'<=c && c<='9';
	}
	//문자열이 /로시작해서 custom 이 true인경우  ;가 나올경우만 true 리턴 
	// 
	boolean isSeparator(char c, boolean custom) {
		if(custom) return c==customSep;
		else return (c==separator || c== customSep);
	}
}
