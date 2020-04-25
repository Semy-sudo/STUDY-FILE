package CalTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Cal.StringCalculator;

class StringCalTest {

	
	@Test
	public void testadd() throws Exception {
		StringCalculator scal = new StringCalculator();
		//int res = scal.add("//;\n1;2;3");
		int res2 = scal.add("//1;2;3");
		//assertEquals(6, res);
		assertEquals(6, res2);
	}

}
