package shiyan2;

import java.util.Scanner;

public class Born {//习题类，产生50道习题
	private Scanner sc=new Scanner(System.in);
	Equation eqList[] = new Equation[50];
	//生成50个随机算式
	public void getRan() {
		for (int i = 0; i < 50; i++) {
			Equation equation = new Equation();
			equation.ranOpration();
			while (construct(equation, i)) {
				equation.addOpration();
			}
			eqList[i] = equation;//只要产生的算式没在当前练习题中，就加入尾部
		}
	}
	//生成50个加法算式
	public void getAdd() {
		for (int i = 0; i < 50; i++) {
			Equation equation = new Equation();
			equation.addOpration();
			while (construct(equation, i)) {
				equation.addOpration();
			}
			eqList[i] = equation;//只要产生的算式没在当前练习题中，就加入尾部
		}
	}
	//生成50个减法算式
	public void getSub() {
		for (int i = 0; i < 50; i++) {
			Equation equation = new Equation();
			equation.subOpration();
			while (construct(equation, i)) {
				equation.addOpration();
			}
			eqList[i] = equation;//只要产生的算式没在当前练习题中，就加入尾部
		}
	}
	//检查是否重复
	private boolean construct(Equation eq, int length) {
		boolean tag = false;
		for (int i = 0; i < length; i++) {
			if (eq.equals(eqList[i])) {
				tag = true;
				break;
			}
		}
		return tag;
	}
	//打印算式
	public void printResult() {
		for (int i = 0; i < eqList.length; i++) {
			System.out.print((i + 1) + ": " + eqList[i] + "\t\t");
			if ((i + 1) % 5 == 0) {
				System.out.print("\n");
			}
		}
	}
	//选择界面
	public void Choose() {
		System.out.println("1——生成50道加法题");
		System.out.println("2——生成50道减法题");
		System.out.println("3——随机生成50道题");
		System.out.println("请选择生成算式类型");
		int i = sc.nextInt();
		switch (i){
		case 1:
			getAdd();
			break;
		case 2:
			getSub();
			break;
		case 3:
			getRan();
			break;
		default:
			break;
		}
		printResult();
		System.out.println("是否重新生成算式? Y/N ");
		int  isOrNot=sc.next().charAt(0);
		if (isOrNot=='Y') {
			Choose();
		}
		else {
			System.out.println("测验结束");
		}
	}
}
 
