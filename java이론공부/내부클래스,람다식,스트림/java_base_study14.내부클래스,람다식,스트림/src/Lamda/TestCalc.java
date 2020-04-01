package Lamda;
//1.final2.익명클래스3.람다식4.함수적인터페이스
//5.
public class TestCalc {

	public static void main(String[] args) {
		Calc cal = (x,y) ->  x+y ;
		System.out.println(cal.getMax(10,20));
	}

}
