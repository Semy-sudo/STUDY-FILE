package M1;

import java.util.Scanner;

public class 백준1931 {

	public static void main(String[] args) {
		int n;//회의의 수 
		int[] start=new int[100];//회의 시작 시간
		int[] end=new int[100];//회의 끝나는 시간
		
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();//회의 총 개수 입력
		sc.nextLine();
		//총 회의에 대한 시작시간, 끝시간 입력
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
