package day10_ClassVariable;

import java.util.Scanner;

public class Quiz1_Main {

	public static void main(String[] args) {
		Quiz_method quiz = new Quiz_method();

		while (true) {
			System.out.println("=== UP & Down ===");
			System.out.println("  1. ���ӽ���");
			System.out.println("  2. ��������");
			System.out.println("  3. ��������");
			switch (quiz.input()) {
			case 1:
				quiz.check1();

				break;
			case 2:
				if(quiz.check2() !=0)
					System.out.println("�ְ� ������ " + quiz.check2() + "ȸ �Դϴ�!");
				break;
			case 3:
				quiz.check3();
				break;
			}

		}

	}

}
