package M1;

import java.util.Arrays;
import java.util.Scanner;

public class ����11399 {
	
	//static:���α׷��� ����Ǵ� �������� ��� ����
		//�ٸ� Ŭ����,�޼ҵ�,���� �� java virtual machine �� GC�� ���� �뵵�� ������
		public static void swap(int[] arr,int a,int b) {
			int temp = arr[a];
			arr[a] = arr[b];
			arr[b] = temp;
		}
		
		

	public static void main(String[] args) {
		
	
		int n=0;//����� ��
		int[] p=new int[1000];//�ð�
		
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			p[i] = sc.nextInt();//�ð� �� �Է¹ް�
		}
	
		
		for(int i=0; i<n-1; i++) {
			for(int j=i; j<n-1; j++) {
				
				if(p[i]>p[j+1])
					swap(p,i,j+1);
				
			}
			
			
		}
		
		int sum=0;
		for(int i=0;i<n;i++) {
			
			sum += (p[i]*(n-i));
			
			System.out.println(sum);
		}
		
		System.out.println(sum);
		
		//1 1+2 1+2+3 1+2+3+4
		//1*4+2*3+3*2+4*1 = 20
		
	
		
	}
	
	
	

}
