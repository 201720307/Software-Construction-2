package shiyan22;

import java.util.Scanner;

public class Main {// ������
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		new Display();
		System.out.println("�Ƿ�����������ʽ? Y/N ");
		int isOrNot = scanner.next().charAt(0);
		if (isOrNot == 'Y') {
			new Display();
		} else {
			System.out.println("�������");
		}
	}
}
 