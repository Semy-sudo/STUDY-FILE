package p;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
	
	public int add(String text) {
		if(isBlank(text)) {
			return 0;
		}
		return sum(toInt(split(text)));
	
	}
	//
	private boolean isBlank(String text) {
		return text == null || text.isEmpty();
	}
	//,�������� �ɰ���
	public String[] split(String text) {
		Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
		if(m.find()) {
			String customDelimeter = m.group(1);
			return m.group(2).split(customDelimeter);
		}
		
		return text.split(",|:");
	}
	
	//String �迭 int �迭�� �ٲٱ�
	public int[] toInt(String[] values) {
		int[] numbers = new int[values.length];
		for(int i=0;i<values.length;i++) {
			numbers[i] =  Integer.parseInt(values[i]);
		}
		return numbers;
	}
	//intȭ�� �迭 �� ���ϱ�
	private int sum(int[] numbers) {
		int sum =0;
		for(int number: numbers) {
			sum +=number;
		}
		return sum;
	}
	private int toPositive(String value) {
		int number = Integer.parseInt(value);
		if(number<0) {
			throw new RuntimeException();
		}
		return number;
	}
}
