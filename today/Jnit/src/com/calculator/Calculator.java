package com.calculator;

import java.util.Arrays;



public class Calculator{
	public static String str;
		
	
		//1,2,3
		int oneadd(String str){
			String[] arr1 = str.split(",");
			int sum = 0;
			
			int[] arr2 = Arrays.stream(arr1).mapToInt(Integer::parseInt).toArray();//���ڿ��迭->�������迭
			for(int arr2_value : arr2)	if (arr2_value<0) throw new NegativeValueException("oneadd�������� ���");
			for(int i : arr2)	sum += i;
			return sum;
		}
		
		//1,2;3
		int mixadd(String str){
			String[] arr1 = str.split(";");//1,2 �׸��� 3
			int sum=0;
			
			for(int i=0;i<arr1.length;i++) {
				sum += oneadd(arr1[i]); //arr1[0]=1,2 arr1[1]=3
			}
			return sum;
			
		}
		
		// \\;/n1;2;3
		int anotheradd(String str){
			String[] array_word;//string�� �ѱ��ھ� ���� �迭
			//String[] array_word2;//�տ��� �ڸ��� �ٽ� ���� �迭
			array_word = str.split("");// / / ; \ n 1 ; 2 ; 3
			
			String delimiter = null;
			int sum = 0;
			//������ ���ڿ��� ��ġ ��ȯ
			int s = 0;
			s = str.indexOf("//");//0 1
			int k = 0;
			k = str.indexOf("\n");//3 4
			if((k-s) == 3) {
				sum += Integer.parseInt(array_word[k+1]); //���ڿ�1�� int������ �ٲ㼭 �־���
				if(Integer.parseInt(array_word[k+1])<0) throw new NegativeValueException("anotheradd���� ���� ���");
				delimiter = array_word[k-1];//;
			}
	
			String[] arr1 = str.split(delimiter);
			
			for(int i=2;i<arr1.length;i++) {
				sum += Integer.parseInt(arr1[i]);
				if (Integer.parseInt(arr1[i])<0) throw new NegativeValueException("anotheradd�������� ���");
			}
			return sum;
		}
		
	
		
}








