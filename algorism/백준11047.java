package M1;

import java.util.Scanner;

public class 백준11047 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int coinNum;//n종류
		int[] coin = new int[100];
		int sum;
		Scanner sc = new Scanner(System.in);
		
		coinNum = sc.nextInt();
		sum = sc.nextInt();//sum 만드는데 필요한 최소 동전개수
		
		int k=1;
		//동전 종류 입력받기
		for(int i=0;i<coinNum;i++) {
			coin[i] = sc.nextInt();
			sc.nextLine();
			
		}
	
		//들어온동전중 sum 보다 큰데서 끊기
		for(int i=0;i<coinNum;i++) {
			
			if(coin[i]>sum) {
			k=i;
			break;}
		}
		
		//1000 4개 500 1개 100 2개 50 1개 10 4개 
		
		//k-1번째 배열까지 사용
		int n=0;//몫
		n = sum/coin[k-1];//4
		int nsum = n;
		
		int remain = sum%coin[k-1];	//200
		
			for(int i=1;i<k-1;i++) {
				
				if(remain>coin[k-1-i]) {
					n = remain/coin[k-1-i];//2
					nsum +=n;
					remain -=n*coin[k-1-i]; 
					if(remain == 0) break;
				}
				System.out.println(coin[k-1-i]+":"+nsum);
				
			}
			
			System.out.println(nsum);
		
		

	}

}
