package shiyan22;

import java.util.Scanner;

public class Display {
	private Scanner sc = new Scanner(System.in);
	public Display() {
		{
			System.out.println("1——生成50道加法题");
			System.out.println("2——生成50道减法题");
			System.out.println("3——随机生成50道题");
			System.out.println("请选择生成算式类型");
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
