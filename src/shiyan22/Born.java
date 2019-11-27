package shiyan22;

public class Born {// 产生50个算式父类
	Equation eqList[] = new Equation[50];

	// 检查是否重复
	public boolean construct(Equation eq, int length) {
		boolean tag = false;
		for (int i = 0; i < length; i++) {
			if (eq.equals(eqList[i])) {// 如果重复就返回真值
				tag = true;
				break;
			}
		}
		return tag;
	}

	// 打印结果
	public void printResult() {
		for (int i = 0; i < eqList.length; i++) {
			System.out.print((i + 1) + ": " + eqList[i].toStringResult() + "\t\t");
			if ((i + 1) % 5 == 0) {
				System.out.print("\n");
			}
		}
	}
}
