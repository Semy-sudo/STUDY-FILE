package M1;

import java.util.Scanner;

public class ����11047 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int coinNum;//n����
		int[] coin = new int[100];
		int sum;
		Scanner sc = new Scanner(System.in);
		
		coinNum = sc.nextInt();
		sum = sc.nextInt();//sum ����µ� �ʿ��� �ּ� ��������
		
		int k=1;
		//���� ���� �Է¹ޱ�
		for(int i=0;i<coinNum;i++) {
			coin[i] = sc.nextInt();
			sc.nextLine();
			
		}
	
		//���µ����� sum ���� ū���� ����
		for(int i=0;i<coinNum;i++) {
			
			if(coin[i]>sum) {
			k=i;
			break;}
		}
		
		//1000 4�� 500 1�� 100 2�� 50 1�� 10 4�� 
		
		//k-1��° �迭���� ���
		int n=0;//��
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
