package shiyan22;

import java.util.Random;

public abstract class Equation {// ��ʽ����
	public Random random = new Random();
	public int ldate;
	public int rdate;
	public char op;
	public int value;

	// ������ʽ�ַ���
	public String toStringResult() {
		return "" + ldate + op + rdate + "=" + value;
	}
}

 