package day10_ClassVariable;

import java.util.Scanner;

public class Quiz_method {
	Scanner input = new Scanner(System.in);
	int count ;
	int min = 0;
	int ran = 0;

	public int input() {
		int num = input.nextInt();
		return num;
	}

	public void check1() {
		count =0;
		ran = (int) (Math.random() * 99) + 1;
		System.out.println("���� ����: " + ran);
		while (true) {
			count++;
			System.out.print("Input Number -->");
			int num = input.nextInt();
			if (num > ran)
				System.out.println("~~~ Down ~~~");
			else if (num < ran)
				System.out.println("~~~ UP ~~~");
			else {
				System.out.println(count + "ȸ ���� ������ϴ�.");
				if (check2() == count)
					System.out.println("�ְ� ����� �����ϼ̽��ϴ�.");
				break;
			}

		}
	}

	public int check2() {
		if (count == 0)
			System.out.println("������ �������ּ���.");
		if (min == 0)
			min = count;
		if (min > count) {
			min = count;
		}
		return min;
	}

	public void check3() {
		System.exit(1);
	}
}
