package M1;

import java.util.Scanner;

public class Stack {

	public static void main(String[] args) {
		//��ɾ� push, pop size empty top
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����� ��ɾ��� ���� �Է��Ͻÿ�:");
		int n=sc.nextInt(); //��ɾ��� ��
		int[] arr = new int[n];
		int top = -1;
		String input; //���
		
		for(int i=0;i<n;i++) {
			System.out.println("��ɾ �Է��Ͻÿ�");
			input = sc.next();
			if(input.equals("push")) {
				top ++;
				arr[top]=sc.nextInt();//int �� �����ϱ�
			}else if(input.equals("pop")) {
				if(top == -1) {
					System.out.println(-1);
				}else {
					System.out.println(arr[top]);//�� �������� ����
					top--;//top��ĭ ������
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
