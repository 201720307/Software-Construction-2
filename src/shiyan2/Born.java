package shiyan2;

import java.util.Scanner;

public class Born {//ϰ���࣬����50��ϰ��
	private Scanner sc=new Scanner(System.in);
	Equation eqList[] = new Equation[50];
	//����50�������ʽ
	public void getRan() {
		for (int i = 0; i < 50; i++) {
			Equation equation = new Equation();
			equation.ranOpration();
			while (construct(equation, i)) {
				equation.addOpration();
			}
			eqList[i] = equation;//ֻҪ��������ʽû�ڵ�ǰ��ϰ���У��ͼ���β��
		}
	}
	//����50���ӷ���ʽ
	public void getAdd() {
		for (int i = 0; i < 50; i++) {
			Equation equation = new Equation();
			equation.addOpration();
			while (construct(equation, i)) {
				equation.addOpration();
			}
			eqList[i] = equation;//ֻҪ��������ʽû�ڵ�ǰ��ϰ���У��ͼ���β��
		}
	}
	//����50��������ʽ
	public void getSub() {
		for (int i = 0; i < 50; i++) {
			Equation equation = new Equation();
			equation.subOpration();
			while (construct(equation, i)) {
				equation.addOpration();
			}
			eqList[i] = equation;//ֻҪ��������ʽû�ڵ�ǰ��ϰ���У��ͼ���β��
		}
	}
	//����Ƿ��ظ�
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
	//��ӡ��ʽ
	public void printResult() {
		for (int i = 0; i < eqList.length; i++) {
			System.out.print((i + 1) + ": " + eqList[i] + "\t\t");
			if ((i + 1) % 5 == 0) {
				System.out.print("\n");
			}
		}
	}
	//ѡ�����
	public void Choose() {
		System.out.println("1��������50���ӷ���");
		System.out.println("2��������50��������");
		System.out.println("3�����������50����");
		System.out.println("��ѡ��������ʽ����");
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
		System.out.println("�Ƿ�����������ʽ? Y/N ");
		int  isOrNot=sc.next().charAt(0);
		if (isOrNot=='Y') {
			Choose();
		}
		else {
			System.out.println("�������");
		}
	}
}
 
