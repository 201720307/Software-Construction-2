package shiyan22;

public class GetRan extends Born {
	public GetRan() {// 产生50个随机算式
		for (int i = 0; i < 50; i++) {
			Equation ranOpration = new RanOpration().RanEq;
			while (construct(ranOpration, i)) {
				ranOpration = new RanOpration();
			}
			eqList[i] = ranOpration;// 只要产生的算式没在当前练习题中，就加入尾部
		}
	}
}
 