package day10_ClassVariable;

import java.util.Scanner;

public class Quiz1_Main {

	public static void main(String[] args) {
		Quiz_method quiz = new Quiz_method();

		while (true) {
			System.out.println("=== UP & Down ===");
			System.out.println("  1. 게임시작");
			System.out.println("  2. 게임전적");
			System.out.println("  3. 게임종료");
			switch (quiz.input()) {
			case 1:
				quiz.check1();

				break;
			case 2:
				if(quiz.check2() !=0)
					System.out.println("최고 점수는 " + quiz.check2() + "회 입니다!");
				break;
			case 3:
				quiz.check3();
				break;
			}

		}

	}

}
