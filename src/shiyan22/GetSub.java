package shiyan22;

public class GetSub extends Born {
	public GetSub() {// ����50��������ʽ
		for (int i = 0; i < 50; i++) {
			SubOpration subOpration = new SubOpration();
			while (construct(subOpration, i)) {
				subOpration = new SubOpration();
			}
			eqList[i] = subOpration;// ֻҪ��������ʽû�ڵ�ǰ��ϰ���У��ͼ���β��
		}
	}
}
