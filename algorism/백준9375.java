package M2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class ����9375 {

	public static void main(String[] args) {
		int testcase=0;
		int n=0;//�ǻ� ��
		Map<String, String> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		testcase = sc.nextInt();//�׽�Ʈ ��� ��������
		
		for(int i=0;i<testcase;i++) {
			n = sc.nextInt();//�ǻ� ����
			for(int j=0;j<n;j++) {
				map.put(sc.next(),sc.next()); //�ǻ��̸�, �ǻ����� �Է¹ޱ�
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
