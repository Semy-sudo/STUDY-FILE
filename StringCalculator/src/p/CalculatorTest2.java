package p;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest2 {
	private Calculator cal;
	
	@Before
	public void setup() {
		cal = new Calculator();
	}
	
	@Test
	public void add_�����ϳ�() throws Exception {
		assertEquals(1, cal.add("1"));
	}
	@Test
	public void add_��ǥ������() throws Exception {
		assertEquals(3, cal.add("1,2"));
	}
	@Test
	public void add_�ݷб�����() throws Exception {
		assertEquals(6, cal.add("1,2:3"));
	}
	@Test
	public void add_Ŀ���ұ�����() throws Exception {
		assertEquals(6, cal.add("//;\n1;2;3"));
	}
	@Test
	public void add_negative() throws Exception {
		cal.add("-1,2,3");
	}

}
