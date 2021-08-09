package day10_ClassVariable;

public class Ex04_MainClass {

	public static void main(String[] args) {
		Ex04_Variable ex = new Ex04_Variable();
		ex.cnt =121345;//지금 public이니깐 외부에서 수정가능
		ex.func01();
		ex.func02();
				
	} 

}
