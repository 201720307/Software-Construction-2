package shiyan22;

public class GetAdd extends Born {
	public GetAdd() {// 生成50个加法算式
		for (int i = 0; i < 50; i++) {
			AddOpration addOpration = new AddOpration();
			while (construct(addOpration, i)) {
				addOpration = new AddOpration();
			}
			eqList[i] = addOpration;// 只要产生的算式没在当前练习题中，就加入尾部
		}
	}
} 