package shiyan22;

public class Born {// ����50����ʽ����
	Equation eqList[] = new Equation[50];

	// ����Ƿ��ظ�
	public boolean construct(Equation eq, int length) {
		boolean tag = false;
		for (int i = 0; i < length; i++) {
			if (eq.equals(eqList[i])) {// ����ظ��ͷ�����ֵ
				tag = true;
				break;
			}
		}
		return tag;
	}

	// ��ӡ���
	public void printResult() {
		for (int i = 0; i < eqList.length; i++) {
			System.out.print((i + 1) + ": " + eqList[i].toStringResult() + "\t\t");
			if ((i + 1) % 5 == 0) {
				System.out.print("\n");
			}
		}
	}
}
