package day10_ClassVariable;

public class BonusQuiz {

	public static void main(String[] args) {
		//로또 프로그렘을 만들어라(1~45까지 6개의 중복되지 않는 숫자)
		//ArrayList방식
		BonusQuiz_method method = new BonusQuiz_method();
		System.out.println(method.lotto());
		
		//Hashset방식
		System.out.println(method.lotto2());
	}

}
