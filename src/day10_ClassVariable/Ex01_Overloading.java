package day10_ClassVariable;

public class Ex01_Overloading {

	public static void main(String[] args) {
		/*
		 �����ε�
		 -�޼ҵ��� �̸��� �����ϰ� ����� ��
		 -�̸��� ���� ������ ���� �ٸ� �޼ҵ�� �ν��ϱ� ���ؼ��� �Ű������� ������
		  Ÿ��(�ڷ���)�� �޶���Ѵ�
		 -
		 */

		Ex01_Class01 ex = new Ex01_Class01();
		System.out.println(ex.sumFunc(10, 20));
		System.out.println(ex.sumFunc(10.0, 20.0));
		System.out.println(ex.SumFunc("10", "20"));
	}

}
