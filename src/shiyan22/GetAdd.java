package shiyan22;

public class GetAdd extends Born {
	public GetAdd() {// ����50���ӷ���ʽ
		for (int i = 0; i < 50; i++) {
			AddOpration addOpration = new AddOpration();
			while (construct(addOpration, i)) {
				addOpration = new AddOpration();
			}
			eqList[i] = addOpration;// ֻҪ��������ʽû�ڵ�ǰ��ϰ���У��ͼ���β��
		}
	}
} 