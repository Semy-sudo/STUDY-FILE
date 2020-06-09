package M1;

import java.util.Arrays;
import java.util.Scanner;

public class 백준11399 {
	
	//static:프로그램이 종료되는 시점까지 계속 유지
		//다른 클래스,메소드,변수 등 java virtual machine 의 GC에 의해 용도후 삭제됨
		public static void swap(int[] arr,int a,int b) {
			int temp = arr[a];
			arr[a] = arr[b];
			arr[b] = temp;
		}
		
		

	public static void main(String[] args) {
		
	
		int n=0;//사람의 수
		int[] p=new int[1000];//시간
		
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			p[i] = sc.nextInt();//시간 다 입력받고
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
