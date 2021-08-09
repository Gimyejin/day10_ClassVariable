package day10_ClassVariable;

public class Ex01_Overloading {

	public static void main(String[] args) {
		/*
		 오버로딩
		 -메소드의 이름을 동일하게 만드는 것
		 -이름이 같기 때문에 서로 다른 메소드로 인식하기 위해서는 매개변수의 개수나
		  타입(자료형)이 달라야한다
		 -
		 */

		Ex01_Class01 ex = new Ex01_Class01();
		System.out.println(ex.sumFunc(10, 20));
		System.out.println(ex.sumFunc(10.0, 20.0));
		System.out.println(ex.SumFunc("10", "20"));
	}

}
