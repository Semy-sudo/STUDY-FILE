package M1;

import java.util.Scanner;

public class Stack {

	public static void main(String[] args) {
		//명령어 push, pop size empty top
		
		Scanner sc = new Scanner(System.in);
		System.out.println("사용할 명령어의 수를 입력하시오:");
		int n=sc.nextInt(); //명령어의 수
		int[] arr = new int[n];
		int top = -1;
		String input; //명령
		
		for(int i=0;i<n;i++) {
			System.out.println("명령어를 입력하시오");
			input = sc.next();
			if(input.equals("push")) {
				top ++;
				arr[top]=sc.nextInt();//int 값 저장하기
			}else if(input.equals("pop")) {
				if(top == -1) {
					System.out.println(-1);
				}else {
					System.out.println(arr[top]);//맨 마지막값 빼기
					top--;//top한칸 내리기
				}
				
			}else if(input.equals("size")) {
				if(top == -1) {
					System.out.println(0);
				}else {
					System.out.println(top+1);
				}
			}else if(input.equals("empty")) {
				if(top == -1) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}	
			}else if(input.equals("top")) {
				if(top == -1) {
					System.out.println(-1);
				}else {
					System.out.println(arr[top]);
				}
			}
			
			
			
			
		}
	
		
		
		
		
		
		
		
		
	}

}
