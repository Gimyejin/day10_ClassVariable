package day10_ClassVariable;

public class Ex04_Variable {
	public int cnt = 10;//new가 만들어질때 이 변수가 만들어짐
	public void func01() {
		cnt ++;
		System.out.println("01 cnt: "+cnt);
	}public void func02() {
		cnt ++;
		System.out.println("02 cnt: "+cnt);
	}
	

}
