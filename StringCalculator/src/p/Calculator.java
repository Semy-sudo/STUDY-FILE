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
	//,기준으로 쪼개기
	public String[] split(String text) {
		Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
		if(m.find()) {
			String customDelimeter = m.group(1);
			return m.group(2).split(customDelimeter);
		}
		
		return text.split(",|:");
	}
	
	//String 배열 int 배열로 바꾸기
	public int[] toInt(String[] values) {
		int[] numbers = new int[values.length];
		for(int i=0;i<values.length;i++) {
			numbers[i] =  Integer.parseInt(values[i]);
		}
		return numbers;
	}
	//int화된 배열 합 구하기
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
