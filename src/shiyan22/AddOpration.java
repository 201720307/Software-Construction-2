package shiyan22;

public class AddOpration extends Equation {
	public AddOpration() {// �ӷ���ʽ
		do {
			ldate = random.nextInt(101);
			rdate = random.nextInt(101);
			op = '+';
			value = ldate + rdate;
		} while (value > 100);// ��ΧԼ��
	}
}
 