package com.calculator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

//���ڿ� ����
//���ڸ� �����ڷ� �и��� ��, �� ������ ���� ���� ��ȯ
public class CalculatorTest {
	private Calculator cal;

	@Before
	public void setup() {
		cal = new Calculator();
		System.out.println("before");
	}
	
	@Test 
	public void oneadd(){
		assertEquals(6,cal.oneadd("1,2,3")); // - 1 - 2 3
		System.out.println("oneadd");
	}
	
	@Test
	public void mixadd(){
		assertEquals(6,cal.mixadd("1,2;3"));
		System.out.println("mixadd");
	}
	
	@Test
	public void anotheradd(){
		assertEquals(6,cal.anotheradd("//;\n1;2;3"));
		System.out.println("anotheradd");
	}
	

	@After
	public void teardown() {
		System.out.println("teardown");
	}
	
	
	
}



