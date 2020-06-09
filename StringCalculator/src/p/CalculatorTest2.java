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
	public void add_숫자하나() throws Exception {
		assertEquals(1, cal.add("1"));
	}
	@Test
	public void add_쉼표구분자() throws Exception {
		assertEquals(3, cal.add("1,2"));
	}
	@Test
	public void add_콜론구분자() throws Exception {
		assertEquals(6, cal.add("1,2:3"));
	}
	@Test
	public void add_커스텀구분자() throws Exception {
		assertEquals(6, cal.add("//;\n1;2;3"));
	}
	@Test
	public void add_negative() throws Exception {
		cal.add("-1,2,3");
	}

}
