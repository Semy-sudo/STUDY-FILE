package M1;

import java.util.Scanner;

public class ����1931 {

	public static void main(String[] args) {
		int n;//ȸ���� �� 
		int[] start=new int[100];//ȸ�� ���� �ð�
		int[] end=new int[100];//ȸ�� ������ �ð�
		
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();//ȸ�� �� ���� �Է�
		sc.nextLine();
		//�� ȸ�ǿ� ���� ���۽ð�, ���ð� �Է�
		for(int i=0;i<n;i++) {
			start[i] = sc.nextInt();
			end[i] = sc.nextInt();
			sc.nextLine();
		}
		//
		int num=1;
		int k=0;
		for(int i=0;i<n-1;i++) {
			if(end[k]<=start[i+1]) {
				num++;
				k=i+1;
			}
			System.out.println("k:"+k+"num:"+num);
		}
		System.out.println(num);

	}

}
