package day10_ClassVariable;

public class Ex03_MainClass {

	public static void main(String[] args) {
		/*
		 클래스 변수(static)
		 -프로그램 동작시 생성(메모리에 올라갈때)
		 -모든 곳에서 사용가능
		 인스턴스(객체)변수
		 -인스턴스가 생성될 때(new 만났을때)
		 지역변수
		 -특정 범위에서 생성될 때
		 -해당 범위에서만 사용가능
		 -해당 범위에 종속되어 있는 곳까지 사용 가능
		 */
		Ex03_Variable ex = new Ex03_Variable();
		int a = ex.variable01();
		ex.variable02(a);
		
				
	} 

}
