package shiyan22;

import java.util.Scanner;

public class Display {
	private Scanner sc = new Scanner(System.in);
	public Display() {
		{
			System.out.println("1��������50���ӷ���");
			System.out.println("2��������50��������");
			System.out.println("3�����������50����");
			System.out.println("��ѡ��������ʽ����");
			int i = sc.nextInt();
			switch (i) {
			case 1:
				GetAdd getAdd = new GetAdd();
				getAdd.printResult();
				break;
			case 2:
				GetSub getSub = new GetSub();
				getSub.printResult();
				break;
			case 3:
				GetRan getRan = new GetRan();
				getRan.printResult();
				break;
			default:
				break;
			}
		}
	}
}
