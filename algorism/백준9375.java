package M2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class 백준9375 {

	public static void main(String[] args) {
		int testcase=0;
		int n=0;//의상 수
		Map<String, String> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		testcase = sc.nextInt();//테스트 몃번 돌릴건지
		
		for(int i=0;i<testcase;i++) {
			n = sc.nextInt();//의상 개수
			for(int j=0;j<n;j++) {
				map.put(sc.next(),sc.next()); //의상이름, 의상종류 입력받기
				System.out.println();
				
				
				
			}
		}
		
	
		Iterator<String> iter = map.keySet().iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			String value = (String)map.get(key);
			
			System.out.println(key+":"+value);
			
		}
		
		
		

	}

}
