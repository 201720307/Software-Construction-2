package shiyan22;

public class SubOpration extends Equation {
	public SubOpration() {//������ʽ
		do {
			ldate = random.nextInt(101);
			rdate = random.nextInt(101);
			op = '-';
			value = ldate - rdate;
		} while (value < 0);// ��ΧԼ��
	}
}
 