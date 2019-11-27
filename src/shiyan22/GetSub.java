package shiyan22;

public class GetSub extends Born {
	public GetSub() {// 产生50个减法算式
		for (int i = 0; i < 50; i++) {
			SubOpration subOpration = new SubOpration();
			while (construct(subOpration, i)) {
				subOpration = new SubOpration();
			}
			eqList[i] = subOpration;// 只要产生的算式没在当前练习题中，就加入尾部
		}
	}
}
