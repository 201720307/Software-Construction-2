package shiyan22;

import java.util.Scanner;

public class Main {// 主函数
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		new Display();
		System.out.println("是否重新生成算式? Y/N ");
		int isOrNot = scanner.next().charAt(0);
		if (isOrNot == 'Y') {
			new Display();
		} else {
			System.out.println("测验结束");
		}
	}
}
 