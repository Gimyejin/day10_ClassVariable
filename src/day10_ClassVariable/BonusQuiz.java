package day10_ClassVariable;

public class BonusQuiz {

	public static void main(String[] args) {
		//�ζ� ���α׷��� ������(1~45���� 6���� �ߺ����� �ʴ� ����)
		//ArrayList���
		BonusQuiz_method method = new BonusQuiz_method();
		System.out.println(method.lotto());
		
		//Hashset���
		System.out.println(method.lotto2());
	}

}
