package shiyan22;

public class AddOpration extends Equation {
	public AddOpration() {// 加法算式
		do {
			ldate = random.nextInt(101);
			rdate = random.nextInt(101);
			op = '+';
			value = ldate + rdate;
		} while (value > 100);// 范围约束
	}
}
 