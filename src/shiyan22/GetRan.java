package shiyan22;

public class GetRan extends Born {
	public GetRan() {// ����50�������ʽ
		for (int i = 0; i < 50; i++) {
			Equation ranOpration = new RanOpration().RanEq;
			while (construct(ranOpration, i)) {
				ranOpration = new RanOpration();
			}
			eqList[i] = ranOpration;// ֻҪ��������ʽû�ڵ�ǰ��ϰ���У��ͼ���β��
		}
	}
}
 