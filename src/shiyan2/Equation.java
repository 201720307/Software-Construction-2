package shiyan2;

import java.util.Random;

public class Equation {//��ʽ�࣬������ʽ
	
	private Random random=new Random();
	private int ldate;
	private int rdate;
	private char   op;
	private int value;
	
	//���
	public void ranOpration() {
		int a = random.nextInt(2);
		if (a == 0) {
			addOpration();
		}	
		else {
			subOpration();
		}
	}
	
	//�ӷ�
	public void addOpration() {
		do {
			ldate = random.nextInt(101);
			rdate = random.nextInt(101);
			op	  = '+';
			value = ldate+rdate;
		} while (value>100);
	}
	
	//����
	public void subOpration() {
		do {
			ldate = random.nextInt(101);
			rdate = random.nextInt(101);
			op	  = '-';
			value = ldate-rdate;
		} while (value<0);
	}
	 
	//�ַ�����ʽ������ʽ
	public String toString() {
		return "" + ldate + op + rdate + "=" + value;
	}

}
