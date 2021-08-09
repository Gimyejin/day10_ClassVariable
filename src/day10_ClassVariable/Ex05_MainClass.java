package day10_ClassVariable;

public class Ex05_MainClass {

	public static void main(String[] args) {
		//Ex05_Variable.cnt = 888; 
		//에러남 , new를 하지 않아서 아직 cnt가 만들어지지 않음
		
		/*
		Ex05_Variable ex = new Ex05_Variable();
		ex.cnt=888;
		*/
		Ex05_Variable.cnt = 888; 
		System.out.println(Ex05_Variable.cnt);
		Ex05_Variable.func();
	} 

}
